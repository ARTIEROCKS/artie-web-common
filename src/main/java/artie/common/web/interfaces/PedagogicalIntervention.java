package artie.common.web.interfaces;

import java.util.List;

import artie.common.web.dto.Student;
import artie.sensor.common.dto.SensorObject;

public interface PedagogicalIntervention {

	public void addSensorData(List<SensorObject> data, Student student);
	
}
