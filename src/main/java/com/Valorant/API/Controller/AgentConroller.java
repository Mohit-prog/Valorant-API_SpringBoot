package com.Valorant.API.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Valorant.API.Data.Agent.Agent;
import com.Valorant.API.Data.Agent.AgentDetails;
import com.Valorant.API.Service.Agent.AgentDetailService;
import com.Valorant.API.Service.Agent.AgentService;

@RestController
@RequestMapping("/agents")
public class AgentConroller {

    @Autowired
    AgentService agentService;

    @Autowired
    AgentDetailService agentDetailService;

    @GetMapping
    ArrayList<Agent> getAllAgents() {
        return agentService.getAllAgents();
    }

    @GetMapping("/{id}")
    public AgentDetails getAgentDetail(@PathVariable("id") int id) {
        System.out.println("*****************************");
        System.out.println(id);
        System.out.println("*****************************");
        return agentDetailService.getAgentDetail(id).get();
    }

}
