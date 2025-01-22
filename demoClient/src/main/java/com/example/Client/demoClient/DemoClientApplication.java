package com.example.Client.demoClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.Client.demoClient.Model.Dao.ServiceImpl.CDao;

@SpringBootApplication
public class DemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoClientApplication.class, args);
	}
@Bean
public RestTemplate restTemplate()
{
//	RestTemplate rest=new RestTemplateBuilder()
//			.basicAuthentication("mohan@gmail.com", "Admin#123").build();
//	return rest;
return new RestTemplate();
}
@Bean
public CDao cdao()
{
	return new CDao();
	}
}
