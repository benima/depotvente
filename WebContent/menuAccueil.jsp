<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
	<html>
<head>
<%@include file="Header.jsp"%>
</head>
<body>
<div class="container">
      <div class="header">
       <h1> Application depotvente</h1>     
      </div>
      <div class="main">
     
	<FORM Method="post" action="${accueilURL}">
		<div><INPUT class="btn btn-lg btn-success" width=13px height=15px role="button" name="action"          value="produit"     id="produit"     type="submit"/></div>
		<br><div><INPUT class="btn btn-lg btn-success" name="action"      value="fournisseur" id="fournisseur" type="submit"/></div>
		<br><div><INPUT class="btn btn-lg btn-success" name="action"      value="vente"        id="vente"       type="submit"/> </div>
	</FORM>
	</div>
	<div class="footer">
        <p>&copy; G2L2 Corp 2014</p>
      </div>
      </div>
</body>
	</html>
