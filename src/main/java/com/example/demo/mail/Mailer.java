package com.example.demo.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.example.demo.document.Applicant;

@Component
public class Mailer {

    @Autowired
    private JavaMailSender javaMailSender;

    public void send(Applicant applicant) throws MessagingException {

        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setFrom("sunwstorm@126.com");
        helper.setTo("sunbfeng@cn.ibm.com");
        helper.setCc("sunwstorm@126.com");
        helper.setSubject("You applied the Credit Card from FAB");
        String text =
                applicant.getFirstName()+" "+applicant.getLastName() + " | "
                + applicant.getMobileNumber() + " | "
                + applicant.getLocation() + " | "
                + applicant.getCreditcardType() + " is Created";
        helper.setText(text);
        javaMailSender.send(msg);
    }
}
