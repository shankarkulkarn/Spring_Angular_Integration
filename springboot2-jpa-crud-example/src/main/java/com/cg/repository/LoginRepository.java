package com.cg.repository;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.model.UserDetail;

@Repository
public interface LoginRepository extends JpaRepository<UserDetail,String>{

	//@Query("select e from UserDetail where userName=:name and userPass=:pass")
	//public  UserDetail findUserByNameAndPassword(@Param("name") String user,@Param("pass") String pass);
	
}
