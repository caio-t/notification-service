package com.notify.notification.domain;

public enum UserType {
        ADMIN(1),
        NORMAL(2);
    private final int type;

    UserType(int type) {
        this.type = type;
    }

    int getType() {
        return this.type;
    }
}
