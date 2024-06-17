package com.example.marcheurblanc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rue {
    private Lieu lieu1;
    private Lieu lieu2;
    private String nom;

    public Lieu getAutreLieu(Lieu lieu) {
        if (lieu.equals(lieu1)) {
            return lieu2;
        } else if (lieu.equals(lieu2)) {
            return lieu1;
        }
        throw new IllegalArgumentException("Le lieu donné n'est pas connecté par cette rue.");
    }
}
