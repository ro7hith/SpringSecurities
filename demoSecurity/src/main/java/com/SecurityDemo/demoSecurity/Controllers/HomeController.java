package com.SecurityDemo.demoSecurity.Controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SecurityDemo.demoSecurity.Model.UserService;
import com.SecurityDemo.demoSecurity.Model.pojo.OurProduct;
import com.SecurityDemo.demoSecurity.Model.pojo.OurUsers;
import com.SecurityDemo.demoSecurity.repositories.ProductRepo;
import com.SecurityDemo.demoSecurity.repositories.UserRepo;

import jakarta.servlet.http.HttpServletRequest;
//import com.SecurityDemo.demoSecurity.repositories.UserRepo;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	PasswordEncoder passwordEncoder;

	 @Autowired
	 UserRepo userrepo;
	 @Autowired
	 ProductRepo productrepo;
	@GetMapping("/")
	public String getSessionid(HttpServletRequest req) {
		return req.getSession().getId();
	}

	@GetMapping("/user")
	@PreAuthorize("hasAuthority('user')")
	public List<OurUsers> getUser() {
		return userrepo.findAll();
	}

	@GetMapping("/currentuser")
	@PreAuthorize("hasAuthority('user')")
	public String getusername(Principal p) {

		return p.getName();
	}
	@GetMapping("/getproducts")
	@PreAuthorize("hasAuthority('admin')")
	public List<OurProduct> getproducts() {

		return productrepo.findAll();
	}
	@PostMapping("/saveproducts")
	@PreAuthorize("hasAuthority('admin')")
	public ResponseEntity<String> saveproducts(@RequestBody OurProduct product) {

		productrepo.save(product);
		return ResponseEntity.ok("Product added");
	}

	
	@PostMapping("/user/save")
	public ResponseEntity<Object> InsertUser(@RequestBody OurUsers user) // Rohith mohan@123
	{
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userrepo.save(user);
		return ResponseEntity.ok("user saved");
	
	}

}
