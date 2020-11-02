package artie.common.web.dto;

import artie.common.web.enums.ValidSolutionEnum;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
	
	private String id;
    private String name;
    private String description;
    private List<Skill> skills = new ArrayList<>();

    private String screenShot = null;
    private String finishedExerciseId = null;
    private int validSolution = ValidSolutionEnum.WAITING_APPROVAL.getValue();


    public String getId() {
    	return id;
    }
    public void setId(String id) {
    	this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public String getScreenShot(){ return screenShot; }
    public void setScreenShot(String screenShot){ this.screenShot = screenShot; }

    public String getFinishedExerciseId(){ return finishedExerciseId; }
    public void setFinishedExerciseId(String finishedExerciseId){ this.finishedExerciseId = finishedExerciseId; }

    public int getValidSolution(){ return this.validSolution; }
    public void setValidSolution(int validSolution){this.validSolution = validSolution; }

    /**
     * Default constructor
     */
    public Exercise(){}

    /**
     * Parameterized constructor for setting the exercise information
     * @param id
     * @param name
     * @param description
     * @param skills
     */
    public Exercise(String id, String name, String description, List<Skill> skills) {
        this.id = id;
    	this.name = name;
        this.description = description;
        this.skills = skills;
    }

    /**
     * Parameterized constructor for setting the finished exercise information
     * @param id
     * @param name
     * @param finishedExerciseId
     * @param screenShot
     * @param validSolution
     */
    public Exercise(String id, String name, String finishedExerciseId, String screenShot, int validSolution){
        this.id = id;
        this.finishedExerciseId = finishedExerciseId;
        this.screenShot = screenShot;
        this.validSolution = validSolution;
    }
}
