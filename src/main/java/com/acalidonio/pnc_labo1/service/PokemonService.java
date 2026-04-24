package com.acalidonio.pnc_labo1.service;

import com.acalidonio.pnc_labo1.domain.entities.Pokemon;
import com.acalidonio.pnc_labo1.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokemonService {
    private final PokemonRepository pokemonRepository;

    public List<Pokemon> findByType(String type) {
        return pokemonRepository.findAll().stream()
                .filter(pokemon -> pokemon.getTypes().contains(type))
                .collect(Collectors.toList());
    }

    public List<Pokemon> findByWeakness(String weakness) {
        return pokemonRepository.findAll().stream()
                .filter(pokemon -> pokemon.getWeaknesses().contains(weakness))
                .collect(Collectors.toList());
    }

    public List<Pokemon> findByZone(String zone) {
        return pokemonRepository.findAll().stream()
                .filter(pokemon -> pokemon.getZoneType().contains(zone))
                .collect(Collectors.toList());
    }
}
