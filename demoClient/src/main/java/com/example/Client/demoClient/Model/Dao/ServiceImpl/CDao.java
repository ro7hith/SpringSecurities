package com.example.Client.demoClient.Model.Dao.ServiceImpl;


import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Client.demoClient.restUrls;
import com.example.Client.demoClient.Model.Dao.Services.IDao;
import com.example.Client.demoClient.Model.Pojo.Login;
import com.example.Client.demoClient.Model.Pojo.Product;
@Service
public class CDao implements IDao {

	@Autowired
	RestTemplate restTemplate;
	@Override
	public Login[] getUser() {
		// TODO Auto-generated method stub
	//ResponseEntity<Login[]> logins=	restTemplate.exchange(restUrls.GET_USERS,HttpMethod.GET,null,Login[].class);
	//System.out.println(logins.getBody().length);
	//return logins.getBody();	
	
	HttpHeaders headers=new HttpHeaders();
	String auth="manoj@gmail.com" +":"+"Admin#123";
	byte[] encodedAuth=   Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
	System.out.println(encodedAuth + " Encode");
	headers.set("Authorization","Basic "+new String(encodedAuth));
	HttpEntity<String> entity=new HttpEntity<String>(headers);
	ResponseEntity<Login[]> logins=	restTemplate.exchange(restUrls.GET_USERS,HttpMethod.GET,entity,Login[].class);
	System.out.println(logins.getBody().length);
	return logins.getBody();	
	
	
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String CreateUser(Login L) {
			ResponseEntity<String> S=restTemplate.exchange(restUrls.CREATE_USER,HttpMethod.POST,new HttpEntity<>(L), String.class);
		
		return S.getBody();
	}

}
