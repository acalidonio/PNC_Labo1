package com.acalidonio.pnc_labo1.common;

import com.acalidonio.pnc_labo1.domain.entities.Pokemon;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class PokemonList {
    private final List<Pokemon> pokemonList;
    public PokemonList() {
        this.pokemonList =  new ArrayList<>();

        this.pokemonList.add(Pokemon.builder()
                .name("Lapras")
                .types(List.of("Agua", "Hielo"))
                .weaknesses(List.of("Electrico", "Lucha", "Planta"))
                .zoneType(List.of("Ruta 12", "Ruta 19", "Ruta 22"))
                .regions(List.of("Kanto", "Unova"))
                .build());

        this.pokemonList.add(Pokemon.builder()
                .name("Bulbasaur")
                .types(List.of("Planta"))
                .weaknesses(List.of("Hielo", "Volador"))
                .zoneType(List.of("Ruta 1", "Ruta 15"))
                .regions(List.of("Kanto"))
                .build());

        this.pokemonList.add(Pokemon.builder()
                .name("Staraptor")
                .types(List.of("Normal", "Volador"))
                .weaknesses(List.of("Electrico", "Hielo"))
                .zoneType(List.of("Ruta 15", "Ruta 25", "Ruta 26"))
                .regions(List.of("Sinnoh", "Unova"))
                .build());
    }
}
