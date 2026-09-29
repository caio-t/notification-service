package com.notify.notification.domain;

public enum NotificationSituation {
    NEW(1),
    READ(2),
    SENT(3),
    ERROR(4);

    private final int status;
    NotificationSituation(int status) {
        this.status = status;
    }

    public int getStatusCode() {
        return this.status;
    }

    public String getStatusDescription() {
        return switch (this.getStatusCode()) {
            case 1 -> "New";
            case 2 -> "READ";
            case 3 -> "SENT";
            case 4 -> "ERROR";
            default -> "UNKNOWN";
        };
    }
}
