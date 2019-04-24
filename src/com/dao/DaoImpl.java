package com.dao;

import java.util.List;

import com.metier.Personne;

public class DaoImpl implements Idao {

	@Override
	public String creerPersonne(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("Je crée la personne");
		System.out.println(p);// void ne fait qu'afficher , je fais un traitement et je ne veux rien en retour
		return "la personne "+p.getPrenom() + " " +p.getNom()+" a bien été ajouté"; //maintenant on met String pour avoir un retour 
	}

	@Override
	public Personne modifier(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("Je modifie la personne");
		return null;
	}

	@Override
	public void supprimer(Personne p) {
		System.out.println("Je supprimer la personne");
		// TODO Auto-generated method stub

	}

	@Override
	public List<Personne> lister() {
		// TODO Auto-generated method stub
		System.out.println("Je liste la personne");
		return null;
	}

}
