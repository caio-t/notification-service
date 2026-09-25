package com.notify.notification.domain;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notifications")
public class Notification {
    @Id
    private String id;

    private String recipient;

    private NotificationChannel channel;

    private String message;

    private LocalDateTime scheduledAt;

    private int attempts;

    private LocalDateTime createdAt;

    private LocalDateTime sentAt;
}
