package com.dao;

import java.util.List;

import com.metier.Personne;

public interface Idao {
public String creerPersonne (Personne p); //prend en paramètre une personn
public Personne modifier(Personne p);
public void supprimer(Personne p);
public List<Personne> lister();

}
