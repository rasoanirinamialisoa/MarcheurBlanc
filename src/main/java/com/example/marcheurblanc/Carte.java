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




}