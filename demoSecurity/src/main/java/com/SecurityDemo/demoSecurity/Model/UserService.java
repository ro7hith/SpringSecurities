package com.SecurityDemo.demoSecurity.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SecurityDemo.demoSecurity.Model.pojo.OurUsers;

@Service
public class UserService {
private List<OurUsers> store=new ArrayList<OurUsers>();
public UserService()
{
	store.add(new OurUsers("manoj@gmail.com","manoj","ADMIN"));
	store.add(new OurUsers("rohit@gmail.com","rohit","USER"));
}
public List<OurUsers> getUser()
{
	return this.store;
}
}
