package com.example.DTO.dto;

import com.example.DTO.entity.Pokemon;

import java.util.List;

public class DresserDto {
    private String name;
    private List<String> pokemons;

    public DresserDto() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<String> pokemons) {
        this.pokemons = pokemons;
    }
}
