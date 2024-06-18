package com.example.marcheurblanc.carte;

import com.example.marcheurblanc.Lieu;
import com.example.marcheurblanc.Rue;
import java.util.Map;

import java.util.Map;

class Carte {
    private Map<String, Lieu> lieux;
    private Map<String, Rue> rues;

    public Carte(Map<String, Lieu> lieux, Map<String, Rue> rues) {
        this.lieux = lieux;
        this.rues = rues;
    }

    public Map<String, Lieu> getLieux() {
        return lieux;
    }

    public Map<String, Rue> getRues() {
        return rues;
    }
}
