package com.gancs.config;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * @author gancs
 * @description
 * @date 2020/8/7
 */
@Component
@ManagedResource(objectName = "com.gancs.config:name=MyBean")
public class MyBean {

	private String name;

	@ManagedAttribute
	public String getName() {
		return name;
	}

	@ManagedAttribute
	public void setName(String name) {
		this.name = name;
	}

	@ManagedOperation
	public String operatorName(){
		return this.name;
	}
}
