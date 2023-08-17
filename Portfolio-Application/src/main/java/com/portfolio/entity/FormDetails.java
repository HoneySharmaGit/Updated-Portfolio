package com.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "form_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "form_id")
	private int id;

	private String name;

	private String email;

	private String job_designation;

	private String message;

	private String email_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob_designation() {
		return job_designation;
	}

	public void setJob_designation(String job_designation) {
		this.job_designation = job_designation;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEmail_at() {
		return email_at;
	}

	public void setEmail_at(String email_at) {
		this.email_at = email_at;
	}

}
