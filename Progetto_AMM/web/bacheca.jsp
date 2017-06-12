<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Nerdbook</title>
        
        <meta charset="UTF-8">
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Alessandro Satta">
        <meta name="keywords" content="Trova altri nerd">
        
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>

    <body>
        <!--header contenente in titolo della pagina-->
        <c:set var="title" value="Bacheca" scope="request"/>
        <jsp:include page="header.jsp"/>

        <!--Barra di navigazione tra le pagine del sito-->
        <c:set var="page" value="bacheca" scope="request"/>
        <jsp:include page="nav.jsp"/>

        <!--Contenuti della pagina-->
        <div id="divBody">
            <!--Informazioni personali-->
            <div id="info">
                <div class="profilePic">
                    <img title="fotoProfilo" alt="Foto Profilo" src="${nome.urlFotoProfilo}">
                </div>
                <p id="UtenteName">
                    <strong>Nome:</strong> 
                    ${nome.nome}
                </p>
                <p id="UtenteCognome">
                    <strong>Cognome:</strong> 
                    ${nome.cognome}
                </p>
                <p id="Utenteemail">
                    <strong>eMail:</strong> 
                    ${nome.email}
                </p>
                
                <c:if test="${empty param.user}">
                    <p id="logOutLink"><a href="Login?logout=1">Logout</a></p>
                </c:if>
                
            </div>

            <!--lista dei post-->
            <div id="posts">
                <c:forEach var="post" items="${posts}">
                    <div class="post">
                        <c:if test="${post.postType == 'TEXT'}">
                            <p>${post.content}</p>
                        </c:if>
                        <c:if test="${post.postType == 'IMAGE'}">
                            <img alt="Post con foto" src="${post.content}">
                        </c:if>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
