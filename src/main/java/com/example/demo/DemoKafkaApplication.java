package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.document.Applicant;
import com.example.demo.repository.ApplicantRepository;
import com.example.demo.streams.ApplicantsPublisher;

@SpringBootApplication
public class DemoKafkaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoKafkaApplication.class, args);
    }


    @Autowired
    ApplicantsPublisher applicantsPublisher;
    @Autowired
    ApplicantRepository applicantRepository;

    @Override
    public void run(String... args) throws Exception {

        Applicant applicant = new Applicant();
        applicant.setId(1);
        applicant.setEmail("yanxuehe7@gmail.com");
        applicant.setCreditcardType("VISA");
        applicant.setEmiratesId("784-1234-1234567-1");
        applicant.setExpiryDate("");
        applicant.setLocation("Dubai");
        applicant.setFirstName("Ym");
        applicant.setLastName("Sam");
        applicant.setNationality("CHN");
        applicant.setSalary("10000");
        applicant.setMobileNumber("0563295396");

        
        applicantsPublisher.sendApplicant(applicant);

    }
}