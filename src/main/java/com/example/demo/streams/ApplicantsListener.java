package com.example.demo.streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.example.demo.document.Applicant;
import com.example.demo.mail.Mailer;
import com.example.demo.repository.ApplicantRepository;


@Component
public class ApplicantsListener {

    @Autowired
    Mailer mailer;
    @Autowired
    ApplicantRepository applicantRepository;

    @StreamListener(value = ApplicantsSteams.INPUT)
    public void handleApplicants(@Payload Applicant applicant) throws javax.mail.MessagingException {

    	System.out.println("+++++++++ COMING INTO ACCEPT MESSAGE");
        try {	
        	Applicant creditCard = (Applicant) applicantRepository.save(applicant);
        	  System.out.println(creditCard);
        	
            mailer.send(applicant);
        } catch (MessagingException e) {
            System.out.println(e);
        }
    }
}
