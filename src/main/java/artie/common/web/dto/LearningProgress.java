package artie.common.web.dto;

import java.time.LocalDateTime;

public class LearningProgress {

    private Exercise exercise;
    private Student student;
    private double totalDistance;
    private double grade;
    private LocalDateTime dateTime;
    private LocalDateTime lastLogin;
    private boolean requestHelp;
    private double secondsHelpOpen;
    private boolean finishedExercise;
    private boolean validSolution;

    public Exercise getExercise() {
        return exercise;
    }
    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }
    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isRequestHelp() {
        return requestHelp;
    }
    public void setRequestHelp(boolean requestHelp) {
        this.requestHelp = requestHelp;
    }

    public double getSecondsHelpOpen() {
        return secondsHelpOpen;
    }
    public void setSecondsHelpOpen(double secondsHelpOpen) {
        this.secondsHelpOpen = secondsHelpOpen;
    }

    public boolean isFinishedExercise() {
        return finishedExercise;
    }
    public void setFinishedExercise(boolean finishedExercise) {
        this.finishedExercise = finishedExercise;
    }

    public boolean isValidSolution() {
        return validSolution;
    }
    public void setValidSolution(boolean validSolution) {
        this.validSolution = validSolution;
    }

    /**
     * Default constructor
     */
    public LearningProgress(){}

    /**
     * Parameterized constructor
     * @param exercise
     * @param student
     * @param totalDistance
     * @param grade
     * @param dateTime
     * @param lastLogin
     * @param requestHelp
     * @param secondsHelpOpen
     * @param finishedExercise
     * @param validSolution
     */
    public LearningProgress(Exercise exercise, Student student, double totalDistance, double grade, LocalDateTime dateTime,
                            LocalDateTime lastLogin, boolean requestHelp, double secondsHelpOpen, boolean finishedExercise,
                            boolean validSolution) {
        this.exercise = exercise;
        this.student = student;
        this.totalDistance = totalDistance;
        this.grade = grade;
        this.dateTime = dateTime;
        this.lastLogin = lastLogin;
        this.requestHelp = requestHelp;
        this.secondsHelpOpen = secondsHelpOpen;
        this.finishedExercise = finishedExercise;
        this.validSolution = validSolution;
    }
}
