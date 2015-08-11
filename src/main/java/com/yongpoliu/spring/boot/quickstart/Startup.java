package com.yongpoliu.spring.boot.quickstart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Startup {

  @Bean
  CommandLineRunner createCLR(final ChargeService chargeService) {
    return arg ->
        chargeService.test();
  }

  public static void main(String[] args) {
    SpringApplication.run(Startup.class, args);
  }
}
