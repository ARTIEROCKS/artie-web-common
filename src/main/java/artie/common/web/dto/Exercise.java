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
    private String binary = null;
    private String finishedExerciseId = null;
    private int validSolution = ValidSolutionEnum.WAITING_APPROVAL.getValue();

    private boolean isEvaluation;
    private int level;


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

    public String getBinary(){ return binary; }
    public void setBinary(String binary){ this.binary = binary;}

    public String getFinishedExerciseId(){ return finishedExerciseId; }
    public void setFinishedExerciseId(String finishedExerciseId){ this.finishedExerciseId = finishedExerciseId; }

    public int getValidSolution(){ return this.validSolution; }
    public void setValidSolution(int validSolution){this.validSolution = validSolution; }

    public boolean getIsEvaluation(){ return this.isEvaluation; }
    public void setIsEvaluation(boolean isEvaluation){this.isEvaluation = isEvaluation; }

    public int getLevel(){ return this.level; }
    public void setLevel(int level){ this.level = level; }


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
