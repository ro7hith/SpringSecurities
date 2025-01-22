package com.SecurityDemo.demoSecurity.Config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.SecurityDemo.demoSecurity.Model.pojo.OurUsers;
import com.SecurityDemo.demoSecurity.repositories.UserRepo;
@Configuration
public class OurUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepo userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
			Optional<OurUsers>user	=userrepo.findByEmail(username);
			return user.map(OurUserDetails::new).orElseThrow(()->new UsernameNotFoundException("User not found"));
	}

}
