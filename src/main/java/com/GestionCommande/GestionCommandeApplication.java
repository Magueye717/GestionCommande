package com.GestionCommande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GestionCommande.dao.CategorieRepository;
import com.GestionCommande.dao.ProduitRepository;
import com.GestionCommande.entities.Categorie;
import com.GestionCommande.entities.Produit;

@SpringBootApplication
public class GestionCommandeApplication implements CommandLineRunner {
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	CategorieRepository categorieRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionCommandeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Categorie c1 = categorieRepository.save(new Categorie("bureautique"));
		Categorie c2 = categorieRepository.save(new Categorie("electronique"));
		Categorie c3 = categorieRepository.save(new Categorie("vetement"));
		
		Produit p1 = produitRepository.save(new Produit("oridinateur HP", 7,15000, c1));
		Produit p2 = produitRepository.save(new Produit("imprimente HP", 4,30000, c2));
		Produit p3 = produitRepository.save(new Produit("veste", 11, 10000, c3));*/
	

		
	}

}
