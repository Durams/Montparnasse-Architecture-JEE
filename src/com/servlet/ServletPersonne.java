package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metier.Personne;
import com.service.Iservice;
import com.service.ServiceImpl;

/**
 * Servlet implementation class ServletPersonne
 */
@WebServlet("/ServletPersonne")
public class ServletPersonne extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private Iservice service = new ServiceImpl();// on appelle la couche service 

    /**
     * Default constructor. 
     */
    public ServletPersonne() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//R�cup�ration des donn�es :
		String nom = request.getParameter("lastname");// info r�cup�rer , le client parle 
		String prenom = request.getParameter("firstname"); 
		int age = Integer.parseInt(request.getParameter("age"));
		int id = Integer.parseInt(request.getParameter("id"));
		
		//2- pr�paration � l'envoi � la couche service
		
		Personne p = new Personne();// je pr�pare l'objet, la m�thode de la couche service, cr�ation dune instance de la classe personne
		//avec les infos pr�c�dente je cr�e une instance de la classe personne
		//le serveur note sur un bout de papier p
		p.setId(id);
		p.setAge(age);
		p.setNom(nom);
		p.setPrenom(prenom);
		
		String message = service.creerPersonne(p);//J'appel la m�thode de la couche service , 
		//Appel de la couche personne pour ajouter une personne en bdd, ajouter en bdd
		//les infos vont aller dans la couche service
		//envoi du papier � la cuisine 
		//on rajoute String message au code pr�c�dent pour r�cup�rer le message 
		
			
		
	 //3 Pr�paration � l'envoi:
		request.setAttribute("message", message);
		
		
		
		//4 appel de la jsp:
		request.getRequestDispatcher("resultat.jsp").forward(request, response);
		
		
		
		//request.getRequestDispatcher("resultatPersonneJSTL.jsp").forward(request,response);
	
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
