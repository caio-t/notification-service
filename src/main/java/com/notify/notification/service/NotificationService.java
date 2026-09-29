package com.notify.notification.service;

import org.springframework.stereotype.Service;
import com.notify.notification.domain.NotificationTemplateEnvelopModel;
import com.notify.notification.domain.NotificationEnvelop;
@Service
public class NotificationService {

    public NotificationService() {
    }

    public NotificationTemplateEnvelopModel getTemplate(NotificationEnvelop code) {
        return switch (code) {
            case REUSED -> new NotificationTemplateEnvelopModel(
                    "Uma campanha {{campaigncode}} foi criada a partir de uma campanha reutilizada",
                    "Olá {{employeename}}..."
            );
            case CREATED -> new NotificationTemplateEnvelopModel(
                    "Uma campanha {{campaigncode}} acabou de ser criada",
                    "Olá {{employeename}}..."
            );
            default -> new NotificationTemplateEnvelopModel(
                    "Messaging center: Unknown message",
                    "Messaging center: Unknown message"
            );
        };
    }
}
