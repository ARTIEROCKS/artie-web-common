package artie.common.web.dto;

import artie.common.web.enums.ValidSolutionEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    protected Date lastExerciseChange;


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
     * @param student student
     * @param exercise exercise
     * @param solutionDistance solution distance
     * @param secondsHelpOpen seconds with help open
     * @param finishedExercise whether exercise is finished
     * @param validSolution valid solution code
     * @param grade grade
     * @param lastLogin last login date
     * @param lastExerciseChange last exercise change date
     */
    public SoftwareData(Student student, Exercise exercise, SolutionDistance solutionDistance,
                        double secondsHelpOpen, boolean finishedExercise, int validSolution, double grade,
                        Date lastLogin, Date lastExerciseChange) {
        this.student = student;
        this.exercise = exercise;
        this.solutionDistance = solutionDistance;
        this.dateTime = LocalDateTime.now();
        this.secondsHelpOpen = secondsHelpOpen;
        this.finishedExercise = finishedExercise;
        this.validSolution = validSolution;
        this.grade = grade;
        this.lastLogin = lastLogin;
        this.lastExerciseChange = lastExerciseChange;
    }
}
