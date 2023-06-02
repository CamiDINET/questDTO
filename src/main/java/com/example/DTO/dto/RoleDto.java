package com.example.DTO.dto;

// Les imports ont été omis pour être plus concis
// Mais utilise ton IDE pour avoir les packages énoncés ci-dessous de façon automatique
public class RoleDto {
    private String name;
    private String userName;
    private Long Id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}