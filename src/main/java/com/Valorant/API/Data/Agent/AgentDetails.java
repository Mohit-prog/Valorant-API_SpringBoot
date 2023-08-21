package com.Valorant.API.Data.Agent;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class AgentDetails {

    @Id
    @GeneratedValue
    private int id;

    private String displayName;

    private String description;

    @OneToMany
    private List<AgentAbility> ability;

    public AgentDetails() {
    }

    public AgentDetails(int id, String displayName, String description, List<AgentAbility> ability) {
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.ability = ability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AgentAbility> getAbility() {
        return ability;
    }

    public void setAbility(List<AgentAbility> ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "AgentDetails [id=" + id + ", displayName=" + displayName + ", description=" + description + ", ability="
                + ability + "]";
    }

}
