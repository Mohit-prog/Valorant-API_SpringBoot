package com.Valorant.API.Service.Agent;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Valorant.API.Data.Agent.AgentDetails;
import com.Valorant.API.Data.JPARepository.AgentDetailsRepository;

@Service
public class AgentDetailService {
    @Autowired
    AgentDetailsRepository agentDetailsRepository;

    public Optional<AgentDetails> getAgentDetail(int id) {
        return agentDetailsRepository.findById(id);
    }

}
