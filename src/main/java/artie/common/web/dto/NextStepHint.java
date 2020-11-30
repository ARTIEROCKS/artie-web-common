package artie.common.web.dto;

import java.util.ArrayList;
import java.util.List;

public class NextStepHint {

    private List<PedagogicalSoftwareElement> addElements = new ArrayList<>();
    private List<PedagogicalSoftwareElement> deleteElements = new ArrayList<>();

    private List<PedagogicalSoftwareInput> replaceInputs = new ArrayList<>();

    public List<PedagogicalSoftwareElement> getAddElements() { return addElements;}
    public void setAddElements(List<PedagogicalSoftwareElement> addElements) {
        this.addElements = addElements;
    }

    public List<PedagogicalSoftwareElement> getDeleteElements() {
        return deleteElements;
    }
    public void setDeleteElements(List<PedagogicalSoftwareElement> deleteElements) { this.deleteElements = deleteElements; }

    public List<PedagogicalSoftwareInput> getReplaceInputs(){return this.replaceInputs;}
    public void setReplaceInputs(List<PedagogicalSoftwareInput> pedagogicalSoftwareInputs){this.replaceInputs = pedagogicalSoftwareInputs;}


    /**
     * Default constructor
     */
    public NextStepHint(){}

    /**
     * Add elements to the add list
     * @param addElements
     */
    public void putAddElements(List<PedagogicalSoftwareElement> addElements){
        this.addElements.addAll(addElements);
    }

    /**
     * Add element to the add list
     * @param addElement
     */
    public void putAddElements(PedagogicalSoftwareElement addElement){
        this.addElements.add(addElement);
    }

    /**
     * Add elements to the delete list
     * @param deleteElements
     */
    public void putDeleteElements(List<PedagogicalSoftwareElement> deleteElements){
        this.deleteElements.addAll(deleteElements);
    }

    /**
     * Add element to the delete list
     * @param deleteElement
     */
    public void putDeleteElements(PedagogicalSoftwareElement deleteElement){
        this.deleteElements.add(deleteElement);
    }

    /**
     * Add elements to the replace input list
     * @param replaceInputs
     */
    public void putReplaceInputs(List<PedagogicalSoftwareInput> replaceInputs){
        this.replaceInputs.addAll(replaceInputs);
    }

    /**
     * Add element to the replace input list
     * @param replaceInput
     */
    public void putReplaceInputs(PedagogicalSoftwareInput replaceInput){
        this.replaceInputs.add(replaceInput);
    }

}
