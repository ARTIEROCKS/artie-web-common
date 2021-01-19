package artie.common.web.dto;

import java.util.ArrayList;
import java.util.List;

public class NextStepHint {

    private List<PedagogicalSoftwareBlock> addBlocks = new ArrayList<>();
    private List<PedagogicalSoftwareBlock> deleteBlocks = new ArrayList<>();
    private List<PedagogicalSoftwareInput> replaceInputs = new ArrayList<>();
    private List<PedagogicalSoftwareBlock> replacePositions = new ArrayList<>();

    public List<PedagogicalSoftwareBlock> getAddBlocks() { return addBlocks;}
    public void setAddBlocks(List<PedagogicalSoftwareBlock> addBlocks) {
        this.addBlocks = addBlocks;
    }

    public List<PedagogicalSoftwareBlock> getDeleteBlocks() {
        return deleteBlocks;
    }
    public void setDeleteBlocks(List<PedagogicalSoftwareBlock> deleteBlocks) { this.deleteBlocks = deleteBlocks; }

    public List<PedagogicalSoftwareInput> getReplaceInputs(){return this.replaceInputs;}
    public void setReplaceInputs(List<PedagogicalSoftwareInput> pedagogicalSoftwareInputs){this.replaceInputs = pedagogicalSoftwareInputs;}

    public List<PedagogicalSoftwareBlock> getReplacePositions(){return this.replacePositions;}
    public void setReplacePositions(List<PedagogicalSoftwareBlock> replacePositions){this.replacePositions = replacePositions;}


    /**
     * Default constructor
     */
    public NextStepHint(){}

    /**
     * Add blocks to the add list
     * @param addBlocks
     */
    public void putAddBlocks(List<PedagogicalSoftwareBlock> addBlocks){
        this.addBlocks.addAll(addBlocks);
    }

    /**
     * Add block to the add list
     * @param addBlock
     */
    public void putAddBlocks(PedagogicalSoftwareBlock addBlock){
        this.addBlocks.add(addBlock);
    }

    /**
     * Add blocks to the delete list
     * @param deleteBlocks
     */
    public void putDeleteBlocks(List<PedagogicalSoftwareBlock> deleteBlocks){
        this.deleteBlocks.addAll(deleteBlocks);
    }

    /**
     * Add block to the delete list
     * @param deleteBlock
     */
    public void putDeleteBlocks(PedagogicalSoftwareBlock deleteBlock){
        this.deleteBlocks.add(deleteBlock);
    }

    /**
     * Add item to the replace input list
     * @param replaceInputs
     */
    public void putReplaceInputs(List<PedagogicalSoftwareInput> replaceInputs){
        this.replaceInputs.addAll(replaceInputs);
    }

    /**
     * Add item to the replace input list
     * @param replaceInput
     */
    public void putReplaceInputs(PedagogicalSoftwareInput replaceInput){
        this.replaceInputs.add(replaceInput);
    }

    /**
     * Add item to the replace position list
     * @param replacePosition
     */
    public void putReplacePositions(PedagogicalSoftwareBlock replacePosition){this.replacePositions.add(replacePosition);}
}
