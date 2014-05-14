<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<%@include file="Header.jsp"%>
<body>
<div class="container">
     <div class="header">
       <h1> Application depot/vente</h1>
      <h2> PAGE PRODUITS</h2>
      
     
    </div>
      <div class="main">
<FORM action="${accueilURL}" method="post">

	Liste des produits :
	<ul>
	<c:forEach items="${listeProduit}" var="produit">
		<li>${produit.id}: ${produit.nom} : $(produit.fournisseur} : ${produit.prix} : ${produit.quantite} </li>
	</c:forEach>
	</ul>
	<p>
	 <input type="submit" class="btn btn-lg btn-success" value="creaproduit" name="action"/>
	</p>
	<p>
	 <input type="submit" class="btn btn-lg btn-success" value="modifproduit" name="action"/>
	</p>
	<p>
	 <input type="submit" class="btn btn-lg btn-success" value="supproduit" name="action"/>
	</p>
	<p>
	<input type="submit" class="btn btn-lg btn-success" value="chargproduit" name="action"/>
	</p>
	<a href="${retouraccueilURL}" >Retour Accueil</a>
</form>
</div>
<div class="footer">
        <p>&copy; G2L2 Corp 2014</p>
      </div>
      </div>>
</div>

</body>
</html>
