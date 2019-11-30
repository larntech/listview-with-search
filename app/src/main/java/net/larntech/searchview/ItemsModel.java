package net.larntech.searchview;

import java.io.Serializable;

public class ItemsModel implements Serializable {

    private String name;
    private String email;
    private int images;

    public ItemsModel(String name, String email,int images) {
        this.name = name;
        this.email = email;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
