package org.kframe.springioc.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.kframe.springioc.annotations");
		Config config = context.getBean(Config.class);
		System.out.println(config.toString());
	}
}
