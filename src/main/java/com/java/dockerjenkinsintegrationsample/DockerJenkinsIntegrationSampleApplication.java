package com.java.dockerjenkinsintegrationsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
		System.out.println("Testing complete flow started docker in local");
	}

}
