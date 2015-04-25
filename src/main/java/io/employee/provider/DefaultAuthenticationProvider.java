package io.employee.provider;

import io.employee.bean.ExtendUser;
import io.employee.bean.model.admin.ManagementAdmin;
import io.employee.dao.AdminSlaveDao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class DefaultAuthenticationProvider implements AuthenticationProvider {

	final Logger logger = LoggerFactory.getLogger(DefaultAuthenticationProvider.class);
	@Autowired
	private SqlSession adminSlaveDao;
	@Autowired
	private Md5PasswordEncoder passwordEncoder;

	@Override
	public Authentication authenticate(Authentication authentication)
		throws AuthenticationException {

		Object adminId = authentication.getPrincipal();
		Object adminPwd = authentication.getCredentials();

		UsernamePasswordAuthenticationToken upat = null;
		ExtendUser<ManagementAdmin> admin = null;
		ManagementAdmin managementAdmin = null;

		try {
			logger.info("getPrincipal >> ID >1> " + adminId);
			logger.info("getCredentials >> Password >2> " + adminPwd);

			/////////////// You can make another authentication/////////////

			
			// Get a user information form DB.
			Map<String, Object> mapSelect = new HashMap<String, Object>();
			mapSelect.put("adminName", adminId);

	        logger.info("pass>>>" + passwordEncoder.encodePassword(adminPwd.toString(), null));

			try {
				managementAdmin = adminSlaveDao.getMapper(AdminSlaveDao.class).selectAdmin(mapSelect);
			} catch (Exception e) {
				logger.error("Exception error", e);
			}

			if(managementAdmin == null) {
				throw new UsernameNotFoundException( adminId + " is not found." );
			}

	        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	        // For java1.6
	        switch(Integer.valueOf(managementAdmin.getAdminStatus())) {
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

	        admin = new ExtendUser<ManagementAdmin>(managementAdmin.getAdminName(),  passwordEncoder.encodePassword(adminPwd.toString(), null), enabled, 
	        		accountNonExpired, credentialsNonExpired, accountNonLocked, authorities, managementAdmin);

	        upat = new UsernamePasswordAuthenticationToken(admin, passwordEncoder.encodePassword(adminPwd.toString(), null), authorities);
	        upat.setDetails(authentication.getDetails());

		} catch (Exception e) {
			logger.error("Select error, userName={}, userStatus={}", managementAdmin.getAdminName(), managementAdmin.getAdminStatus());
			logger.error("Exception >> ", e);
		}

		return upat;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}