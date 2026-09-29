package com.notify.notification.domain;

public enum NotificationEnvelop {
    CREATED(100),
    REUSED(101);

    private final int envelop;
    NotificationEnvelop(int envelop) {
        this.envelop = envelop;
    }

    public int getEnvelopCode() {
        return this.envelop;
    }

    public String getStatusDescription() {
        return switch (this.getEnvelopCode()) {
            case 1 -> "Created";
            case 2 -> "Reused";
            default -> "UNKNOWN";
        };
    }
}
