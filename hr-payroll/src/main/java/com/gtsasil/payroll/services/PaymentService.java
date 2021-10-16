package com.gtsasil.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtsasil.payroll.entities.Payment;
import com.gtsasil.payroll.entities.Worker;
import com.gtsasil.payroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
		
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDaily_Income(), days);
	}

}
