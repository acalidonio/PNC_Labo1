package com.acalidonio.pnc_labo1.component;

import com.acalidonio.pnc_labo1.domain.entities.Pokemon;
import com.acalidonio.pnc_labo1.service.PokemonService;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PokemonComponent implements CommandLineRunner {
    private final PokemonService pokemonService;

    public PokemonComponent(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Override
    public void run(String @NonNull ... args) {
        System.out.println("Filtro por Tipo: Planta");
        printResult(pokemonService.findByType("Planta"));

        System.out.println("\nFiltro por Zona: Ruta 15");
        printResult(pokemonService.findByZone("Ruta 15"));

        System.out.println("\nFiltro por Debilidad: Electrico");
        printResult(pokemonService.findByWeakness("Electrico"));
    }

    private void printResult(List<Pokemon> pokemons) {
        for (Pokemon pokemon : pokemons) {
            String type = String.join(", ", pokemon.getTypes());
            String weaknesses = String.join(", ", pokemon.getWeaknesses());

            System.out.printf("[PKMN] Nombre: %s | Tipo: %s | Debilidades: %s%n", pokemon.getName(), type, weaknesses);
        }
    }
}
