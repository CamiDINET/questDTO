package com.example.DTO.repository;

import com.example.DTO.entity.Dresseur;
import com.example.DTO.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
