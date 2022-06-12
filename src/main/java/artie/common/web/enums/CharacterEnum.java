package artie.common.web.enums;

public enum CharacterEnum {
    HIGH("HIGH"),
    LOW("LOW");

    private String value;
    private CharacterEnum(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
