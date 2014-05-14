<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%@include file="Header.jsp"%>
<body>
    <div class="container">

      <form class="form-signin" role="form">
        <h2 class="form-signin-heading">merci de vous connectez</h2>
        <input type="text" name="login" class="form-control" placeholder="login" required autofocus> <br>
        <input type="password" name="motdepasse" class="form-control" placeholder="motdepasse" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> se souvenir
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">se connecter</button>
      </form>

    </div>

  </body>
</html>