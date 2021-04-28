package artie.common.web.dto;

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

    public int getGender(){return gender;}
    public void setGender(int gender){this.gender = gender;}

    public int getMotherTongue(){return motherTongue;}
    public void setMotherTongue(int motherTongue){this.motherTongue = motherTongue;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public int getCompetence() {
        return competence;
    }
    public void setCompetence(int competence) {
        this.competence = competence;
    }

    public int getMotivation() {
        return motivation;
    }
    public void setMotivation(int motivation) {
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
     * @param gender
     * @param motherTongue
     * @param age
     * @param competence
     * @param motivation
     */
    public Student(String id, String name, String lastName, String studentNumber, int gender, int motherTongue, int age, int competence, int motivation){
    	this.id = id;
    	this.name = name;
    	this.lastName = lastName;
    	this.studentNumber = studentNumber;
    	this.gender = gender;
    	this.motherTongue = motherTongue;
    	this.age = age;
    	this.competence = competence;
    	this.motivation = motivation;
    }

}
