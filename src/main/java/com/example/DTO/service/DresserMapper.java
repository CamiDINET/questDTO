package com.example.DTO.service;

import com.example.DTO.dto.DresserDto;
import com.example.DTO.dto.UserDto;
import com.example.DTO.entity.Dresseur;
import com.example.DTO.entity.Pokemon;
import com.example.DTO.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DresserMapper {
    public DresserDto TransformDresseurEntityInDresseurDto(Dresseur dresseur) {
        DresserDto dresseurDto = new DresserDto();
        dresseurDto.setName(dresseur.getName());
        List<Pokemon> pokemonListEntity = dresseur.getPokemons();
        List<String> pokemonsNameList = new ArrayList<>();
        for(Pokemon pokemon : pokemonListEntity){
            pokemonsNameList.add(pokemon.getName());
        }
        dresseurDto.setPokemons(pokemonsNameList);
        return dresseurDto;
    }
}
