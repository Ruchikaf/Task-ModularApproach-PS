package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.entity.PatientEntity;

public class PatientDao {
  Scanner sc=new Scanner(System.in);
	public void insertData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		
		PatientEntity pe=new PatientEntity();
		//input from user
		System.out.println("Enter the values id,name,age,disease to insert :");
		int id=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		String dis=sc.next();
		
    	pe.setPatient_id(id);
    	pe.setAge(age);
    	pe.setName(name);
    	pe.setDisease(dis);
    	
		PreparedStatement ps=c.prepareStatement("insert into patient values(?,?,?,?)");
		ps.setInt(1, pe.getPatient_id());
		ps.setString(2,pe.getName());
		ps.setInt(3, pe.getAge());
		ps.setString(4, pe.getDisease());
		ps.executeUpdate();
		
		ps.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
		PatientEntity pe=new PatientEntity();
    System.out.println("Enter id :");
    int id=sc.nextInt();
	 	System.out.println("Enter the details to update name,age,disease : ");
	 	String name=sc.next();
	 	int age=sc.nextInt();
	 	String dis=sc.next();
	 	
    	pe.setPatient_id(id);
    	pe.setDisease(dis);
    	pe.setName(name);
    	pe.setAge(age);
    	
		PreparedStatement ps=c.prepareStatement("update patient set name=? , age=? ,disease=? where patient_id=?");
		 ps.setInt(4, pe.getPatient_id());
		 ps.setString(1, pe.getName());
		 ps.setInt(2, pe.getAge());
		 ps.setString(3,pe.getDisease());
		 ps.executeUpdate();
		 ps.close();
		
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		
		PatientEntity pe=new PatientEntity();
		System.out.println("Enter id:");
		int id=sc.nextInt();
		pe.setPatient_id(id);
		PreparedStatement ps=c.prepareStatement("Delete from patient where patient_id=?");
		ps.setInt(1, pe.getPatient_id());
		ps.executeUpdate();
		ps.close();
		
	}

	public void fetchAllRecords() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		PreparedStatement ps=c.prepareStatement("Select * from patient");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getInt(3)+"  "+rs.getString(4));
		}
		
		
	}
   
}
