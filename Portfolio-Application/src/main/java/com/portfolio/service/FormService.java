package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.entity.FormDetails;
import com.portfolio.repository.FormRepository;

@Service
public class FormService {

	@Autowired
	private FormRepository formRepo;

	public void addFromDetails(FormDetails formData) {
		formRepo.save(formData);
	}

}
