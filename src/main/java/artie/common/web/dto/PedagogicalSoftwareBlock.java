package artie.common.web.dto;

public class PedagogicalSoftwareBlock {

    private PedagogicalSoftwareBlock previousBlock;
    private String blockName;
    private PedagogicalSoftwareBlock nextBlock;

    public String getBlockName() {
        return blockName;
    }
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public PedagogicalSoftwareBlock getPreviousBlock(){return this.previousBlock; }
    public void setPreviousBlock(PedagogicalSoftwareBlock previousBlock){this.previousBlock = previousBlock;}

    public PedagogicalSoftwareBlock getNextBlock(){return this.nextBlock;}
    public void setNextBlock(PedagogicalSoftwareBlock nextBlock){this.nextBlock = nextBlock;}

    /**
     * Default constructor
     */
    public PedagogicalSoftwareBlock(){}

    /**
     * Parameterized constructor
     * @param blockName
     * @param previousBlock
     * @param nextBlock
     */
    public PedagogicalSoftwareBlock(String blockName, PedagogicalSoftwareBlock previousBlock, PedagogicalSoftwareBlock nextBlock) {
        this.blockName = blockName;
        this.previousBlock = previousBlock;
        this.nextBlock = nextBlock;
    }
}
