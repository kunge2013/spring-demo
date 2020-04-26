package org.kframe.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		IDbService dbService = context.getBean(IDbService.class);
		IDbService dbService2 = context.getBean(IDbService.class);
		System.out.println("dbService hashcode ==" + dbService.hashCode() + ", dbService2 ===" + dbService2.hashCode());
		dbService.save();
	}
}
