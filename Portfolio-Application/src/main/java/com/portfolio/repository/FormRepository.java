package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.entity.FormDetails;

public interface FormRepository extends JpaRepository<FormDetails, Integer> {

}
