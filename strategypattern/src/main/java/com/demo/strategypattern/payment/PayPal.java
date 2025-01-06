package com.demo.strategypattern.payment;

import org.springframework.stereotype.Component;

import com.demo.strategypattern.interfacedemo.PaymentStrategy;

@Component("payPalPayment")
public class PayPal implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Paid: "+amount+" using PayPal.");
		
	}
}
