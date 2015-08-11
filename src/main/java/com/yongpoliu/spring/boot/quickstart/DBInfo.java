package com.yongpoliu.spring.boot.quickstart;

import lombok.Data;

@Data
public class DBInfo {
  private String dbUrl;

  private String username;

  private String password;
}
