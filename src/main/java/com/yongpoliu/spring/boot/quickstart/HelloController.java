package com.yongpoliu.spring.boot.quickstart;

import com.google.common.base.Joiner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;

@Controller
@RequestMapping("/url")
public class HelloController {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

  @RequestMapping("")
  @ResponseBody
  public String get(ServletRequest request) {
    LOGGER.debug("params : {}", Joiner.on(',').withKeyValueSeparator("=").join(request.getParameterMap()));
    return "127.0.0.1";
  }
}
