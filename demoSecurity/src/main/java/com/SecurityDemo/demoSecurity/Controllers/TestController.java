package com.SecurityDemo.demoSecurity.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@GetMapping("/")
public String GetTest()
{
	return "Test Controller Default";
}
}
