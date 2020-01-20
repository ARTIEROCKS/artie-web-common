package artie.common.web.dto;

import java.util.List;

import artie.sensor.common.dto.SensorObject;

public class SecuritySensorData {

	//Security attributes
	private String user;
	private String password;
	
	//Data attributes
	private List<SensorObject> data;
	private Student student;
	
	//Properties
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<SensorObject> getData() {
		return data;
	}
	public void setData(List<SensorObject> data) {
		this.data = data;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	//Default constructor
	public SecuritySensorData() {}

	//Parameterized constructor
	public SecuritySensorData(String user, String password, List<SensorObject> data, Student student) {
		
		this.user = user;
		this.password = password;
		
		this.data = data;
		this.student = student;
	}
	
}
