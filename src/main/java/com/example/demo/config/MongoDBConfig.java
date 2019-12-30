package com.example.demo.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.document.Applicant;
import com.example.demo.repository.ApplicantRepository;

//@EnableMongoRepositories(basePackageClasses=CreditCardRepository.class)
@EnableMongoRepositories(basePackages = "com.example.demo.repository")
//@Configuration
public class MongoDBConfig {

//	 @Bean
//	 CommandLineRunner  commandLineRunner(ApplicantRepository applicantRepository)
//	 {
//		 return strings->{
//			 applicantRepository.save(new Applicant("test"));
//
//			
//		};
//	 }

}
