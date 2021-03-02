package com.reletionship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reletionship.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Integer>  {

	
	@Query("from Instructor i")
	public List<Instructor> getAllInsDetails();
	
}
