package org.kframe.springioc.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {
	
	private static AnnotationConfigApplicationContext context;
	
	public static void main(String[] args) throws Exception {
		System.out.println("=======================begin  AnnotationConfigApplicationContext=======================================");
		context = new AnnotationConfigApplicationContext("org.kframe.springioc.annotations");
		System.out.println("=======================end    AnnotationConfigApplicationContext=======================================");
		Config config = context.getBean(Config.class);
		System.out.println("==============================================================");
		FactoryBeanInstance instance = context.getBean(FactoryBeanInstance.class);
		FactoryBeanInstance instance2 = context.getBean(FactoryBeanInstance.class);
		System.out.println(instance.hashCode() == instance2.hashCode());
		System.out.println(instance.getObject().equals(instance.getObject()));
		context.close();
	}
	
}
