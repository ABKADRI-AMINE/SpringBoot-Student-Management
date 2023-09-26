package com.example.scolaritelast.dao;

import com.example.scolaritelast.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    public List<Etudiant> findByScore(int score);
}
