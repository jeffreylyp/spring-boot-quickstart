package com.yongpoliu.spring.boot.quickstart;

import com.google.common.collect.Maps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
public class Hello {

  @RequestMapping(
      value = "/",
      params = {"appName", "env"},
      method = RequestMethod.GET)
  public void get(String appName, String env, HttpServletResponse response) throws IOException {
    final Map<String, String> s = concatName(appName, env);

    for (Map.Entry<String, String> entry : s.entrySet()) {
      response.getOutputStream().println(entry.getKey()+ "=" + entry.getValue());
    }
  }

  private Map<String, String> concatName(String name, String env) {
    Map<String, String> m = Maps.newHashMap();
    m.put("eadmarket.account.id", "0");

    m.put("eadmarket.db.url", "jdbc:mysql://admarket.mysql.rds.aliyuncs.com:3306/eadmarket?characterEncoding=UTF-8");
    m.put("eadmarket.db.password", "1admarket");
    m.put("eadmarket.db.username", "eadmarket");

    m.put("education.db.url", "jdbc:mysql://admarket.mysql.rds.aliyuncs.com:3306/eadmarket?characterEncoding=UTF-8");
    m.put("education.db.password", "1admarket");
    m.put("education.db.username", "eadmarket");

    m.put("file.destination.path", "/var/img/edu_app");
    m.put("eadmarket.log.level", "warn");
    m.put("eadmarket.log.root", "/data0/pangu/logs/");
    m.put("eadmarket.com", "www.eadmarket.com");
    return m;
  }

  public static void main(String[] args) {
    SpringApplication.run(Hello.class, args);
  }
}
