package com.notify.notification.application;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public NotificationService() {
    }

    public String getNotificationList() {
        return "Notification List";
    }
}
