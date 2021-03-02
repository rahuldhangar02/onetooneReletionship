package com.reletionship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reletionship.model.InstructorDetails;

@Repository
public interface InstructorDetailsRepository extends JpaRepository<InstructorDetails,Integer> {

}
