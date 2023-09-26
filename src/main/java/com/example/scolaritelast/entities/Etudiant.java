package com.example.scolaritelast.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 50)//pour dire que la taille de la colonne est 50
    private String email;
    @Temporal(TemporalType.DATE)//pour dire que c'est une date et non pas un timestamp
    private Date dateNaissance;
    private int score;

}
