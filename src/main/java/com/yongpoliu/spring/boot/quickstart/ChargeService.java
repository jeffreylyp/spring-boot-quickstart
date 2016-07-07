package com.yongpoliu.spring.boot.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ChargeService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ChargeService.class);

  @Resource private JdbcTemplate commonJdbcTemplate;

  @Resource private DBInfo dbInfo;

  public void test() {
    Integer i = commonJdbcTemplate.queryForObject("select 1 from dual", Integer.class);
    LOGGER.warn("ChargeService test got {}, dbInfo is {}", i, dbInfo);
  }
}
