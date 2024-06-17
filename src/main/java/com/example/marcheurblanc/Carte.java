package com.example.marcheurblanc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Carte {
    private Map<String, Lieu> lieux;
    private Map<String, Rue> rues;

    public void ajouterLieu(Lieu lieu) {
        lieux.put(lieu.getNom(), lieu);
    }

    public void ajouterRue(Rue rue) {
        rues.put(rue.getNom(), rue);
    }
}
