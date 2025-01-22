package com.example.Client.demoClient.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Client.demoClient.Model.Dao.ServiceImpl.CDao;
import com.example.Client.demoClient.Model.Dao.Services.IDao;
import com.example.Client.demoClient.Model.Pojo.Login;

@Controller
public class ClientController {
	@Autowired
	IDao cdao;
@RequestMapping("/users")
public String Users()
{
	return "getUser";
}
@RequestMapping("/getusers")
public String getUsers(Model M)
{
	
	Login[] L=cdao.getUser();
	System.out.println(L.length+ " Controller");
	System.out.println(L[0].getEmail()+ " "+L[0].getRoles());
	M.addAttribute("logins",cdao.getUser());
	
	return "getUser";
}
@RequestMapping("create")
public String Create()
{
 return "create";	
}
@RequestMapping("CreateUser")
public String CreateUser(@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("roles") String roles,Model M)
{
	Login L=new Login(email, password, roles);
	M.addAttribute("S",cdao.CreateUser(L));
	return "create";
}

}
