package com.jim.request;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Adaptee {
    public void specificRequest(){
      log.debug("specific request....");
    }
}
