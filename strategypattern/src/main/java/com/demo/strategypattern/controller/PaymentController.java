package com.demo.strategypattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.strategypattern.main.PaymentType;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	private final PaymentType paymentTypeService;

	@Autowired
	public PaymentController(PaymentType paymentType) {
		this.paymentTypeService = paymentType;
	}

	@PostMapping("/pay")
	public String pay(@RequestParam String paymentType, @RequestParam double amount) {
		try {
			paymentTypeService.executePayment(paymentType, amount); // Calls the executePayment method
			return "Payment of " + amount + " using " + paymentType + " processed successfully.";
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
			return "Payment failed: " + e.getMessage();
		}

	}
}
