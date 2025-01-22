package com.SecurityDemo.demoSecurity.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SecurityDemo.demoSecurity.Model.pojo.OurUsers;
@Repository
public interface UserRepo extends JpaRepository<OurUsers, Integer>{
	//@Query(value="select * from ourusers where email=?1",nativeQuery = true)
	Optional<OurUsers>	findByEmail(String email);
}
