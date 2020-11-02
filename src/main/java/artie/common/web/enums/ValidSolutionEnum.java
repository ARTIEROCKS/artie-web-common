package artie.common.web.enums;

public enum ValidSolutionEnum {

    WAITING_APPROVAL(0),
    REJECTED(1),
    VALIDATED(2);

    private int value;
    private ValidSolutionEnum(int value) {
        this.value=value;
    }
    public int getValue() {
        return value;
    }
}
