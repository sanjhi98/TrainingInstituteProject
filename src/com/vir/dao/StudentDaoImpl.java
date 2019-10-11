package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.vir.model.Student;

import connection.DBConnection;

public class StudentDaoImpl implements StudentDao{
	
	public static Connection connection = DBConnection.getConn();
	
	
	private String FIND_BY_ID = "select * from book where id=?";
	private String GET_ALL_STUDENTS = "select * from student";
	private String ADD_STUDENT = "insert into student values(?,?,?,?,?,?,?)";
	private String REMOVE_STUDENT = "delete from student where id=?";
	private String UPDATE_STUDENT = "update student set name=?";
	
	PreparedStatement preparedStatement = null;
	Student student = null;

	@Override
	public List<Student> getAllStudents() {
		System.out.println(connection+" studentdaoimpl");
		ArrayList<Student> studentList = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement(GET_ALL_STUDENTS);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				student = new Student();
				student.setSid(resultSet.getInt(1));
		    	student.setName(resultSet.getString(2));
		    	student.setFathersName(resultSet.getString(3));
		    	
				student.setAadharID(resultSet.getString(4));
				student.setAge(resultSet.getInt(5));
				student.setUserName(resultSet.getString(6));
				student.setPassword(resultSet.getString(7));
				System.out.println(student);
				studentList.add(student);
				
			}
			resultSet.close();
			return studentList;
			
		} catch (SQLException e) {
			return null;
		}finally {
			
		}
		
		
	}

	@Override
	public boolean addStudent(Student student) {
		
		try {
			preparedStatement = connection.prepareStatement(ADD_STUDENT);
			preparedStatement.setInt(1, student.getSid());
			preparedStatement.setString(2,student.getName());
			preparedStatement.execute();
			connection.commit();
			return true;
			
		} catch (SQLException e) {
			return false;
		}finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//return false;
	}

	@Override
	public boolean removeStudent(Student student) {
		try {
			preparedStatement = connection.prepareStatement(REMOVE_STUDENT);
			preparedStatement.setInt(1, student.getSid());
//			/ResultSet resultSet = preparedStatement.executeQuery();
			preparedStatement.execute();
			connection.commit();
			return true;
		} catch (SQLException e) {
			return false;
		}finally {
			try {
				preparedStatement.close();
			}
			
			catch(Exception e) {}
		}
		
		
	}

	@Override
	public boolean updateStudent(Student student) {
		try {
			preparedStatement = connection.prepareStatement(UPDATE_STUDENT);
			preparedStatement.setInt(1, student.getSid());
			preparedStatement.executeUpdate();
			connection.commit();
			return true;
			
		}catch(Exception e)
		{
			return false;
			
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public Student findById(String id) {
		Student student =null;
		try {
			preparedStatement = connection.prepareStatement(FIND_BY_ID);
			preparedStatement.setString(1,id);
		    ResultSet resultSet = preparedStatement.executeQuery();
		    if(resultSet.next())
		    {
		    	student.setSid(resultSet.getInt(1));
		    	student.setName(resultSet.getString(2));
		    	student.setAge(resultSet.getInt(3));
				student.setAadharID(resultSet.getString(4));
				student.setFathersName(resultSet.getString(5));;
				student.setUserName(resultSet.getString(6));
				student.setPassword(resultSet.getString(7));
		    }
		    
		    return student;
			
		}catch(Exception e)
		{
			return student;
		}
	}

}
