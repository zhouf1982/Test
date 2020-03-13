package com.springboottest.tactics;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Resolver implements InitializingBean, ApplicationContextAware {

  private ApplicationContext applicationContext;

  private Map<String, Trade> handlerMap = new HashMap<>();

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    Map<String, Trade> beanMap = applicationContext.getBeansOfType(Trade.class);
    for (String key : beanMap.keySet()) {
      this.handlerMap.put(beanMap.get(key).name(), beanMap.get(key));
    }
  }

  public Trade getHandler(String key) {
    return this.handlerMap.get(key);
  }
}
