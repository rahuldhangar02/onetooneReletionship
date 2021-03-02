package com.reletionship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reletionship.model.Instructor;
import com.reletionship.model.InstructorDetails;
import com.reletionship.repository.InstructorDetailsRepository;
import com.reletionship.repository.InstructorRepository;

@SpringBootApplication
public class OneToOneReletionshipApplication implements CommandLineRunner {

	@Autowired
	private InstructorRepository insRepo;
	
	@Autowired
	private InstructorDetailsRepository insDetailsRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneReletionshipApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		//save Data
		
		Instructor i1=new Instructor("Rahul Kumar","Dhangar","rahul@gmail.com");
		
		InstructorDetails ins=new InstructorDetails("xyz.com","Playing Cricket");
		
	     i1.setInsdetails(ins);
		
		insRepo.save(i1);
		
		System.out.println("Data Saved Sucessfully...");
		
		 // delete Records..
		/*
		int id=1;
		//Instructor instructorid=insRepo.findById(id).get();
		InstructorDetails insdetails=insDetailsRepo.findById(id).get();
		if(insdetails!=null)
		{
			insDetailsRepo.delete(insdetails);
			 insdetails.getInstructor().setInsdetails(null);
			 insDetailsRepo.delete(insdetails);
			System.out.println("Data Deleted");
		}
	
		*/
		
	}

}
