package com.GestionCommande.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GestionCommande.entities.Categorie;
import com.GestionCommande.metier.IcategorieMetier;

@RestController
@CrossOrigin
public class CategorieRestController {
	@Autowired
	private IcategorieMetier icategorieMetier;
	
	@RequestMapping(value="/categories/{idCategorie}", method = RequestMethod.GET)
	public Categorie getCategorie(@PathVariable Long idCategorie) {
		return icategorieMetier.getCategorie(idCategorie);
	}

	@RequestMapping(value="/categories", method = RequestMethod.POST)
	public void saveCategorie(@RequestBody Categorie c) {
		icategorieMetier.saveCategorie(c);
	}

	@RequestMapping(value="/categories", method = RequestMethod.GET)
	public List<Categorie> listCategorie() {
		return icategorieMetier.listCategorie();
	}

}
