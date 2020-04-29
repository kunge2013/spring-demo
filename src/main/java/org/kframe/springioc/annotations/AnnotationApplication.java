package org.kframe.springioc.annotations;

import java.util.HashMap;

import org.kframe.springioc.annotations.Config.ConfigInfo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {
	
	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext("org.kframe.springioc.annotations");
		Config config = context.getBean(Config.class);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("1", "hehe");
		context.getBeanFactory().registerSingleton("hello", map);
		ConfigInfo configInfo = context.getBean(Config.ConfigInfo.class);
		System.out.println(configInfo.toString());
		System.out.println(config.toString());
		System.out.println(context.getBean("hello"));
		
	}
	
}
