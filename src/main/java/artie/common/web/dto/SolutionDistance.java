package artie.common.web.dto;

public class SolutionDistance {

    private double familyDistance=-1;
    private double elementDistance=-1;
    private double positionDistance=-1;
    private double inputDistance=-1;

    private double totalDistance = -1;

    private NextStepHint nextSteps = null;

    public double getFamilyDistance() {
        return familyDistance;
    }
    public void setFamilyDistance(double familyDistance) {
        this.familyDistance = familyDistance;
    }

    public double getElementDistance() {
        return elementDistance;
    }
    public void setElementDistance(double elementDistance) {
        this.elementDistance = elementDistance;
    }

    public double getPositionDistance() {
        return positionDistance;
    }
    public void setPositionDistance(double positionDistance) {
        this.positionDistance = positionDistance;
    }

    public double getInputDistance() {
        return inputDistance;
    }
    public void setInputDistance(double inputDistance) {
        this.inputDistance = inputDistance;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public NextStepHint getNextSteps(){return nextSteps;}
    public void setNextSteps(NextStepHint nextSteps){this.nextSteps = nextSteps;}

    /**
     * Default constructor
     */
    public SolutionDistance() {}

    /**
     * Parameterized constructor
     * @param familyDistance
     * @param elementDistance
     * @param positionDistance
     * @param inputDistance
     * @param totalDistance
     */
    public SolutionDistance(double familyDistance, double elementDistance, double positionDistance,
                            double inputDistance, double totalDistance) {
        super();
        this.familyDistance = familyDistance;
        this.elementDistance = elementDistance;
        this.positionDistance = positionDistance;
        this.inputDistance = inputDistance;
        this.totalDistance = totalDistance;
    }
}
