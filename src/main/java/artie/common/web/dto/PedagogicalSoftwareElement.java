package artie.common.web.dto;

public class PedagogicalSoftwareElement {

    private PedagogicalSoftwareElement previousElement;
    private String elementName;
    private PedagogicalSoftwareElement nextElement;

    public String getElementName() {
        return elementName;
    }
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public PedagogicalSoftwareElement getPreviousElement(){return this.previousElement; }
    public void setPreviousElement(PedagogicalSoftwareElement previousElement){this.previousElement = previousElement;}

    public PedagogicalSoftwareElement getNextElement(){return this.nextElement;}
    public void setNextElement(PedagogicalSoftwareElement nextElement){this.nextElement = nextElement;}

    /**
     * Default constructor
     */
    public PedagogicalSoftwareElement(){}

    /**
     * Parameterized constructor
     * @param elementName
     * @param previousElement
     * @param nextElement
     */
    public PedagogicalSoftwareElement(String elementName, PedagogicalSoftwareElement previousElement, PedagogicalSoftwareElement nextElement) {
        this.elementName = elementName;
        this.previousElement = previousElement;
        this.nextElement = nextElement;
    }
}
