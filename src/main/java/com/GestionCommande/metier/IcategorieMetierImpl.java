package com.GestionCommande.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionCommande.dao.CategorieRepository;
import com.GestionCommande.entities.Categorie;
import com.GestionCommande.entities.Produit;
@Service
public class IcategorieMetierImpl implements IcategorieMetier {
	@Autowired
	CategorieRepository categorieRepository;

	@Override
	public List<Categorie> listCategorie() {
		// TODO Auto-generated method stub
		return categorieRepository.findAll();
	}

	@Override
	public Categorie getCategorie(Long idCategorie) {
		// TODO Auto-generated method stub
		return categorieRepository.findById(idCategorie).orElse(null);
	}

	@Override
	public void saveCategorie(Categorie c) {
		categorieRepository.save(c);
		
	}

}
