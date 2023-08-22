package com.Valorant.API.Data.Map;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Map {
    @Id
    private int id;

    private String displayName;

    private String description;

    private String featuredImage;

    private String miniMapImage;

    @Column(length = 3000)
    private List<String> galleryImages;

    public Map() {
    }

    public Map(int id, String displayName, String description, String featuredImage, String miniMapImage,
            List<String> galleryImages) {
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.featuredImage = featuredImage;
        this.miniMapImage = miniMapImage;
        this.galleryImages = galleryImages;
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

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public String getMiniMapImage() {
        return miniMapImage;
    }

    public void setMiniMapImage(String miniMapImage) {
        this.miniMapImage = miniMapImage;
    }

    public List<String> getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(List<String> galleryImages) {
        this.galleryImages = galleryImages;
    }

    @Override
    public String toString() {
        return "Map [displayName=" + displayName + ", description=" + description + ", featuredImage=" + featuredImage
                + ", miniMapImage=" + miniMapImage + ", galleryImages=" + galleryImages + "]";
    }

}
