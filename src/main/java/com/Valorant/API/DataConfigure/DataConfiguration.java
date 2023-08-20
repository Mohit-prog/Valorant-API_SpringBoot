package com.Valorant.API.DataConfigure;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.Valorant.API.Constant;
import com.Valorant.API.Data.Agent.Agent;
import com.Valorant.API.Data.Agent.AgentMedia;
import com.Valorant.API.Data.JPARepository.AgentMediaRepository;
import com.Valorant.API.Data.JPARepository.AgentRepository;

public class DataConfiguration {

    static Logger logger = Logger.getLogger(DataConfiguration.class.getName());

    public static void configureAgentData(AgentRepository agentRepository, AgentMediaRepository agentMediaRepository) {

        String backImg[] = Constant.backgroundImage;
        String bust[] = Constant.bustPotrait;
        int voice[] = Constant.voiceline;

        String displayName[] = Constant.displayName;
        String role[] = Constant.role;
        String ultimate[] = Constant.ultimate;

        for (int i = 1; i <= 22; i++) {
            AgentMedia amedia = new AgentMedia();
            amedia.setUuid(i);
            amedia.setBackgroundImage(backImg[i - 1]);
            amedia.setBustPortrait(bust[i - 1]);
            amedia.setVoiceline(voice[i - 1]);
            agentMediaRepository.save(amedia);

            Agent a = new Agent();
            a.setAgentMedia(amedia);
            a.setUuid(i);
            a.setDisplayName(displayName[i - 1]);
            a.setRole(role[i - 1]);
            a.setUltimate(ultimate[i - 1]);

            agentRepository.save(a);
        }

        logger.log(Level.INFO, "Agent Data filled successfully");
    }

}
