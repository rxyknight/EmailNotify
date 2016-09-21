package com.roy;

import javax.annotation.Resource;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.roy.model.Order;
import com.roy.service.OrderManager;


@SpringBootApplication
@ImportResource("file:config/config.xml")	//configuration file
public class App implements CommandLineRunner {

	@Resource
	private Order order;
	@Resource
	private OrderManager simpleOrderManager;
	
	public static void main(String[] args) {
    	SpringApplication.run(App.class, args);
	}

	public void run(String... args) throws Exception {
		simpleOrderManager.placeOrder(order);
		
	}
	
}

