package artie.common.web.dto;

import java.util.Date;

public class HelpResult {

    private String id;
    private boolean predictedNeedHelp;
    private boolean answeredNeedHelp;
    private Date dateAnsweredNeedHelp;
    private SolutionDistance solutionDistance;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public boolean isPredictedNeedHelp() {return predictedNeedHelp;}
    public void setPredictedNeedHelp(boolean predictedNeedHelp) {this.predictedNeedHelp = predictedNeedHelp;}

    public boolean isAnsweredNeedHelp() {return answeredNeedHelp;}
    public void setAnsweredNeedHelp(boolean answeredNeedHelp) {this.answeredNeedHelp = answeredNeedHelp;}

    public Date getDateAnsweredNeedHelp(){return dateAnsweredNeedHelp;}
    public void setDateAnsweredNeedHelp(Date dateAnsweredNeedHelp){this.dateAnsweredNeedHelp = dateAnsweredNeedHelp;}

    public SolutionDistance getSolutionDistance() {return solutionDistance;}
    public void setSolutionDistance(SolutionDistance solutionDistance) {this.solutionDistance = solutionDistance;}

    /**
     * Default constructor
     */
    public HelpResult() {}

    /**
     * Parameterized constructor
     * @param id
     * @param predictedNeedHelp
     * @param answeredNeedHelp
     * @param dateAnsweredNeedHelp
     * @param solutionDistance
     */
    public HelpResult(String id, boolean predictedNeedHelp, boolean answeredNeedHelp, Date dateAnsweredNeedHelp, SolutionDistance solutionDistance) {
        this.id = id;
        this.predictedNeedHelp = predictedNeedHelp;
        this.answeredNeedHelp = answeredNeedHelp;
        this.dateAnsweredNeedHelp = dateAnsweredNeedHelp;
        this.solutionDistance = solutionDistance;
    }
}
