package com.brownylin.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public enum AppContext {

	INSTANCE;

	private final AnnotationConfigApplicationContext appContext;

	private AppContext() {
		this.appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
	}

	public AnnotationConfigApplicationContext getAppContext()
	{
		return this.appContext;
	}

}
