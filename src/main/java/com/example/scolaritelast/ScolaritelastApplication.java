package com.example.scolaritelast;

import com.example.scolaritelast.dao.EtudiantRepository;
import com.example.scolaritelast.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class ScolaritelastApplication implements CommandLineRunner {//cette interface permet d'executer des instructions au demarrage de l'application spring boot et CommandLineRunner est une interface fonctionnelle qui contient une methode run qui prend en parametre un tableau de String
@Autowired
private EtudiantRepository etudiantRepository;//cette ligne permet d'injecter l'interface EtudiantRepository dans la classe ScolaritelastApplication
	public static void main(String[] args) {
		SpringApplication.run(ScolaritelastApplication.class, args);//cette ligne permet de lancer l'application spring boot
	}

	@Override
	public void run(String... args) throws Exception {
		etudiantRepository.save(new Etudiant(null,"Mohamed","med@gmail.com",new Date(),45));//cette ligne permet d'ajouter un etudiant
		etudiantRepository.save(new Etudiant(null,"Hassan","hassan@gmail.com",new Date(),65));//cette ligne permet d'ajouter un etudiant
		etudiantRepository.save(new Etudiant(null,"Imane","imane@gmail.com",new Date(),15));//cette ligne permet d'ajouter un etudiant
		etudiantRepository.findAll().forEach(et->{
			System.out.println(et.toString());
		});//cette ligne permet d'afficher tous les etudiants
		System.out.println("----------------------------------------------------");
		Etudiant et=etudiantRepository.findById(1L).get();//cette ligne permet de recuperer l'etudiant qui a l'id 1
		System.out.println(et.getName());
		System.out.println("----------------------------------------------------");
		etudiantRepository.findByScore(65).forEach(ett->{
			System.out.println(ett.getName());
		});//cette ligne permet d'afficher tous les etudiants qui ont un score de 65
	}
}
