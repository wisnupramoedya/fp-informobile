package com.wisnupram.satelitlist.model;

import com.google.gson.annotations.SerializedName;

public class RetroPhoto {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("propellant")
    private String propellant;
    @SerializedName("imageurl")
    private String imageURL;
    @SerializedName("technologyexists")
    private int technologyExists;

    public RetroPhoto(int id, String name, String propellant, String imageURL, int technologyExists) {
        this.id = id;
        this.name = name;
        this.propellant = propellant;
        this.imageURL = imageURL;
        this.technologyExists = technologyExists;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPropellant() {
        return propellant;
    }

    public void setPropellant(String propellant) {
        this.propellant = propellant;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getTechnologyExists() {
        return technologyExists;
    }

    public void setTechnologyExists(int technologyExists) {
        this.technologyExists = technologyExists;
    }
}
