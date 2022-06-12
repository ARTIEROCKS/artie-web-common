package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolutionDistance {

    private String solutionId = null;
    private double familyDistance=-1;
    private double elementDistance=-1;
    private double positionDistance=-1;
    private double inputDistance=-1;

    private double totalDistance = -1;

    private NextStepHint nextSteps = null;

    /**
     * Parameterized constructor
     * @param solutionId
     * @param familyDistance
     * @param elementDistance
     * @param positionDistance
     * @param inputDistance
     * @param totalDistance
     */
    public SolutionDistance(String solutionId, double familyDistance, double elementDistance, double positionDistance,
                            double inputDistance, double totalDistance) {

        this.solutionId = solutionId;
        this.familyDistance = familyDistance;
        this.elementDistance = elementDistance;
        this.positionDistance = positionDistance;
        this.inputDistance = inputDistance;
        this.totalDistance = totalDistance;
    }
}
