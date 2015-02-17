package io.employee.bean;

import io.employee.bean.model.EmployeeUser;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class ExtendEmployeeUser extends User {

	private static final long serialVersionUID = 2086202300685821979L;

	EmployeeUser employeeUser;

	public ExtendEmployeeUser(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities, EmployeeUser employeeUser) {

		super(username, password, enabled, accountNonExpired, credentialsNonExpired,
				accountNonLocked, authorities);

		// user information
		this.employeeUser = employeeUser;

	}

	public EmployeeUser getEmployeeUser() {
		return employeeUser;
	}

	public void setEmployeeUser(EmployeeUser employeeUser) {
		this.employeeUser = employeeUser;
	}

}
