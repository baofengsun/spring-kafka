package com.example.demo.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ApplicantsSteams {
    String INPUT = "applicants-in";
    String OUTPUT = "applicants-out";

    @Input(INPUT)
    SubscribableChannel inboundApplicants();

    @Output(OUTPUT)
    MessageChannel outboundApplicants();
}
