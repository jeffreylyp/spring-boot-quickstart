package com.yongpoliu.spring.boot.quickstart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
class MyConfiguration {

  @Bean(name = "bean")
  @Conditional(MyConfigurationCondition.class)
  public Object get() {
    return new Object();
  }

  static final class MyConfigurationCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
      return true;
    }
  }

}
