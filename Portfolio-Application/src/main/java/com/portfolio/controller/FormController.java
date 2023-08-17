package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.entity.DateGenerator;
import com.portfolio.entity.FormDetails;
import com.portfolio.service.FormService;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin(origins = { "*" })
public class FormController {

	@Autowired
	private FormService formService;

	@Autowired
	private DateGenerator dateGenerator;

	@PostMapping("/sendform")
	public ResponseEntity<?> addFormDetails(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("job_designation") String job_designation, @RequestParam("message") String message) {
		FormDetails formData = new FormDetails();
		formData.setName(name);
		formData.setEmail(email);
		formData.setJob_designation(job_designation);
		formData.setMessage(message);
		formData.setEmail_at(dateGenerator.getCurrentTime());
		formService.addFromDetails(formData);
		return ResponseEntity.ok("Information Sent Successfully!");
	}
}
