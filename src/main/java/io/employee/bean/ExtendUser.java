package io.employee.bean;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class ExtendUser<T> extends User {

	private static final long serialVersionUID = 1L;

	private T user;

	public ExtendUser(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities, T user) {

		super(username, password, enabled, accountNonExpired, credentialsNonExpired,
				accountNonLocked, authorities);

		// user information
		this.user = user;
	}

	public T getUser() {
		return user;
	}

	public void setUser(T user) {
		this.user = user;
	}

}
