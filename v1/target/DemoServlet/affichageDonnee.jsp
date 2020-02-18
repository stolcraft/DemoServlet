<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<title>Données Traitées</title>
</head>
<body>

<%
HttpSession donneSession=(HttpSession)request.getAttribute("session");

String donneipClient=(String)request.getAttribute("ipClient");
String donnenomClient=(String)request.getAttribute("nomClient");
String donneProtocol=(String)request.getAttribute("protocol");
String donneUrl=(String)request.getAttribute("url");
DispatcherType donneeDisp=(DispatcherType)request.getAttribute("dispatcher");
String donneNomServeur=(String)request.getAttribute("nomServeur");

String donneSecure=(String)request.getAttribute("strSecure");
String donnePortClient=(String)request.getAttribute("strPortClient");
String donnePortServeur=(String)request.getAttribute("strPortServeur");
%>

<div class="card" style="width: 45rem; margin:10px">
  <div class="card-header">
    Informations
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">La session actuel : <%  out.println(donneSession); %> </li>
    <li class="list-group-item">Adresse IP client: <%  out.println(donneipClient); %> </li>
    <li class="list-group-item">Nom d'hôte client: <%  out.println(donnenomClient); %> </li>
    <li class="list-group-item">Le protocol de la requête  : <%  out.println(donneProtocol); %> </li>
    <li class="list-group-item">Une portion de String qui spécifie l'url de la requête : <%  out.println(donneUrl); %> </li>
    <li class="list-group-item">Type de dispatcher :  <%  out.println(donneeDisp); %> </li>
    <li class="list-group-item">Nom d'hôte client :  <%  out.println(donneNomServeur); %> </li>
    <li class="list-group-item">la requête est sécurisé ? :  <%  out.println(donneSecure); %> </li>
    <li class="list-group-item">Port occupé coté client :  <%  out.println(donnePortClient); %> </li>
    <li class="list-group-item">Port occupé coté serveur: :  <%  out.println(donnePortServeur); %> </li>
  </ul>
</div>


</body>
</html>