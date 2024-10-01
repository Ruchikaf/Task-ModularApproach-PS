package com.entity;

public class PatientEntity {
	//fields
	private int patient_id ;
	private String name;
	private int age ;
	private String disease;
	
	public PatientEntity() {
		
	}
	
	public PatientEntity(int patient_id, String name, int age, String disease) {
		super();
		this.patient_id = patient_id;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "PatientEntity [patient_id=" + patient_id + ", name=" + name + ", age=" + age + ", disease=" + disease
				+ "]";
	}
	
	
	
}
