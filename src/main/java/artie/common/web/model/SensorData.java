package artie.common.web.model;

import artie.common.web.dto.Student;
import artie.sensor.common.dto.SensorObject;

public class SensorData {
	
	//Attributes
	private Student student;
	private SensorObject sensorObject;
	
	//Properties
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public SensorObject getSensorObject() {
		return sensorObject;
	}
	public void setSensorObject(SensorObject sensorObject) {
		this.sensorObject = sensorObject;
	}
	
	/**
	 * Default constructor
	 */
	SensorData(){}
	
	/**
	 * Parameterized constructor
	 * @param student
	 * @param sensorObject
	 */
	SensorData(Student student, SensorObject sensorObject){
		this.student = student;
		this.sensorObject = sensorObject;
	}
	
	
}
