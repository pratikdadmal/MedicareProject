package com.medicare.healthcare.IUser_Registration;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.healthcare.model.UserRegistration;

@Repository
public interface IUser_Registration_repo extends JpaRepository<UserRegistration, Integer>{

	//public UserRegistration userLogin(String email, String usr_password);

//	public String findAll(String email, String usr_password, String role);

//	public UserRegistration findAll(String email, String usr_password);

	//public List<UserRegistration> findAllById(int usr_Id);
	

}
