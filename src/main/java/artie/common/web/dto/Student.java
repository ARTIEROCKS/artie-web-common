package artie.common.web.dto;

public class Student {
	
	//Atributes
    private String id;
    private String name;
    private String lastName;
    private String studentNumber;
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

    public String getStudentNumber(){return studentNumber;}
    public void setStudentNumber(String studentNumber){this.studentNumber = studentNumber;}

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
    
    /**
     * Default constructor
     */
    public Student() {}
    
    /**
     * Parameterized constructor
     * @param id
     * @param name
     * @param lastName
     * @param studentNumber
     * @param competence
     * @param motivation
     */
    public Student(String id, String name, String lastName, String studentNumber, String competence, String motivation){
    	this.id = id;
    	this.name = name;
    	this.lastName = lastName;
    	this.studentNumber = studentNumber;
    	this.competence = competence;
    	this.motivation = motivation;
    }

}
