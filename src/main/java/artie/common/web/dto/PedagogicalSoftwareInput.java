package artie.common.web.dto;

public class PedagogicalSoftwareInput {

    private String inputName;
    private String type;
    private String opcode;
    private PedagogicalSoftwareElement element;
    private String inputValue;
    private String solutionValue;

    public String getInputName() {
        return inputName;
    }
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getType() { return type; }
    public void setType(String type){ this.type = type; }

    public String getOpCode() { return opcode; }
    public void setOpcode(String opcode){ this.opcode = opcode; }

    public PedagogicalSoftwareElement getElement() {
        return element;
    }
    public void setElement(PedagogicalSoftwareElement element) {
        this.element = element;
    }

    public String getInputValue() {
        return inputValue;
    }
    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public String getSolutionValue() {
        return solutionValue;
    }
    public void setSolutionValue(String solutionValue) {
        this.solutionValue = solutionValue;
    }

    /**
     * Default constructor
     */
    public PedagogicalSoftwareInput(){}

    /**
     * Parameterized constructor
     * @param inputName
     * @param type
     * @param opcode
     * @param element
     * @param inputValue
     * @param solutionValue
     */
    public PedagogicalSoftwareInput(String inputName, String type, String opcode, PedagogicalSoftwareElement element, String inputValue, String solutionValue) {
        this.inputName = inputName;
        this.type = type;
        this.opcode = opcode;
        this.element = element;
        this.inputValue = inputValue;
        this.solutionValue = solutionValue;
    }
}
