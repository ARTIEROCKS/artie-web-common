package artie.common.web.dto;

import artie.common.web.enums.ValidSolutionEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.Date;

public class SoftwareData {
    private Student student;
    protected Exercise exercise;
    private SolutionDistance solutionDistance;
    protected LocalDateTime dateTime;
    protected double secondsHelpOpen;
    protected boolean finishedExercise;
    protected int validSolution;
    protected double grade;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    protected Date lastLogin;

    public Student getStudent() {return student;}
    public void setStudent(Student student) {this.student = student;}

    public Exercise getExercise() {return exercise;}
    public void setExercise(Exercise exercise) {this.exercise = exercise;}

    public SolutionDistance getSolutionDistance() {return solutionDistance;}
    public void setSolutionDistance(SolutionDistance solutionDistance) {this.solutionDistance = solutionDistance;}

    public LocalDateTime getDateTime() {return dateTime;}
    public void setDateTime(LocalDateTime dateTime) {this.dateTime = dateTime;}

    public double getSecondsHelpOpen() {return secondsHelpOpen;}
    public void setSecondsHelpOpen(double secondsHelpOpen) {this.secondsHelpOpen = secondsHelpOpen;}

    public boolean getFinishedExercise() {return finishedExercise;}
    public void setFinishedExercise(boolean finishedExercise) {this.finishedExercise = finishedExercise;}

    public int getValidSolution() {return validSolution;}
    public void setValidSolution(int validSolution) {this.validSolution = validSolution;}

    public double getGrade() {return grade;}
    public void setGrade(double grade) {this.grade = grade;}

    public Date getLastLogin() {return lastLogin;}
    public void setLastLogin(Date lastLogin) {this.lastLogin = lastLogin;}

    /**
     * Default Constructor
     */
    public SoftwareData() {
        this.dateTime = LocalDateTime.now();
        this.finishedExercise = false;
        this.validSolution = ValidSolutionEnum.WAITING_APPROVAL.getValue();
    }

    /**
     * Parameterized constructor
     * @student student
     * @exercise exercise
     * @param solutionDistance
     * @param secondsHelpOpen
     * @param finishedExercise
     * @param validSolution
     * @param grade
     * @param lastLogin
     */
    public SoftwareData(Student student, Exercise exercise, SolutionDistance solutionDistance,
                        double secondsHelpOpen, boolean finishedExercise, int validSolution, double grade, Date lastLogin) {
        this.student = student;
        this.exercise = exercise;
        this.solutionDistance = solutionDistance;
        this.dateTime = LocalDateTime.now();
        this.secondsHelpOpen = secondsHelpOpen;
        this.finishedExercise = finishedExercise;
        this.validSolution = validSolution;
        this.grade = grade;
        this.lastLogin = lastLogin;
    }
}
