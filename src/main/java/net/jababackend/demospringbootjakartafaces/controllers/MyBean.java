package net.jababackend.demospringbootjakartafaces.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.logging.Logger;

@Named
@RequestScoped
public class MyBean {

  private static final Logger logger = Logger.getLogger(MyBean.class.getName());

  public void printMessage() {
    logger.info("Button was clicked!");
  }
}
