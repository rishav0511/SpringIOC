package com.rishav.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringiocApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringiocApplication.class, args);
//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();

//        Sim sim = new Vodafone();
//        sim.calling();
//        sim.data();
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/rishav/beans.xml");
		System.out.println("Config Loaded");
//		Airtel a = (Airtel) context.getBean("airtel");
//		a.calling();
//		a.data();
//		Vodafone v = (Vodafone) context.getBean("vodafone");
//		v.calling();
//		v.data();
		Sim s = context.getBean("sim",Sim.class);
		s.calling();
		s.data();
	}
}
