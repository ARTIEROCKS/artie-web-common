package artie.common.web.enums;

public enum FaceEnum {
    HIGH("HIGH"),
    LOW("LOW");

    private String value;
    private FaceEnum(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
