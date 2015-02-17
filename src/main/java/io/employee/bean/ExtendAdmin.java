package io.employee.bean;

import io.employee.bean.model.admin.ManagementAdmin;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class ExtendAdmin extends User {

	private static final long serialVersionUID = 2086202300685821979L;

	ManagementAdmin managementAdmin;

	public ExtendAdmin(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities, ManagementAdmin managementAdmin) {

		super(username, password, enabled, accountNonExpired, credentialsNonExpired,
				accountNonLocked, authorities);

		// user information
		this.managementAdmin = managementAdmin;

	}

	public ManagementAdmin getManagementAdmin() {
		return managementAdmin;
	}

	public void setManagementAdmin(ManagementAdmin managementAdmin) {
		this.managementAdmin = managementAdmin;
	}


}
