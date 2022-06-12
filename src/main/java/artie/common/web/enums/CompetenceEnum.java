package artie.common.web.enums;

public enum CompetenceEnum {
    HIGH("HIGH"),
    LOW("LOW");

    private String value;
    private CompetenceEnum(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
