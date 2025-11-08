package com.ewallet.notification.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class NotificationRequest {

    @NotBlank(message = "Merchant ID is required")
    private String merchantId;

    @NotBlank(message = "Merchant email is required")
    @Email(message = "Invalid email format")
    private String merchantEmail;

    @NotBlank(message = "Transaction ID is required")
    private String transactionId;

    @NotNull(message = "Amount is required")
    @Positive(message = "Amount must be greater than zero")
    private Double amount;

    @NotBlank(message = "Currency is required")
    private String currency;

    @NotBlank(message = "Message cannot be empty")
    private String message;

    // Getters and setters
    public String getMerchantId() { return merchantId; }
    public void setMerchantId(String merchantId) { this.merchantId = merchantId; }

    public String getMerchantEmail() { return merchantEmail; }
    public void setMerchantEmail(String merchantEmail) { this.merchantEmail = merchantEmail; }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
