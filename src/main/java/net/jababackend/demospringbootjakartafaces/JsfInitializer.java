package net.jababackend.demospringbootjakartafaces;

import com.sun.faces.config.FacesInitializer;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.jboss.weld.environment.servlet.EnhancedListener;
import org.springframework.boot.web.servlet.ServletContextInitializer;

public class JsfInitializer implements ServletContextInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());

    EnhancedListener cdiInitializer = new EnhancedListener();
    cdiInitializer.onStartup(null, servletContext);

    ServletContainerInitializer facesInitializer = new FacesInitializer();
    facesInitializer.onStartup(null, servletContext);
  }


}
