package com.demo.strategypattern.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.demo.strategypattern.interfacedemo.PaymentStrategy;

@Component
public class PaymentType {

	
	private final ApplicationContext applicationContext;

    @Autowired
    public PaymentType(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void executePayment(String paymentType, double amount) {
        PaymentStrategy paymentStrategy = (PaymentStrategy) applicationContext.getBean(paymentType);
        paymentStrategy.pay(amount);
    }
	
	
}
