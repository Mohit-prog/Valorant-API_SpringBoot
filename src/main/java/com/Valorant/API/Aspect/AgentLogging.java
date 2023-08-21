package com.Valorant.API.Aspect;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterReturning;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AgentLogging {
    static Logger logger = Logger.getLogger(AgentLogging.class.getName());

    @AfterReturning("execution(* com.Valorant.API.DataConfigure.DataConfiguration.configureAgentData(..))")
    void SuccessLogger() {
        logger.log(Level.INFO, "Agent Data filled successfully");
    }

}
