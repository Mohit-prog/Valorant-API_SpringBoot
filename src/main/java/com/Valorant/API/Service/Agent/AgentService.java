package com.Valorant.API.Service.Agent;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Valorant.API.Data.Agent.Agent;
import com.Valorant.API.Data.JPARepository.AgentRepository;

@Service
public class AgentService {

    @Autowired
    AgentRepository agentRepository;

    public Optional<Agent> getAgentDetail(int id) {
        return agentRepository.findById(id);
    }

    public ArrayList<Agent> getAllAgents() {

        return (ArrayList<Agent>) agentRepository.findAll();

    }
}
