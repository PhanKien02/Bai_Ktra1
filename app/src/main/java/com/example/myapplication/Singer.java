package com.example.myapplication;

public class Singer {
  private   String name;
    private String stageName;
    private String nation;
    private  int star;
    private int image;

    public Singer() {
    }

    public Singer(String name, String stageName, String nation, int star, int image) {
        this.name = name;
        this.stageName = stageName;
        this.nation = nation;
        this.star = star;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
