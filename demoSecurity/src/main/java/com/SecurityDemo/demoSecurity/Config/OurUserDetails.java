package com.SecurityDemo.demoSecurity.Config;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.SecurityDemo.demoSecurity.Model.pojo.OurUsers;

public class OurUserDetails implements UserDetails, Authentication 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private List<GrantedAuthority> roles;
	public OurUserDetails(OurUsers ourusers)
	{
		this.email=ourusers.getEmail();
		this.password=ourusers.getPassword();
		this.roles=Arrays.stream(ourusers.getRoles().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
	return this.roles;
	
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.email;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object getDetails() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}
	

}
