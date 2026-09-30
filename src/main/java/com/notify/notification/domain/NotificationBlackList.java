package com.notify.notification.domain;
import com.notify.notification.domain.User;

public record NotificationBlackList (
        String id,
        String notificationId,
        String phone,
        String email,
        User user
){ }
