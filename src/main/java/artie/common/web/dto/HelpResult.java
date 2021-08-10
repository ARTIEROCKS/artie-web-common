package artie.common.web.dto;

import java.util.Date;

public class HelpResult {

    private String id;
    private boolean predictedNeedHelp;
    private boolean needHelp;
    private boolean answeredNeedHelp;
    private Date dateAnsweredNeedHelp;
    private SolutionDistance solutionDistance;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public boolean isPredictedNeedHelp() {return predictedNeedHelp;}
    public void setPredictedNeedHelp(boolean predictedNeedHelp) {this.predictedNeedHelp = predictedNeedHelp;}

    public boolean isNeedHelp(){return needHelp;}
    public void setNeedHelp(boolean needHelp){this.needHelp = needHelp;}

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
     * @param needHelp+
     * @param answeredNeedHelp
     * @param dateAnsweredNeedHelp
     * @param solutionDistance
     */
    public HelpResult(String id, boolean predictedNeedHelp, boolean needHelp, boolean answeredNeedHelp, Date dateAnsweredNeedHelp, SolutionDistance solutionDistance) {
        this.id = id;
        this.predictedNeedHelp = predictedNeedHelp;
        this.needHelp = needHelp;
        this.answeredNeedHelp = answeredNeedHelp;
        this.dateAnsweredNeedHelp = dateAnsweredNeedHelp;
        this.solutionDistance = solutionDistance;
    }
}
