package com.GestionCommande.metier;

import java.util.List;

import com.GestionCommande.entities.Categorie;
import com.GestionCommande.entities.Produit;

public interface IcategorieMetier {

	public List<Categorie> listCategorie();
	public Categorie getCategorie(Long idCategorie);
	public void saveCategorie(Categorie c);
}
