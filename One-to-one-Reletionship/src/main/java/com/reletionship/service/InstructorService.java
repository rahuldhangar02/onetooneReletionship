package com.reletionship.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reletionship.model.Instructor;
import com.reletionship.repository.InstructorDetailsRepository;
import com.reletionship.repository.InstructorRepository;

@Service
public class InstructorService {

	@Autowired
	private InstructorRepository insRepo;
	
	@Autowired
	private InstructorDetailsRepository insDetailsRepo;
	
	// step first-1 Save Data
	public Instructor saveIns(Instructor ins)
	{
		return insRepo.save(ins);
	}
	
	// list Data
	public List<Instructor> listInstructor()
	{
		return insRepo.findAll();
	}
	// get Another list
	public List<Instructor> getAllInstructor()
	{
		return insRepo.getAllInsDetails();
	}
	
	
	// get instructor by id
	
	public Optional<Instructor> getInstructor(int id)
	{
		return insRepo.findById(id);
	}
	
	//
	public void deleteInstructor(int id)
	{
		insRepo.deleteById(id);
	}
	
}
