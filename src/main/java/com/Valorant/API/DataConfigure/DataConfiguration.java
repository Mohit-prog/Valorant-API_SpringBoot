package com.Valorant.API.DataConfigure;

import java.util.ArrayList;
import java.util.List;

import com.Valorant.API.Constant;
import com.Valorant.API.Data.Agent.Agent;
import com.Valorant.API.Data.Agent.AgentAbility;
import com.Valorant.API.Data.Agent.AgentDetails;
import com.Valorant.API.Data.Agent.AgentMedia;
import com.Valorant.API.Data.JPARepository.AgentAbilityRepository;
import com.Valorant.API.Data.JPARepository.AgentDetailsRepository;
import com.Valorant.API.Data.JPARepository.AgentMediaRepository;
import com.Valorant.API.Data.JPARepository.AgentRepository;
import com.Valorant.API.Data.JPARepository.MapRepository;
import com.Valorant.API.Data.Map.Map;

public class DataConfiguration {
    // https://valorant-web-api.up.railway.app/agents

    private static String displayName[] = Constant.displayName;

    public static void configureAgentData(AgentRepository agentRepository, AgentMediaRepository agentMediaRepository) {

        String backImg[] = Constant.backgroundImage;
        String bust[] = Constant.bustPotrait;
        int voice[] = Constant.voiceline;

        String role[] = Constant.role;
        String ultimate[] = Constant.ultimate;

        for (int i = 1; i <= Constant.AGENT_COUNT; i++) {
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

    }

    public static void configureAgentDetails(AgentDetailsRepository agentDetailsRepository,
            AgentAbilityRepository agentAbilityRepository) {

        // private int id;

        // private String displayName;

        String agentDescription[] = Constant.agentDescription;

        // private List<AgentAbility> ability;
        String abilityDisplayName[][] = Constant.abilityNames;

        String abilityDisplayIcon[][] = Constant.abilityIcons;

        String abilityDescription[][] = Constant.abilityDescriptions;

        String abilitiyMedia[][] = Constant.abilityVideos;

        for (int i = 1; i <= Constant.AGENT_COUNT; i++) {
            AgentDetails agent = new AgentDetails();
            agent.setId(i);
            ;
            agent.setDisplayName(displayName[i - 1]);
            agent.setDescription(agentDescription[i - 1]);

            List<AgentAbility> abilityList = new ArrayList<>();

            for (int j = 1; j <= 4; j++) {
                AgentAbility ability = new AgentAbility();
                ability.setId((i * 10) + j);
                ability.setDisplayName(abilityDisplayName[i - 1][j - 1]);
                ability.setDisplayIcon(abilityDisplayIcon[i - 1][j - 1]);
                ability.setDescription(abilityDescription[i - 1][j - 1]);
                ability.setAbilitiyMedia(abilitiyMedia[i - 1][j - 1]);
                agentAbilityRepository.save(ability);
                abilityList.add(ability);
            }
            agent.setAbility(abilityList);
            agentDetailsRepository.save(agent);

        }

    }

    public static void configureMaps(MapRepository mapRepository) {

        String mapNames[] = Constant.mapDisplayNames;
        String mapDescription[] = Constant.mapDescription;
        String mapFeaturedImage[] = Constant.mapFeaturedImage;
        String miniMapImages[] = Constant.miniMapImages;
        String galleryImages[][] = Constant.mapGalleryImages;

        for (int i = 1; i <= Constant.MAP_COUNT; i++) {

            Map map = new Map();
            map.setId(i);
            map.setDisplayName(mapNames[i - 1]);
            map.setDescription(mapDescription[i - 1]);
            map.setFeaturedImage(mapFeaturedImage[i - 1]);
            ArrayList<String> gImages = new ArrayList<>();

            for (String img : galleryImages[i - 1]) {
                gImages.add(img);

            }
            map.setGalleryImages(gImages);
            map.setMiniMapImage(miniMapImages[i - 1]);
            mapRepository.save(map);
        }

    }
}
