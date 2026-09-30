package com.notify.notification.domain;

public record User(
        String id,
        UserType userType,
        String phone,
        String email
) { }
