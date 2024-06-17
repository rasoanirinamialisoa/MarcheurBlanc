package com.example.marcheurblanc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Lieu {
    private String nom;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lieu lieu = (Lieu) o;

        return nom != null ? nom.equals(lieu.nom) : lieu.nom == null;
    }

    @Override
    public int hashCode() {
        return nom != null ? nom.hashCode() : 0;
    }
}
