package com.GestionCommande.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GestionCommande.entities.Produit;
import com.GestionCommande.metier.IproduitMetier;

@RestController
@CrossOrigin
public class ProduitRestController {
	@Autowired
	private IproduitMetier iproduitMetier;

	@RequestMapping(value="/produits", method = RequestMethod.GET)
	public List<Produit> getProduit() {
		return iproduitMetier.listProduit();
	}
	
	@PostMapping(value = "/produits")
	public Produit saveSave(@RequestBody Produit p) {
		return  iproduitMetier.saveProduit(p);
	}
	
	@RequestMapping(value="/produits/{idProduit}", method = RequestMethod.GET)
	public Produit getProduitByID(@PathVariable Long idProduit) {
		return iproduitMetier.getProduit(idProduit);
	}
	
	@RequestMapping(value="/produits/{idProduit}", method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable Long idProduit) {
		iproduitMetier.deleteProduit(idProduit);
	}

}
