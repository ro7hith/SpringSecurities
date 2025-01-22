package com.SecurityDemo.demoSecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecurityDemo.demoSecurity.Model.pojo.OurProduct;


@Repository
public interface ProductRepo extends JpaRepository<OurProduct, Integer>
{

}
