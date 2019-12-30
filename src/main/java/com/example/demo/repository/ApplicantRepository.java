package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.document.Applicant;


public interface ApplicantRepository extends MongoRepository<Applicant, Integer> {

	
}
