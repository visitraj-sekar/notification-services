package com.ewallet.notification.controller;

import com.ewallet.notification.model.NotificationRequest;
import com.ewallet.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/send")
    public ResponseEntity<Map<String, Object>> sendNotification(@RequestBody NotificationRequest request) {
        String status = notificationService.sendNotification(request);

        Map<String, Object> response = new HashMap<>();
        response.put("transactionId", request.getTransactionId());
        response.put("merchantId", request.getMerchantId());
        response.put("status", "SUCCESS");
        response.put("message", status);

        return ResponseEntity.ok(response);
    }
}