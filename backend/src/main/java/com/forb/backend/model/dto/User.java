package com.forb.backend.model.dto;

import java.io.Serializable;

public class User implements Serializable {
    String id, name, imgUrl, gitAddress, gitId;
    String level, stamp, classProgress;
    double testResult;
    
    public User() {
    	
    }
    
	public User(String id, String name, String imgUrl, String gitAddress, String gitId, String level, String stamp,
			String classProgress, double testResult) {
		super();
		this.id = id;
		this.name = name;
		this.imgUrl = imgUrl;
		this.gitAddress = gitAddress;
		this.gitId = gitId;
		this.level = level;
		this.stamp = stamp;
		this.classProgress = classProgress;
		this.testResult = testResult;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getGitAddress() {
		return gitAddress;
	}

	public void setGitAddress(String gitAddress) {
		this.gitAddress = gitAddress;
	}

	public String getGitId() {
		return gitId;
	}

	public void setGitId(String gitId) {
		this.gitId = gitId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getStamp() {
		return stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
	}

	public String getClassProgress() {
		return classProgress;
	}

	public void setClassProgress(String classProgress) {
		this.classProgress = classProgress;
	}

	public double getTestResult() {
		return testResult;
	}

	public void setTestResult(double testResult) {
		this.testResult = testResult;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", imgUrl=" + imgUrl + ", gitAddress=" + gitAddress + ", gitId="
				+ gitId + ", level=" + level + ", stamp=" + stamp + ", classProgress=" + classProgress + ", testResult="
				+ testResult + "]";
	}

    




}