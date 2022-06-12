package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LearningProgress {

    private Exercise exercise;
    private Student student;
    private double totalDistance;
    private double grade;
    private LocalDateTime dateTime;
    private Date lastLogin;
    private boolean requestHelp;
    private double secondsHelpOpen;
    private boolean finishedExercise;
    private int validSolution;
}
