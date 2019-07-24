package com.GestionCommande.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCategorie;
	private String nomCategorie;
	@OneToMany(mappedBy="categorie", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Collection<Produit> produits;
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(String nomCategorie) {
		super();
		this.nomCategorie = nomCategorie;
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	@JsonIgnore
	public Collection<Produit> getProduits() {
		return produits;
	}
	
	@JsonSetter
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
	
	
}
