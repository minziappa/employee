package io.employee.service.impl;

import io.employee.bean.ExtendEmployeeUser;
import io.employee.bean.model.EmployeeUser;
import io.employee.dao.SlaveDao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	@Autowired
	private SqlSession slaveDao;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		ExtendEmployeeUser extendEmployeeUser = null;
		EmployeeUser employeeUser = null;

		try {
			logger.info("UserDetailsService >> userId >> " + userName);

			// Get a user information form DB.
			Map<String, Object> mapSelect = new HashMap<String, Object>();
			mapSelect.put("userName", userName);

			try {
				employeeUser = slaveDao.getMapper(SlaveDao.class).selectEmployeeUser(mapSelect);
			} catch (Exception e) {
				logger.error("Exception error", e);
			}

			if(employeeUser == null) {
				throw new UsernameNotFoundException( userName + " is not found." );
			}

	        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	        // For java1.6
	        switch(Integer.valueOf(employeeUser.getUserStatus())) {
	            case 1:
	                authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
	                authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
	            break;
	            default:
	                authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
	            break;
	        }

	        boolean enabled = true;
	        boolean accountNonExpired = true;
	        boolean credentialsNonExpired = true;
	        boolean accountNonLocked = true;

	        extendEmployeeUser = new ExtendEmployeeUser(employeeUser.getUserNameFirst() + employeeUser.getUserNameLast(), 
	        		passwordEncoder.encode("test"), enabled, accountNonExpired, credentialsNonExpired, 
	        		accountNonLocked, authorities, employeeUser);

		} catch (Exception e) {
			logger.error("Select error, userName={}, userStatus={}", 
					employeeUser.getUserNameFirst() + employeeUser.getUserNameLast(), employeeUser.getUserStatus());
			logger.error("Exception >> ", e);
		}

		return extendEmployeeUser;
	}

}
