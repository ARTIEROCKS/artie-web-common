package artie.common.web.enums;

public enum VoiceSpeedEnum {
    HIGH("HIGH"),
    LOW("LOW");

    private String value;
    private VoiceSpeedEnum(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
