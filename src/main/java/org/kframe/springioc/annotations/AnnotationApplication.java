package org.kframe.springioc.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {
	
	private static AnnotationConfigApplicationContext context;
	
	public static void main(String[] args) throws Exception {
		System.out.println("=======================begin  AnnotationConfigApplicationContext=======================================");
		context = new AnnotationConfigApplicationContext("org.kframe.springioc.annotations");
		System.out.println("String==== 代码手动注入后的String ：" +  context.getBean("String"));
		System.out.println("config==== name 被改编后的值 ：" +  context.getBean(Config.class).getName());
	}
	
}
