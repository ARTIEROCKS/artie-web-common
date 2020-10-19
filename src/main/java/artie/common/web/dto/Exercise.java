package artie.common.web.dto;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
	
	String id;
    String name;
    String description;
    List<Skill> skills = new ArrayList<>();

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

    /**
     * Default constructor
     */
    public Exercise(){}

    /**
     * Parameterized constructor
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
}
