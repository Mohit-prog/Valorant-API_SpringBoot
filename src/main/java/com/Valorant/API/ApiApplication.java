package com.Valorant.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Valorant.API.Data.JPARepository.AgentAbilityRepository;
import com.Valorant.API.Data.JPARepository.AgentDetailsRepository;
import com.Valorant.API.Data.JPARepository.AgentMediaRepository;
import com.Valorant.API.Data.JPARepository.AgentRepository;
import com.Valorant.API.Data.JPARepository.MapRepository;
import com.Valorant.API.DataConfigure.DataConfiguration;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApiApplication.class, args);

		/****************** Filling and saving Agent Page data************** */
		// AgentRepository agentRepository = context.getBean(AgentRepository.class);
		// AgentMediaRepository agentMediaRepository =
		// context.getBean(AgentMediaRepository.class);

		// DataConfiguration.configureAgentData(agentRepository, agentMediaRepository);

		// /****************** Filling and saving agent Details Page data**************
		// */
		// AgentDetailsRepository agentDetailsRepository =
		// context.getBean(AgentDetailsRepository.class);
		// AgentAbilityRepository agentAbilityRepository =
		// context.getBean(AgentAbilityRepository.class);
		// DataConfiguration.configureAgentDetails(agentDetailsRepository,
		// agentAbilityRepository);

		// MapRepository mapRepository = context.getBean(MapRepository.class);
		// DataConfiguration.configureMaps(mapRepository);

	}

}
