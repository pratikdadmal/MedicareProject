package com.medicare.healthcare.service;


import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicare.healthcare.IUser_Registration.IUser_Registration_repo;
import com.medicare.healthcare.model.UserRegistration;

@Service
@Scope("singleton")
public class User_Registration_service {
	
	@Autowired
	private IUser_Registration_repo iuser_registration_repo;
	
// Save all Users
	public String saveUsers(UserRegistration userregistration)
	{
		iuser_registration_repo.save(userregistration);
		return "Registration Done";
	}
	
	// User Login Check
		public HashMap userLoginCheck(String email, String usr_password) {
			List<UserRegistration> userlog = iuser_registration_repo.findAll();
			
			HashMap hm = new HashMap();
		    if(userlog!=userlog)
		    {
		    	hm.put(userlog, "Valid User Login");
		    }
		    else
		    {
		    	hm.put(userlog, "Inalid User Login");
		    }
			return hm;
		}

			

//	login check for admin	
		public HashMap adminLoginCheck(String email, String usr_password, String usr_role) {
			List<UserRegistration> adminlog = iuser_registration_repo.findAll();
			
			HashMap hm = new HashMap();
		    if(adminlog!=adminlog)
		    {
		    	hm.put(adminlog, "Valid Admin Login");
		    }
		    else
		    {
		    	hm.put(adminlog, "Inalid Admin Login");
		    }
			return hm;
		}

	
	//find all users
	public List<UserRegistration> getUsers()
	{
		return iuser_registration_repo.findAll();
	}

	//find by id
	public Optional<UserRegistration> getUserByID(int usr_Id) 
	{
		return iuser_registration_repo.findById(usr_Id);
	}

// Delete Users
	public void deleteUsers(int usr_Id) {
		iuser_registration_repo.deleteById(usr_Id);	
	}

// Update Users Admin
	public List<UserRegistration> updatesUserAdminById(int usr_Id,UserRegistration userregistration) {
		iuser_registration_repo.save(userregistration);
		return null;

	}
// Change Password
	public List<UserRegistration> changePasswordById(int usr_Id, UserRegistration userregistration) {
		iuser_registration_repo.save(userregistration);
		return null;
	}



}
