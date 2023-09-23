package fit.edu.iuh.vn.labweek1www.enums;

public enum IsGrant {
    GRANTED("1"),
    DENIED("0"),
    UNKNOWN("-1");

    private final String value;

    IsGrant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static IsGrant fromValue(String value) {
        for (IsGrant isGrant : values()) {
            if (isGrant.value.equals(value)) {
                return isGrant;
            }
        }
        return UNKNOWN;
    }

}
