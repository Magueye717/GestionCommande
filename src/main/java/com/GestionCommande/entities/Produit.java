package com.GestionCommande.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long idProduit;
   private String nomProduit;
   private double quantite;
   private double prix;
   @ManyToOne
   @JoinColumn(name="CODE_CAT")
   private Categorie categorie;
   
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}

public Produit(String nomProduit, double quantite, double prix) {
	super();
	this.nomProduit = nomProduit;
	this.quantite = quantite;
	this.prix = prix;
}



public Produit(String nomProduit, double quantite, double prix, Categorie categorie) {
	super();
	this.nomProduit = nomProduit;
	this.quantite = quantite;
	this.prix = prix;
	this.categorie = categorie;
}

public Long getIdProduit() {
	return idProduit;
}

public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}

public String getNomProduit() {
	return nomProduit;
}

public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}

public double getQuantite() {
	return quantite;
}

public void setQuantite(double quantite) {
	this.quantite = quantite;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public Categorie getCategorie() {
	return categorie;
}

public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}


   
   
}

