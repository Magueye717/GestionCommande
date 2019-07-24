package com.GestionCommande.metier;

import java.util.List;

import com.GestionCommande.entities.Categorie;
import com.GestionCommande.entities.Produit;

public interface IproduitMetier {
	public List<Produit> listProduit();

	public Produit saveProduit(Produit p);

	public Produit getProduit(Long idProduit);

	public void deleteProduit(Long idProduit);
}
