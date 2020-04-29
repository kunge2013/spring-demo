package org.kframe.springioc.annotations;

import org.springframework.stereotype.Component;

@Component
public class Config {

	private String name = Config.class.toString();

	@Override
	public String toString() {
		return "Config [name=" + name + "]";
	}
	
	
}
