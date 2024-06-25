package net.jababackend.demospringbootjakartafaces.controllers;

import jakarta.enterprise.context.RequestScoped;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.jababackend.demospringbootjakartafaces.service.TestService;
import org.springframework.stereotype.Controller;

import java.io.Serializable;

@Controller
@RequestScoped
@Slf4j
@RequiredArgsConstructor
public class MyBean implements Serializable {

  private final TestService testService;

  public void printMessage() {

      log.info("Button was clicked! {}", testService.getMessage());
  }
}
