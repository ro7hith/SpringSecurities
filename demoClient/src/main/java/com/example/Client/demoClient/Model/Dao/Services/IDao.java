package com.example.Client.demoClient.Model.Dao.Services;

import java.util.List;

import com.example.Client.demoClient.Model.Pojo.Login;
import com.example.Client.demoClient.Model.Pojo.Product;

public interface IDao {
Login[] getUser();
Product[] getProducts();
String CreateUser(Login L);
	
}
