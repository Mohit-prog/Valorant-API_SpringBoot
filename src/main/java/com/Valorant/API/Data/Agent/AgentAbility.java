package com.Valorant.API.Data.Agent;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class AgentAbility {

    @Id
    private int id;

    private String displayName;

    private String displayIcon;

    private String description;

    private String abilitiyMedia;

    public AgentAbility() {
    }

    public AgentAbility(int id, String displayName, String displayIcon, String description, String abilitiyMedia) {
        this.id = id;
        this.displayName = displayName;
        this.displayIcon = displayIcon;
        this.description = description;
        this.abilitiyMedia = abilitiyMedia;
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

    public String getDisplayIcon() {
        return displayIcon;
    }

    public void setDisplayIcon(String displayIcon) {
        this.displayIcon = displayIcon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbilitiyMedia() {
        return abilitiyMedia;
    }

    public void setAbilitiyMedia(String abilitiyMedia) {
        this.abilitiyMedia = abilitiyMedia;
    }

    @Override
    public String toString() {
        return "AgentAbility [id=" + id + ", displayName=" + displayName + ", displayIcon=" + displayIcon
                + ", description=" + description + ", abilitiyMedia=" + abilitiyMedia + "]";
    }

}
