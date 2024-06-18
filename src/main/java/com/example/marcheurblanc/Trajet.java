package com.example.marcheurblanc;


import java.util.List;

public class Trajet {
    private List<Lieu> chemin;

    public Trajet(List<Lieu> chemin) {
        this.chemin = chemin;
    }

    public List<Lieu> getChemin() {
        return chemin;
    }
}
