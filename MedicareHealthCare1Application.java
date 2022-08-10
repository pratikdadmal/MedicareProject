package com.medicare.healthcare;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.medicare.healthcare.IUser_Registration.IUser_Registration_repo;
import com.medicare.healthcare.model.UserRegistration;

@SpringBootApplication
//@EnableJpaRepositories
@EnableJpaAuditing
public class MedicareHealthCare1Application {//implements CommandLineRunner

//	@Autowired
//	@Qualifier(value ="iuser_registration_repo")
//	IUser_Registration_repo iuser_registration_repo;
//	
	public static void main(String[] args) {
		SpringApplication.run(MedicareHealthCare1Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//	
//		iuser_registration_repo.save(new UserRegistration(1,"pratik","dadmal","m","pratik@gmail.com","1223","admin"));
//		
//	}

}
//UserRegistration(int usr_Id, String first_Name, String last_Name, String gender, Date dob, String email,
//		String usr_password, String usr_role)
