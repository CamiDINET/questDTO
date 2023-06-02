package com.example.DTO.controller;

import com.example.DTO.dto.DresserDto;
import com.example.DTO.dto.PokemonDto;
import com.example.DTO.dto.RoleDto;
import com.example.DTO.entity.Dresseur;
import com.example.DTO.entity.Pokemon;
import com.example.DTO.entity.Role;
import com.example.DTO.entity.User;
import com.example.DTO.repository.DresseurRepository;
import com.example.DTO.repository.PokemonRepository;
import com.example.DTO.repository.UserRepository;
import com.example.DTO.service.DresserMapper;
import com.example.DTO.service.PokemonMapper;
import com.example.DTO.service.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    DresseurRepository dresseurRepository;
    @Autowired
    DresserMapper dresserMapper;
    @Autowired
    PokemonRepository pokemonRepository;
    @Autowired
    PokemonMapper pokemonMapper;

   // @GetMapping("/rolesSuccessMapper")
   // public ResponseEntity<?> getRolesMapper() {
   //     User user = userRepository.findById(1L).get();
   //     List<Role> roles = user.getRoles();
    //    List<RoleDto> rolesDto = new ArrayList<RoleDto>();
    //    int i = 0;
    //    for (Role role : roles) {
    //        RoleDto roleDto = roleMapper.TransformRoleEntityInRoleDto(role);
     //       rolesDto.add(i, roleDto);
     //       i++;
      //  }
     //   return new ResponseEntity<>(rolesDto, HttpStatus.OK);
   // }
    @GetMapping("/dresseurs/{id}")
    public DresserDto getDresseurById(@PathVariable Long id){
        Dresseur dresseurEntity = dresseurRepository.findById(id).get();
        DresserDto dresserDto = dresserMapper.TransformDresseurEntityInDresseurDto(dresseurEntity);
        return dresserDto;

}

@GetMapping("/pokemons/{id}")
    public PokemonDto getPokemonById(@PathVariable Long id){
        Pokemon pokemonEntity = pokemonRepository.findById(id).get();
        PokemonDto pokemonDto = pokemonMapper.TransformPokemonEntityToPokemonDto(pokemonEntity);
    return pokemonDto;
}
}
