package com.notify.notification.domain;

public enum NotificationType {
    EMAIL(1),
    SMS(2),
    SYSTEM(3);

    private final int type;
    NotificationType(int type) {
        this.type = type;
    }

    public int getTypeCode() {
        return this.type;
    }

    public String getStatusDescription() {
        return switch (this.getTypeCode()) {
            case 1 -> "EMAIL";
            case 2 -> "SMS";
            case 3 -> "SYSTEM";
            default -> "UNKNOWN";
        };
    }
}
