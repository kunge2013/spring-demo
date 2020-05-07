package org.kframe.springioc.annotations;

import org.kframe.springioc.annotations.aop.ArithmeticCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {
	
	private static AnnotationConfigApplicationContext context;
	
	public static void main(String[] args) throws Exception {
		System.out.println("=======================begin  AnnotationConfigApplicationContext=======================================");
		context = new AnnotationConfigApplicationContext("org.kframe.springioc.annotations");
		ArithmeticCalculator calc = context.getBean(ArithmeticCalculator.class);
		FactoryBeanInstance o = (FactoryBeanInstance) context.getBean("&factoryBeanInstance");
		Object hash = context.getBean("factoryBeanInstance");
		System.out.println(o.hashCode() + hash.toString());
		System.out.println(calc.add(1, 2));
		Thread.sleep(1000 * 60);
//		System.out.println("String==== 代码手动注入后的String ：" +  context.getBean("String"));
//		System.out.println("config==== name 被改编后的值 ：" +  context.getBean(Config.class).getName());
	}
	
}
