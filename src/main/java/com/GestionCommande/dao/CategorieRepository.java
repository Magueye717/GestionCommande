package com.GestionCommande.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.GestionCommande.entities.Categorie;
@CrossOrigin("*")
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
