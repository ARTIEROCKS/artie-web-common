package artie.common.web.enums;

public enum ToneOfVoiceEnum {
    HIGH("HIGH"),
    LOW("LOW");

    private String value;
    private ToneOfVoiceEnum(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
