package artie.common.web.dto;

public class Student {
	
	//Atributes
    private String id;
    private String name;
    private String lastName;
    private String competence;
    private String motivation; 

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

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompetence() {
        return competence;
    }
    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getMotivation() {
        return motivation;
    }
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

}
