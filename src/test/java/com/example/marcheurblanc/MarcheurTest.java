package com.example.marcheurblanc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MarcheurTest {
    private Lieu HEI;
    private Lieu Pullman;
    private Lieu Balancoire;
    private Lieu ESTI;
    private Carte carte;

    @BeforeEach
    public void setUp() {
        HEI = new Lieu("HEI");
        Pullman = new Lieu("Pullman");
        Balancoire = new Lieu("Balancoire");
        ESTI = new Lieu("ESTI");

        Map<String, Lieu> lieux = new HashMap<>();
        lieux.put(HEI.getNom(), HEI);
        lieux.put(Pullman.getNom(), Pullman);
        lieux.put(Balancoire.getNom(), Balancoire);
        lieux.put(ESTI.getNom(), ESTI);

        Map<String, Rue> rues = new HashMap<>();
        Rue rue1 = new Rue(HEI, Pullman, "Andriatsihoarana");
        Rue rue2 = new Rue(Pullman, Balancoire, "Ranaivo");
        Rue rue3 = new Rue(Balancoire, ESTI, "SansNom");
        rues.put("Andriatsihoarana", rue1);
        rues.put("Ranaivo", rue2);
        rues.put("SansNom", rue3);

        carte = new Carte(lieux, rues);
    }

    @Test
    public void testMarcherVersDestination() {
        Marcheur marcheur = new Marcheur("Islande", HEI);
        Trajet trajet = marcheur.marcher(HEI, ESTI, carte);

        assertNotNull(trajet);
        assertFalse(trajet.getChemin().isEmpty());
        assertEquals(HEI, trajet.getChemin().get(0));
        assertEquals(ESTI, trajet.getChemin().get(trajet.getChemin().size() - 1));
        assertTrue(marcheur.getLieuxVisites().contains(ESTI));
        System.out.println("Trajet parcouru :");
        for (Lieu lieu : trajet.getChemin()) {
            System.out.println(lieu.getNom());
        }
    }
}
