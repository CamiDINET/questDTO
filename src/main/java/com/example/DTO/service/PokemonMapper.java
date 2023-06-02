package com.example.DTO.service;

import com.example.DTO.dto.PokemonDto;
import com.example.DTO.dto.RoleDto;
import com.example.DTO.entity.Pokemon;
import com.example.DTO.entity.Role;
import org.springframework.stereotype.Service;

@Service
public class PokemonMapper {

    public PokemonDto TransformPokemonEntityToPokemonDto(Pokemon pokemon) {
        PokemonDto pokemonDto = new PokemonDto();
        pokemonDto.setName(pokemon.getName());
        pokemonDto.setDresseurName(pokemon.getDresseur().getName());
        return pokemonDto;
    }
}
