package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	//Atributes
    private String id;
    private String name;
    private String lastName;
    private String studentNumber;
    private int gender;
    private int motherTongue;
    private int age;
    private int competence;
    private int motivation;
    private boolean recordFace;
    private boolean recordInteractions;
    private boolean interactsWithRobot;

}
