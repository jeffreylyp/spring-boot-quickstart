package com.yongpoliu.spring.boot.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;
import javax.sql.DataSource;

@ImportResource("classpath:spring.xml")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
                                  DataSourceTransactionManagerAutoConfiguration.class})
public class Startup {

  private static final Logger LOGGER = LoggerFactory.getLogger(Startup.class);

  @Resource
  private DataSource dataSourceX;

  @Bean
  CommandLineRunner createCLR(final ChargeService chargeService) {
    LOGGER.warn("dataSourceX is {}", dataSourceX);
    return arg -> chargeService.test();
  }

  public static void main(String[] args) {
    SpringApplication.run(Startup.class, args);
  }
}
