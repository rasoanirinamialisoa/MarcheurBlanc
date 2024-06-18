package com.example.marcheurblanc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@AllArgsConstructor

public class Marcheur {
    private String origine;
    private Lieu positionActuelle;
    private Set<Lieu> lieuxVisites;

    public Marcheur(String origine, Lieu positionActuelle) {
        this.origine = origine;
        this.positionActuelle = positionActuelle;
        this.lieuxVisites = new HashSet<>();
    }

    public Trajet marcher(Lieu depart, Lieu arriver, Map<String, Rue> rues) {
        List<Lieu> chemin = new ArrayList<>();
        chemin.add(depart);
        positionActuelle = depart;
        lieuxVisites.add(depart);

        Random random = new Random();
        while (!positionActuelle.equals(arriver)) {
            List<Rue> ruesDisponiblesTraverser = new ArrayList<>();
            for (Rue rue : rues.values()) {
                if ((rue.getLieu1().equals(positionActuelle) || rue.getLieu2().equals(positionActuelle)) &&
                        (!lieuxVisites.contains(rue.getAutreLieu(positionActuelle)))) {
                    ruesDisponiblesTraverser.add(rue);
                }
            }
            if (ruesDisponiblesTraverser.isEmpty()) break;
            Rue rueAleatoire = ruesDisponiblesTraverser.get(random.nextInt(ruesDisponiblesTraverser.size()));
            positionActuelle = rueAleatoire.getAutreLieu(positionActuelle);
            chemin.add(positionActuelle);
            lieuxVisites.add(positionActuelle);
        }
        return new Trajet(chemin);
    }

    public Set<Lieu> getLieuxVisites() {
        return lieuxVisites;
    }

    public static void main(String[] args) {
        System.out.println("Trajet parcouru :");
    }
}
