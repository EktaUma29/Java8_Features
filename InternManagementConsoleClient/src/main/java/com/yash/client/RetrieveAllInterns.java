package com.yash.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//import com.yash.model.Interns;

@SpringBootApplication
@EnableAutoConfiguration
public class RetrieveAllInterns {
	public static void main(String[] args) {
		SpringApplication.run(RetrieveAllInterns.class, args);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8089/interns-management/yash-interns";
//		ResponseEntity<Interns[]> response = template.exchange(url, HttpMethod.GET, requestEntity, Interns[].class);
//		Interns[] interns = response.getBody();
//		for (Interns intern : interns) {
//			System.out.println(intern);
//		}
	}
}
