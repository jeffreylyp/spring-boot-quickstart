package com.yongpoliu.spring.boot.quickstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/hello")
public class HelloController {

  @Resource private Object bean;

  @RequestMapping("")
  @ResponseBody
  public String get() {
    return "Hello Bitch " + bean;
  }
}
