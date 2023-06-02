package com.example.DTO.dto;

public class PokemonDto {
    private String name;
    private String dresseurName;

    public PokemonDto(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDresseurName() {
        return dresseurName;
    }

    public void setDresseurName(String dresseurName) {
        this.dresseurName = dresseurName;
    }

}
