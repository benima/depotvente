<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html>
<script id="tinyhippos-injected">if (window.top.ripple) { window.top.ripple("bootstrap").inject(window, document); }</script><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>Depotvente</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

<!--     Le styles -->
<!--     <link href="_css/bootstrap.css" rel="stylesheet"> -->
<!--     <link id="switch_style" href="http://bootswatch.com//bootstrap.min.css" rel="stylesheet"> -->
<!--     <link href="_css/main.css" rel="stylesheet"> -->
<!--     <link href="_css/jquery.rating.css" rel="stylesheet"> -->
<!--     <link href="_css/bootstrap-multiselect.css" rel="stylesheet"> -->
    
    <!-- StyleSheet -->
    <c:url var="urlcss1" value="/_css/normalize.css" > </c:url>
	<c:url var="urlcss2" value="/_css/authentif.css" > </c:url>
	<c:url var="urlid" value="/menuAccueil" />
    <c:url var="normalize" value="/_css/normalize.css" />
    <c:url var="bootsrap" value="/_css/bootstrap.css" />
    <c:url var="main" value="/_css/main.css" />
    <c:url var="jqueryrating" value="/_css/jquery.rating.css" />
    <c:url var="multiselect" value="/_css/bootstrap-multiselect.css" />
    
    
    
    
<link rel="stylesheet" href="${normalize}" /> 
<%-- <link rel="stylesheet" href="${boots}" />  --%>
	<link rel="stylesheet" href="${urlcss1}" type="text/css" media="screen" />
	<c:url var="listeproduit" value="/menuAccueil?action=produit"/>
	<c:url var="retouraccueilURL" value="/menuAccueil.jsp"/>
	<c:url var="retourlisteProduits" value="/listeProduits.jsp"/>
	<c:url var="retourfournisseurURL" value="/menuAccueil.jsp"/>
	<c:url var="listefournisseur" value="/menuAccueil?action=fournisseur"/>
	
		

    <link rel="stylesheet" href="${bootsrap}" type="text/css" media="screen"></link>
    <link rel="stylesheet" href="${main}" type="text/css" media="screen"></link>
    <link rel="stylesheet" href="${jqueryrating}" type="text/css" media="screen"></link>    
    <link rel="stylesheet" href="${multiselect}" type="text/css" media="screen" />

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  <!-- Urls -->
    <c:url var="urlid" value="/menuAccueil" />
    <c:url var="urllist" value="/menuAccueil" />
    <c:url var="accueilURL" value="/depotvente/"/>
	<c:url var="retouraccueilURL" value="/menuAccueil.jsp"/>
	<c:url var="accueilURL" value="/depotvente/"/>
  
    <c:url var="articleCont" value="/article/" />
    <c:url var="boutique" value="/boutique" />
    <c:url var="sign" value="/sign/" />
    <c:url var="signin" value="/sign/in" />
    <c:url var="signup" value="/sign/up" />
    <c:url var="disconnect" value="/sign/disconnect" />
    <c:url var="signmodif" value="/sign/editAccount" />
    <c:url var="paniercont" value="/panier"/>
    <c:url var="commandecont" value="/commande"/>
      <c:url var="imgDir" value="/css/images/" />
      <c:url var="categController" value="/articles/" />
      <c:url var="contact" value="/contact" />
  </head>
