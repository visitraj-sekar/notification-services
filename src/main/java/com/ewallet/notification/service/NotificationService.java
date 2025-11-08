package com.ewallet.notification.service;

import com.ewallet.notification.model.NotificationRequest;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String sendNotification(NotificationRequest request) {
        System.out.println("✅ Sending notification to merchant: " + request.getMerchantId());
        System.out.println("Transaction ID: " + request.getTransactionId());
        System.out.println("Amount: " + request.getAmount() + " " + request.getCurrency());
        return "Notification sent successfully to merchant " + request.getMerchantId();
    }
}