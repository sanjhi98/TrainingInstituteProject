package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import com.vir.model.Batch;

public class BatchDaoImpl implements BatchDao {

	Connection conn=DBConnection.getConn();	
	private String q1= "select * from batch";
	private String q2 = "insert into batch(start_date,end_date,price,image) values(?,?,?,?)";
	private String q3 = "delete from batch where batch_id=?";
	private String q4 = "update batch set course_id=?,start_date=?,end_date=?,price=?,image=? where batch_id= ?";
	private String q5=" select * from batch where batch_id=?";
	PreparedStatement ps =null;
	Batch batch=null;
	ArrayList<Batch> batchList= new  ArrayList<>();
	
	

	@Override
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub

		try{
			ps=conn.prepareStatement(q1);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				batch = new Batch();
				batch.setBatchID(rs.getInt(1));
				batch.setCourseID(rs.getInt(2));
				batch.setStartDate(rs.getDate(3));
				batch.setEndDate(rs.getDate(4));
				batch.setPrice(rs.getDouble(5));
				batch.setImg(rs.getString(6));
				batchList.add(batch);
			}
			rs.close();
			return batchList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally {
			try{
				ps.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
	@Override
	public boolean addBatch(Batch batch) {
		// TODO Auto-generated method stub
		try {
			ps = conn.prepareStatement(q2);
			ps.setInt(1, batch.getCourseID());
			ps.setDate(2, batch.getStartDate());
			ps.setDate(3, batch.getEndDate());
			ps.setDouble(4, batch.getPrice());	
			ps.setString(5,batch.getImg());
			return true;
		}
		catch(Exception e) {
		  return false; 
		}
		finally {
			try {
				ps.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	@Override
	public boolean removeBatch(Batch batch) {
		try {
			ps = conn.prepareStatement(q3);
			ps.setInt(1, batch.getBatchID());
			
			return true;
		}
		catch(Exception e) {
		  return false; 
		}
		finally {
			try {
				ps.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		//return false;
	}
	@Override
	public boolean updateBatch(Batch batch) {
		// TODO Auto-generated method stub
		try {
			ps = conn.prepareStatement(q4);
			ps.setInt(1, batch.getCourseID());
			ps.setDate(2, batch.getStartDate());
			ps.setDate(3, batch.getEndDate());
			ps.setDouble(4, batch.getPrice());
			ps.setString(5, batch.getImg());
			ps.setInt(6, batch.getBatchID());
			ps.executeUpdate();
			
			return true;
		}
		catch(Exception e) {
		  return false; 
		}
		finally {
			try {
				ps.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	@Override
	public Batch findById(int id)
	{
		batch=new Batch();
		try
		{
			ps=conn.prepareStatement(q5);
			ResultSet rs=ps.executeQuery();
			ps.setInt(1,id);
			while(rs.next())
			{
				batch.setBatchID(rs.getInt(1));
				batch.setCourseID(rs.getInt(2));
				batch.setStartDate(rs.getDate(3));
				batch.setEndDate(rs.getDate(4));
				batch.setPrice(rs.getDouble(5));
				batch.setImg(rs.getString(6));
				
			}
			return batch;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			try
			{
				ps.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
