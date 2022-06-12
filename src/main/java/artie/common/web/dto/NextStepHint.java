package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NextStepHint {

    private List<PedagogicalSoftwareBlock> addBlocks = new ArrayList<>();
    private List<PedagogicalSoftwareBlock> deleteBlocks = new ArrayList<>();
    private List<PedagogicalSoftwareInput> replaceInputs = new ArrayList<>();
    private List<PedagogicalSoftwareBlock> replacePositions = new ArrayList<>();


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
