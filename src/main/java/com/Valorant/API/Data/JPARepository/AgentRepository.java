package com.Valorant.API.Data.JPARepository;

import org.springframework.data.repository.CrudRepository;

import com.Valorant.API.Data.Agent.Agent;

public interface AgentRepository extends CrudRepository<Agent, Integer> {

}
