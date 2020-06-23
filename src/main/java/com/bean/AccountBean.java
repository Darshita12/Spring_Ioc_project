package com.bean;

import org.springframework.stereotype.Component;

@Component
public class AccountBean {

	private int acid;
	private String acname;
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
}
