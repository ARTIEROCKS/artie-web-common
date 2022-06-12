package artie.common.web.enums;

public enum MotivationEnum {
    HIGH("HIGH"),
    LOW("LOW");

    private String value;
    private MotivationEnum(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
