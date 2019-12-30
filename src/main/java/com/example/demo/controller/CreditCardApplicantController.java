package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.document.Applicant;
import com.example.demo.repository.ApplicantRepository;
import com.example.demo.streams.ApplicantsPublisher;


@RestController
@RequestMapping("/mailer")
public class CreditCardApplicantController {
	
	@Autowired
	ApplicantRepository applicantRepository;
	@Autowired
	ApplicantsPublisher applicantsPublisher;
	
	
	@PostMapping("/applicants")
	public ResponseEntity<Applicant> createApplicant(@Valid @RequestBody Applicant cc) {
		
		
		applicantsPublisher.sendApplicant(cc);
		return ResponseEntity.ok(cc);
		
		
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(creditCard.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
	}
	
	
	
	@GetMapping("/applicants")
	public ResponseEntity<String> createApplicant1() {
		
		
//		applicantsPublisher.sendApplicant(cc);
		return ResponseEntity.ok("test");
		
		
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(creditCard.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
	}

}
