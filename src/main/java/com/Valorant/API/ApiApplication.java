package com.Valorant.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Valorant.API.Data.JPARepository.AgentMediaRepository;
import com.Valorant.API.Data.JPARepository.AgentRepository;
import com.Valorant.API.DataConfigure.DataConfiguration;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApiApplication.class, args);

		/****************** Filling and saving agent data************** */
		AgentRepository agentRepository = context.getBean(AgentRepository.class);
		AgentMediaRepository agentMediaRepository = context.getBean(AgentMediaRepository.class);

		DataConfiguration.configureAgentData(agentRepository, agentMediaRepository);

	}

}
