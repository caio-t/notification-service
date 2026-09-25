package com.notify.notification.controller;
import com.notify.notification.domain.Notification;
import com.notify.notification.domain.NotificationStatus;
import com.notify.notification.dto.CreateNotificationRequest;
import com.notify.notification.service.NotificationService;
import jakarta.validation.valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Notification> create(
            @valid @RequestBody CreateNotificationRequest request) {

        Notification notification = notificationService.create(request);

        return  ResponseEntity.status(HttpStatus.CREATED).body(notification);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> findById(
            @PathVariable String id) {
        Notification notification = notificationService.findById(id);

        return ResponseEntity.ok(notification);
    }

    @GetMapping()
    public void Home() {
        System.out.print("Home");
    }

}
