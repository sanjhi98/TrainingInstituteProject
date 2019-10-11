package com.vir.model;

import java.sql.Blob;
import java.sql.Date;

public class Batch {

	private int BatchID;
	private int CourseID;
	private Date StartDate;
	private Date EndDate;
	private double Price;
	private String img;
	public Batch() {
		super();
	}
	public Batch(int batchID, int courseID, Date startDate, Date endDate, double price, String img) {
		super();
		BatchID = batchID;
		CourseID = courseID;
		StartDate = startDate;
		EndDate = endDate;
		Price = price;
		this.img = img;
	}
	public int getBatchID() {
		return BatchID;
	}
	public void setBatchID(int batchID) {
		BatchID = batchID;
	}
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Batch [BatchID=" + BatchID + ", CourseID=" + CourseID + ", StartDate=" + StartDate + ", EndDate="
				+ EndDate + ", Price=" + Price + ", img=" + img + "]";
	}
	
	





	
	
	
}