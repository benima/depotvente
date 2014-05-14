<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
<%@include file="Header.jsp"%>
<body>
<div class="container">
      <div class="header">
       <h1> Application depot/vente</h1>
      <h2> Liste des fournisseurs</h2>
	</div>
    
      <div class="main">
	
<FORM action="${accueilURL}" method="post">

<ul>
	<c:forEach items="${listeFournisseurs}" var="fournisseur">
		<li>${fournisseur.id}: ${fournisseur.nom} : $(fournisseur.prenom} : ${fournisseur.adresse} : ${fournisseur.telephone}  </li>
	</c:forEach>
	</ul>
<p>

	<input type="submit" class="btn btn-lg btn-success" value="creafourni" name="action"/>
	</p>
	<p>
	 <input type="submit" class="btn btn-lg btn-success" value="modiffourni" name="action"/>
	</p>
	<p>
	<input type="submit" class="btn btn-lg btn-success" value="suppfourni" name="action"/>
	</p>

</FORM>
</div> 
<a href="${retouraccueilURL}" >Retour accueil</a>
<div class="footer">
        <p>&copy; G2L2 Corp 2014</p>
      </div>
      </div>
      
</div>

</body>
</html>