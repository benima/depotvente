<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
	<html>

<%@include file="Header.jsp"%>

<body>
<div id="container">
<form action="${urlid}" method="post" class="form-signin" role="form">

<p>
						Login * : <input name="login" type="text"
							placeholder="saisir le n° de login" required="required" class="form-control"
							value="${param.login}" />${erreurs["login"]}<br />
				</p>
				<p>
						mot de passe * : <input name="motdepasse" class="form-control" type="password"
							placeholder="saisir le n° de mot de passe" required="required"
							value="${param.motdepasse}" />${erreurs["motdepasse"]}<br />
				</p>
				<p>
				<input value="valider" class="btn btn-lg btn-primary btn-block" type="submit" name="valider" />
				</p>
				<p>
				${messageerror}
				</p>
</form>
</div>
</body>
</html>