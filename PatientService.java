package com.service;

import com.dao.PatientDao;
import com.entity.PatientEntity;

public class PatientService {
    public void insertData() throws Exception{
    	
    	
    	PatientDao pd=new PatientDao();
    	pd.insertData();
    	System.out.println("Data inserted succesfully...");
    }
    public void updateData() throws Exception {
    	
    	PatientDao pd=new PatientDao();
    	pd.updateData();
    	System.out.println("Data updated succesfully...");
    }
    public void deleteData() throws Exception {
    	PatientDao pd=new PatientDao();
    	pd.deleteData();
    	System.out.println("Data deleted succesfully...");
    }
    public void fetchAllRecords() throws Exception {
    	PatientDao pd=new PatientDao();
    	pd.fetchAllRecords();
    	
    }
}
