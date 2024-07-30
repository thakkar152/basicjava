package com.udemy.secondstart;

public class StudentDetails {

	private int std;
	private String school;

	public StudentDetails(int std, String school) {
		this.std = std;
		this.school = school;
	}

	public int getStd() {
		return this.std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "StudentDetails [std=" + std + ", school=" + this.school + "]";
	}

}
