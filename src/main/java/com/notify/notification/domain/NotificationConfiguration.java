package com.notify.notification.domain;

public record NotificationConfiguration(
    String title,
    String keyId,
    String messageSystem,
    boolean sendMail,
    boolean sendSms,
    boolean bodyEmail,
    String body
) {}
