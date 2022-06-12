package artie.common.web.dto;

import artie.common.web.enums.ValidSolutionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
	
	private String id;
    private String name;
    private String description;
    private List<Skill> skills = new ArrayList<>();

    private String screenShot = null;
    private String binary = null;
    private String finishedExerciseId = null;
    private int validSolution = ValidSolutionEnum.WAITING_APPROVAL.getValue();

    private boolean isEvaluation;
    private int level;


    /**
     * Parameterized constructor for setting the exercise information
     * @param id
     * @param name
     * @param description
     * @param skills
     * @param isEvaluation
     * @param level
     */
    public Exercise(String id, String name, String description, List<Skill> skills, boolean isEvaluation, int level) {
        this.id = id;
    	this.name = name;
        this.description = description;
        this.skills = skills;
        this.isEvaluation = isEvaluation;
        this.level = level;
    }

    /**
     * Parameterized constructor for setting the finished exercise information
     * @param id
     * @param name
     * @param description
     * @param finishedExerciseId
     * @param screenShot
     * @param binary
     * @param validSolution
     * @param isEvaluation
     * @param level
     */
    public Exercise(String id, String name, String description, String finishedExerciseId, String screenShot, String binary, int validSolution, boolean isEvaluation, int level){
        this.id = id;
        this.name = name;
        this.description = description;
        this.finishedExerciseId = finishedExerciseId;
        this.screenShot = screenShot;
        this.binary = binary;
        this.validSolution = validSolution;
        this.isEvaluation = isEvaluation;
        this.level = level;
    }
}
