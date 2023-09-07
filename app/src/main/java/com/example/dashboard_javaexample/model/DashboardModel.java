package com.example.dashboard_javaexample.model;

public class DashboardModel {
    String Name;
    String Genre;
    String Rate;
    String ImageURI;

    public DashboardModel(String name, String genre, String rate, String imageURI) {
        Name = name;
        Genre = genre;
        Rate = rate;
        ImageURI = imageURI;
    }

    public String getName() {
        return Name;
    }

    public String getGenre() {
        return Genre;
    }

    public String getRate() {
        return Rate;
    }

    public String getImageURI() {
        return ImageURI;
    }
}
