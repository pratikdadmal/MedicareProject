package com.medicare.healthcare.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.healthcare.model.UserRegistration;
import com.medicare.healthcare.service.User_Registration_service;


@RestController
@Scope("request")
public class User_Registration_controller {
	
	@Autowired
	private User_Registration_service user_registration_service;
	
//	Save Users
	@PostMapping(value="/saveadmin")
	public String saveUserreg(@RequestBody UserRegistration userregistration)
	{
		user_registration_service.saveUsers(userregistration);
		return "Registred Successfull...";
	}
	
//	login check for users
	@GetMapping(value="/userlogin")
	public HashMap getUserLogin(@RequestBody UserRegistration userregistration)
	{
		HashMap hm = user_registration_service.userLoginCheck(userregistration.getEmail(),userregistration.getUsr_password());
	    return hm;
	}
	
//	login check for admin
	
	@GetMapping(value="/adminlogin")
	public HashMap getAdminLogin(@RequestBody UserRegistration userregistration)
	{
		HashMap hm = user_registration_service.adminLoginCheck(userregistration.getEmail(),userregistration.getUsr_password(),userregistration.getUsr_role());
	    return hm;
	}
	
//	Get ALL Users
	@GetMapping(value="/getusers")
	public List<UserRegistration> getAllUsers()
	{
		return user_registration_service.getUsers();
	}
	
//	Get User By ID
	@GetMapping(value="/getUserById/{usr_Id}")
	public Optional<UserRegistration> getUserbyID(@PathVariable("usr_Id") int usr_Id)
	{
		return user_registration_service.getUserByID(usr_Id);
	}
	
	
//	Delete User By ID
	@DeleteMapping(value="/deleteuser/{usr_Id}")
	public void deleteUserById(@PathVariable("usr_Id") int usr_Id)
	{
		user_registration_service.deleteUsers(usr_Id);
	}
	
//	Update User Admin
	@PutMapping(value="/updates/{usr_Id}")
	public ResponseEntity<Integer> updatesAdmin(@PathVariable("usr_Id") int usr_Id, @RequestBody UserRegistration userregistration)
	{
		List<UserRegistration> updateUserAdmin = user_registration_service.updatesUserAdminById(usr_Id,userregistration);
		if(updateUserAdmin != null)
		{
			//return ResponseEntity.notFound().build();
			userregistration.setUsr_Id(userregistration.getUsr_Id());
			userregistration.setDob(userregistration.getDob());
			userregistration.setEmail(userregistration.getEmail());
			userregistration.setFirst_Name(userregistration.getFirst_Name());
			userregistration.setGender(userregistration.getGender());
			userregistration.setLast_Name(userregistration.getLast_Name());
			userregistration.setUsr_password(userregistration.getUsr_password());
			userregistration.setUsr_role(userregistration.getUsr_role());
		}

		return ResponseEntity.ok().body(usr_Id);
	}
	
// Change Password
	@PutMapping(value="/changepassword/{usr_Id}")
	public ResponseEntity<Integer> changePassword(@PathVariable("usr_Id") int usr_Id, @RequestBody UserRegistration userregistration)
	{
		List<UserRegistration> updateUserAdmin = user_registration_service.changePasswordById(usr_Id,userregistration);
		if(updateUserAdmin != null)
		{
			userregistration.setUsr_password(userregistration.getUsr_password());
		}
		return ResponseEntity.ok().body(usr_Id);
	}
}
