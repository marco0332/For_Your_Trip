package com.forb.backend.model.dto;

import java.io.Serializable;

public class Class implements Serializable {
	
	String cId;
	String cName;
	int cNum;
	String cCategory;
	
	public Class() {
		
	}

	public Class(String cId, String cName, int cNum, String cCategory) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cNum = cNum;
		this.cCategory = cCategory;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcNum() {
		return cNum;
	}

	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	public String getcCategory() {
		return cCategory;
	}

	public void setcCategory(String cCategory) {
		this.cCategory = cCategory;
	}

	@Override
	public String toString() {
		return "Class [cCategory=" + cCategory + ", cId=" + cId + ", cName=" + cName + ", cNum=" + cNum + "]";
	}
	
}
