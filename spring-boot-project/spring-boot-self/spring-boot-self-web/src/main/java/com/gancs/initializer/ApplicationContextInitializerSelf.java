package com.gancs.initializer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @author gancs
 * @description
 * @date 2020/7/16
 */

public class ApplicationContextInitializerSelf implements ApplicationContextInitializer, Ordered {

	private static final Log logger = LogFactory.getLog(ApplicationContextInitializerSelf.class);

	private Integer order = 100;

	public void setOrder(Integer order) {
		this.order = order;
	}

	public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
		// 打印容器里面有多少个bean
		System.out.println("bean count=====" + configurableApplicationContext.getBeanDefinitionCount());

		// 打印人所有 beanName
		System.out.println(configurableApplicationContext.getBeanDefinitionCount() + "个Bean的名字如下：");
		String[] beanDefinitionNames = configurableApplicationContext.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNames) {
			System.out.println(beanName);
		}
	}

	public int getOrder() {
		return this.order;
	}
}
