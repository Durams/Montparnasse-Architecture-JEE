package com.service;

import java.util.List;

import com.dao.DaoImpl;
import com.dao.Idao;
import com.metier.Personne;


public class ServiceImpl implements Iservice {
	private Idao dao = new DaoImpl(); //on fait appel à la cuisine , grace à cet objet Dao on fait appelle à la couche Dao

	@Override
	public String creerPersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.creerPersonne(p);
		return "la personne "+p.getPrenom() + " " +p.getNom()+" a bien été ajouté";
	}

	@Override
	public Personne modifier(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifier(p);
	}

	@Override
	public void supprimer(Personne p) {
		// TODO Auto-generated method stub
		dao.supprimer(p);
	}

	@Override
	public List<Personne> lister() {
		// TODO Auto-generated method stub
		return dao.lister();
	}

}
