package fit.edu.iuh.vn.labweek1www.enums;

public enum Status {
    ACTIVE("1"),
    DEACTIVE("0"),
    DELETED("-1");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Status fromValue(String value) {
        for (Status status : values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        return DEACTIVE;
    }


}
