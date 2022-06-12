package artie.common.web.enums;

public enum GestureEnum {
    HIGH("HIGH"),
    LOW("LOW");

    private String value;
    private GestureEnum(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
