package com.glqdlt.myhome.domain.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_app_config")
public class AppConfig {
	@Id
	@GeneratedValue
	private Integer no;

	private String email_subject;
	private String email_writer;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getEmail_subject() {
		return email_subject;
	}

	public void setEmail_subject(String email_subject) {
		this.email_subject = email_subject;
	}

	public String getEmail_writer() {
		return email_writer;
	}

	public void setEmail_writer(String email_writer) {
		this.email_writer = email_writer;
	}

}
