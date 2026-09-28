package com.notify.notification.controller;
import com.notify.notification.domain.Notification;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import com.notify.notification.dto.CreateNotificationRequest;
import com.notify.notification.application.NotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService notificationService;
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/home")
    public String getNotifications() {

       return notificationService.getNotificationList();
    }

}
