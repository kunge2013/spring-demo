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
//		System.out.println("instance >>>>>>" + instance.getObject());
//		System.out.println("==============================================================");
		System.out.println("text >>>>>>" + context.getBean(String.class));
		System.out.println("text >>>>>>" + context.getBean(String.class));
		System.out.println("text >>>>>>" + context.getBean(String.class));
		
		System.out.println("ServiceFactoryBeanTest >>>>>>" + context.getBean(ServiceFactoryBeanTest.class));
//		System.out.println("==============================================================");
		//		HashMap<String, Object> map = new HashMap<String, Object>();
		//		map.put("1", "hehe");
		//		context.getBeanFactory().registerSingleton("hello", map);
		//		ConfigInfo configInfo = context.getBean(Config.ConfigInfo.class);
		//		System.out.println(configInfo.toString());
		//		System.out.println(config.toString());
		//		System.out.println(context.getBean("hello"));
	}
	
}
