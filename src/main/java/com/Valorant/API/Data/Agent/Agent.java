package com.Valorant.API.Data.Agent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Agent {

    @Id
    @GeneratedValue
    private int uuid;

    private String displayName;

    private String ultimate;

    private String role;

    @OneToOne
    private AgentMedia agentMedia;

    public Agent() {
    }

    public Agent(int uuid, String displayName, String ultimate, String role, AgentMedia agentMedia) {
        this.uuid = uuid;
        this.displayName = displayName;
        this.ultimate = ultimate;
        this.role = role;
        this.agentMedia = agentMedia;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public AgentMedia getAgentMedia() {
        return agentMedia;
    }

    public void setAgentMedia(AgentMedia agentMedia) {
        this.agentMedia = agentMedia;
    }

    @Override
    public String toString() {
        return "Agent [uuid=" + uuid + ", displayName=" + displayName + ", ultimate=" + ultimate + ", role=" + role
                + ", agentMedia=" + agentMedia + "]";
    }

}
