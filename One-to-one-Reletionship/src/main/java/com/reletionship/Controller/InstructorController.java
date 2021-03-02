package com.reletionship.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.reletionship.model.Instructor;
import com.reletionship.service.InstructorService;





@RestController
public class InstructorController {

	@Autowired
	private InstructorService insService;
	
	
	// save instructor and Instructor Details
	@PostMapping("/saveInstructor")
	public ResponseEntity<Instructor> saveInstructor(@RequestBody Instructor ins)
	{
		Instructor instructor=insService.saveIns(ins);
		
		URI location=ServletUriComponentsBuilder
				     .fromCurrentContextPath()
				     .path("{/id}")
				     .buildAndExpand(instructor.getId()).toUri();
		return ResponseEntity.created(location).build();
            	}
	
    

    // list of instructor and instructor_det  pub
/// get All Data
	@GetMapping("/instructorlist")
	public ResponseEntity<List<Instructor>> getAllInstructor()
	{
		List<Instructor> list=insService.listInstructor();
		 return ResponseEntity.ok(list);
		
	}

  ///
	@GetMapping("/instructorlist1")
	public ResponseEntity<List<Instructor>> getAllInstructor1()
	{
		List<Instructor> list=insService.getAllInstructor();
		 return ResponseEntity.ok(list);
		
	}



 
 @DeleteMapping("del-instructor/{id}")
 public ResponseEntity<Void> delInstructor(@PathVariable("id") int id)
 {
	  
   	  insService.deleteInstructor(id);
   	  
	return  ResponseEntity.noContent().build();
 }
      
 }

     


