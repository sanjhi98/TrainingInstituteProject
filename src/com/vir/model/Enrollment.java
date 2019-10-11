package com.vir.model;

public class Enrollment {
	
	private int enrollmentId;
	private int studentID;
	private int batchId;
	public Enrollment() {
		super();
	}
	public Enrollment(int enrollmentId, int studentID, int batchId) {
		super();
		this.enrollmentId = enrollmentId;
		this.studentID = studentID;
		this.batchId = batchId;
	}
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", studentID=" + studentID + ", batchId=" + batchId + "]";
	}
	
	
	

}
