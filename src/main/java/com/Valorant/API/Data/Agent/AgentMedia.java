package com.Valorant.API.Data.Agent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AgentMedia {
    @Id
    @GeneratedValue
    private int uuid;

    private String backgroundImage;

    private String bustPortrait;

    private int voiceline;

    public AgentMedia() {
    }

    public AgentMedia(int uuid, String backgroundImage, String bustPortrait, int voiceline) {
        this.uuid = uuid;
        this.backgroundImage = backgroundImage;
        this.bustPortrait = bustPortrait;
        this.voiceline = voiceline;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getBustPortrait() {
        return bustPortrait;
    }

    public void setBustPortrait(String bustPortrait) {
        this.bustPortrait = bustPortrait;
    }

    public int getVoiceline() {
        return voiceline;
    }

    public void setVoiceline(int voiceline) {
        this.voiceline = voiceline;
    }

    @Override
    public String toString() {
        return "AgentMedia [uuid=" + uuid + ", backgroundImage=" + backgroundImage + ", bustPortrait=" + bustPortrait
                + ", voiceline=" + voiceline + "]";
    }

}
