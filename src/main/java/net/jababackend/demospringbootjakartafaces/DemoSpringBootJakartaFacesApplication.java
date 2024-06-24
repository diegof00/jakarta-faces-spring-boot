package net.jababackend.demospringbootjakartafaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootJakartaFacesApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoSpringBootJakartaFacesApplication.class, args);
  }

  @Bean
  public ServletContextInitializer facesInitializer() {
    return new JsfInitializer();
  }

}
