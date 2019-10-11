package com.vir.dao;

import com.vir.model.Enrollment;
import java.util.List;

public interface EnrollmentDao {
	
	boolean addEnrollment(int batchid,int studentid);
	boolean removeEnrollment(Enrollment enrollment);
	List<Enrollment> getAll();
	
	

}
