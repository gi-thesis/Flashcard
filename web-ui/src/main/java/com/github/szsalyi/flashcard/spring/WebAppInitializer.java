package com.github.szsalyi.flashcard.spring;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by ssalyi on 9/2/2017.
 */
public class WebAppInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        //when servlet context is loaded spring context loads
        servletContext.addListener(new ContextLoaderListener(context));

        context.register(WebConfig.class);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("Dispatcher",new DispatcherServlet(context));

        dispatcher.addMapping("/");

        //first servlet to be loaded
        dispatcher.setLoadOnStartup(1);
    }
}
