package com.example.demo.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

import com.example.demo.streams.ApplicantsSteams;

@Configuration
@EnableBinding({ApplicantsSteams.class})
public class ApplicantsStreamConfig {
}
