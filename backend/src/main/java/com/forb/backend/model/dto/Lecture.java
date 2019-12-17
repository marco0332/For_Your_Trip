package com.forb.backend.model.dto;

import java.io.Serializable;

public class Lecture implements Serializable {
	
	String lId;
	String lName;
	int lNum;
	String lCategory;

	public Lecture() {

	}

	public Lecture(String lId, String lName, int lNum, String lCategory) {
		this.lId = lId;
		this.lName = lName;
		this.lNum = lNum;
		this.lCategory = lCategory;
	}

	public String getlId() {
		return lId;
	}

	public void setlId(String lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getlNum() {
		return lNum;
	}

	public void setlNum(int lNum) {
		this.lNum = lNum;
	}

	public String getlCategory() {
		return lCategory;
	}

	public void setlCategory(String lCategory) {
		this.lCategory = lCategory;
	}

	@Override
	public String toString() {
		return "Lecture [lCategory=" + lCategory + ", lId=" + lId + ", lName=" + lName + ", lNum=" + lNum + "]";
	}	
	
}
