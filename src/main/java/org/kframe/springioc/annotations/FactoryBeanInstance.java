package org.kframe.springioc.annotations;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanInstance  implements FactoryBean<String>{

	@Override
	public String getObject() throws Exception {
		return "hehe";
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return String.class;
	}

}
