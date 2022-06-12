package artie.common.web.enums;

public enum EmotionalStateEnum {

    ANGRY("ANGRY"),
    FEAR("FEAR"),
    HAPPY("HAPPY"),
    SAD("SAD"),
    SURPRISE("SURPRISE"),
    NEUTRAL("NEUTRAL");

    private String value;
    private EmotionalStateEnum(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
