package com.gtsasil.payroll.services;

import org.springframework.stereotype.Service;

import com.gtsasil.payroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("bob", 200.0, days);
	}

}
