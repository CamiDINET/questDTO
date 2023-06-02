package com.example.DTO.repository;

import com.example.DTO.entity.Dresseur;
import com.example.DTO.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DresseurRepository extends JpaRepository<Dresseur, Long> {
}
