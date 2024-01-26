package com.eadp.orderserviceapi.dto.request;

import java.util.Date;

public class PaymentRequestDto {
    private Date date;
    private double amount;
    private String paymentType;
    private Boolean status;
}
