package com.demo.strategypattern.payment;

import org.springframework.stereotype.Component;

import com.demo.strategypattern.interfacedemo.PaymentStrategy;

@Component("creditCardPayment")
public class CreditCard  implements PaymentStrategy{
	
	
	@Override
	public void pay(double amount) {
		System.out.println("Paid:"+amount+" using Credit Card.");
	}
	
	

}
