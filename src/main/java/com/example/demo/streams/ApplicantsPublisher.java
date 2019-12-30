package com.example.demo.streams;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

import com.example.demo.document.Applicant;

@Component
public class ApplicantsPublisher {

    private final ApplicantsSteams applicantsSteams;

    public ApplicantsPublisher(ApplicantsSteams applicantsSteams) {
        this.applicantsSteams = applicantsSteams;
    }

    public void sendApplicant(@Payload final Applicant applicant) {


        MessageChannel messageChannel = applicantsSteams.outboundApplicants();
        messageChannel.send(MessageBuilder
                .withPayload(applicant)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }

}
