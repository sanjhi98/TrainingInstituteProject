package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.vir.model.Enrollment;

import connection.DBConnection;

public class EnrollmentDaoImpl implements EnrollmentDao {
	
	private static final String ADD_ENROLLMENT = "insert into enrollment(batch_id,student_id) values(?,?)";
	private static final String REMOVE_ENROLLMENT = "delete from enrollment where enrollment_id=?";
	private static final String GET_ALL_ENROLLMENT = "select * from enrollment";
	
	public static Connection connection = DBConnection.getConn();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	@Override
	public boolean addEnrollment(int batchid,int studentid) {
		
			
		try {
			preparedStatement = connection.prepareStatement(ADD_ENROLLMENT);
			preparedStatement.setInt(1,batchid);
			preparedStatement.setInt(2,studentid);
			preparedStatement.execute();
		//	connection.commit();
			return true;

		}catch(Exception e)
		{
		  return false;	
		}finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		//return false;
	}

	@Override
	public boolean removeEnrollment(Enrollment enrollment) {
		
		try {
			preparedStatement = connection.prepareStatement(REMOVE_ENROLLMENT);
			preparedStatement.setInt(1,enrollment.getEnrollmentId());
			preparedStatement.execute();
			connection.commit();
			return true;
			
		}catch(Exception e)
		{
			return false;
		}
		
		//return false;
	}

	@Override
	public List<Enrollment> getAll() {
		ArrayList<Enrollment> enrollmentList = new ArrayList<>();
		Enrollment enrollment =new Enrollment();
		try {
			preparedStatement = connection.prepareStatement(GET_ALL_ENROLLMENT);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				enrollment.setBatchId(resultSet.getInt(1));
				enrollment.setEnrollmentId(resultSet.getInt(2));
				enrollment.setStudentID(resultSet.getInt(3));
				enrollmentList.add(enrollment);
			}
			return enrollmentList;
		}catch(Exception e)
		{
			return null;
		}finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
