package com.GestionCommande.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.GestionCommande.entities.Produit;
@CrossOrigin("*")
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
