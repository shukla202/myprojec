package com.example.demo.pojo;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;


public class Job {
	
	@Id
	private String _id;
	@NotNull
	private String userName;
	private long cTime;
	private long uTime;
	private long clTime;
	private String status;
	@NotNull
	private String title;
	@NotNull
	@Size(min=1, max=500)
	private String desc;
	private String JobType;
	private String role;
	private String function;
	
	 
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getcTime() {
		return cTime;
	}
	public void setcTime(long cTime) {
		this.cTime = cTime;
	}
	public long getuTime() {
		return uTime;
	}
	public void setuTime(long uTime) {
		this.uTime = uTime;
	}
	public long getClTime() {
		return clTime;
	}
	public void setClTime(long clTime) {
		this.clTime = clTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getJobType() {
		return JobType;
	}
	public void setJobType(String jobType) {
		JobType = jobType;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}

}
