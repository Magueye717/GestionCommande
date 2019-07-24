package com.GestionCommande.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionCommande.dao.ProduitRepository;
import com.GestionCommande.entities.Produit;
@Service
public class IproduitMetierImpl implements IproduitMetier {
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public List<Produit> listProduit() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}


	@Override
	public Produit getProduit(Long idProduit) {
		// TODO Auto-generated method stub
		return produitRepository.findById(idProduit).orElse(null);
	}

	@Override
	public void deleteProduit(Long idProduit) {
		produitRepository.deleteById(idProduit);
		
	}


	@Override
	public Produit saveProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

}
