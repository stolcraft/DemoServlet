package com.ensup.demoServlet.presentation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class Connection
 */

@WebServlet("/infos")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Connection() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ici dans la servlet");

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\" />");
		out.println("<title>Liste de formations du catalogue</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Liste de formation : JAVA, WEBSERVICE, </p>");
		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("oui");
		
		/* On affiche en console les différentes méthodes téstée */ 
		
		System.out.println("La session actuel :" + request.getSession());
		System.out.println("Port occupé coté client: " + request.getRemotePort());
		System.out.println("Adresse IP client: " + request.getRemoteAddr());
		System.out.println("Nom d'hôte client: " + request.getRemoteHost());
		System.out.println("Le protocol de la requête :" + request.getProtocol());
		System.out.println("Une portion de String qui spécifie l'url de la requête"+ request.getContextPath());
		System.out.println("Type de dispatcher :" + request.getDispatcherType());
		System.out.println("Port occupé coté serveur: " + request.getServerPort());
		System.out.println("Nom du serveur: " + request.getServerName());
		System.out.println("Port occupé coté client: " + request.getRemotePort());
		System.out.println("la requête est sécurisé ? " + request.isSecure());
		
		
		
		
		/* On affiche en HTML le résultat obtenue des différentes méthodes testées*/ 
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\" />");
		out.println("<title>L'ensemble méthodes des Serlets</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("La session actuel :" + request.getSession());
		out.println("<br/>");
		out.println("Port occupé coté client: " + request.getRemotePort());
		out.println("<br/>");
		out.println("Adresse IP client: " + request.getRemoteAddr());
		out.println("<br/>");
		out.println("Nom d'hôte client: " + request.getRemoteHost());
		out.println("<br/>");
		out.println("Le protocol de la requête :" + request.getProtocol());
		out.println("<br/>");
		out.println("Une portion de String qui spécifie l'url de la requête"+ request.getContextPath());
		out.println("<br/>");
		out.println("Type de dispatcher :" + request.getDispatcherType());
		out.println("<br/>");
		out.println("Port occupé coté serveur: " + request.getServerPort());
		out.println("<br/>");
		out.println("Nom du serveur: " + request.getServerName());
		out.println("<br/>");
		out.println("Port occupé coté client: " + request.getRemotePort());
		out.println("<br/>");
		out.println("la requête est sécurisé ? " + request.isSecure());
		out.println("</body>");
		out.println("</html>");
		
	/*	HttpSession session = request.getSession();
		int portClient = request.getRemotePort();
		String ipClient = request.getRemoteAddr();
		String nomClient = request.getRemoteHost();
		String protocol = request.getProtocol();
		String url = request.getContextPath();
		DispatcherType dispatcher = request.getDispatcherType();
		int portServeur = request.getServerPort();
		String nomServeur = request.getServerName();
		boolean secure = request.isSecure();
		
		String strSecure = Boolean.toString(secure);
		String strPortClient = Integer.toString(portClient);
		String strPortServeur = Integer.toString(portServeur);
		
		 On envoie les données à la jsp 
		
		request.setAttribute("session", session);
		request.setAttribute("portClient", portClient);
		request.setAttribute("ipClient", ipClient);
		request.setAttribute("nomClient", nomClient);
		request.setAttribute("protocol", protocol);
		request.setAttribute("url", url);
		request.setAttribute("dispatcher", dispatcher);
		request.setAttribute("portServeur", portServeur);
		request.setAttribute("nomServeur", nomServeur);
		request.setAttribute("secure", secure);
		request.setAttribute("strSecure", strSecure);
		request.setAttribute("strPortClient", strPortClient);
		request.setAttribute("strPortServeur", strPortServeur);
		
		
		RequestDispatcher rs = request.getRequestDispatcher("affichageDonnee.jsp");
		rs.forward(request, response);*/
		
		
		
	}

}
