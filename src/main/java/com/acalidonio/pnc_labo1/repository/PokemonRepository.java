package com.acalidonio.pnc_labo1.repository;
import com.acalidonio.pnc_labo1.common.PokemonList;
import com.acalidonio.pnc_labo1.domain.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {
    private final PokemonList pokemonList;

    public List<Pokemon> findAll() {
        return pokemonList.getPokemonList();
    }
}
