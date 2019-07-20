package com.aiden.myproject;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;

public class ProjectInitializer implements WebApplicationInitializer {

	public void onStartup(final ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		registerDispatcherServlet(servletContext);
	}
	
	private void registerDispatcherServlet(ServletContext servletContext){
		WebApplicationContext dispatcher
	}
	
	private WebApplicationContext createContext(Class<?>... annotatedClasses){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(annotatedClasses);
		
		return context;
	}

}
