package artie.common.web.dto;

import java.util.List;

import artie.sensor.common.dto.SensorObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecuritySensorData {

	//Security attributes
	private String user;
	private String password;
	
	//Data attributes
	private List<SensorObject> data;
	private Student student;

}
