package com.glqdlt.myhome.domain.crawller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_crawller_metadata")
public class CrawllerMetadata {
	@Id
	@GeneratedValue
	private Integer no;

	private Integer category;
	private String url;
	private Integer b_no;
	private String b_subject;
	private String b_time;
	private String hash;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getB_no() {
		return b_no;
	}

	public void setB_no(Integer b_no) {
		this.b_no = b_no;
	}

	public String getB_subject() {
		return b_subject;
	}

	public void setB_subject(String b_subject) {
		this.b_subject = b_subject;
	}

	public String getB_time() {
		return b_time;
	}

	public void setB_time(String b_time) {
		this.b_time = b_time;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

}
