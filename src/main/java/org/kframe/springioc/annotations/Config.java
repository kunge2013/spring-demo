package org.kframe.springioc.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {

	private String name = Config.class.toString();

	@Override
	public String toString() {
		return "Config [name=" + name + "]";
	}
	
	
	@Bean
	public ConfigInfo configInfo() {
		return new ConfigInfo();
	}

	class ConfigInfo {
		
		private String name = "xx";
		
		private int age = 10;
		
		public ConfigInfo() {
			// TODO Auto-generated constructor stub
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "ConfigInfo [name=" + name + ", age=" + age + "]";
		}
		
		
	}
	
}
