package artie.common.web.dto;

public class Solution {

    private String id;
    private String exerciseId;
    private String name;
    private String description;
    private String screenShot;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getExerciseId(){ return exerciseId; }
    public void setExerciseId(String exerciseId){this.exerciseId=exerciseId;}

    public String getName(){return name; }
    public void setName(String name){ this.name = name; }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public String getScreenShot() {
        return screenShot;
    }
    public void setScreenShot(String screenShot) {
        this.screenShot = screenShot;
    }

    /**
     * Default constructor
     */
    public Solution(){}

    /**
     * Parameterized constructor
     * @param id
     * @param name
     * @param description
     * @param screenShot
     */
    public Solution(String id, String exerciseId, String name, String description, String screenShot) {
        this.id = id;
        this.exerciseId = exerciseId;
        this.name = name;
        this.description = description;
        this.screenShot = screenShot;
    }
}
