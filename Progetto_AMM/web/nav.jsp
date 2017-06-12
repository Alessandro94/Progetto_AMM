<%-- 
    Document   : nav
    Created on : 23-mag-2017, 11.47.03
    Author     : macbook
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav>
    <ol>
        <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="bacheca.htm">Bacheca</a></li>
        <li <c:if test="${page=='descrizione'}">class="active"</c:if>><a href="descrizione.html">Descrzione</a></li>
        <li <c:if test="${page=='amici'}">class="active"</c:if>><a href="amici.html">Amici</a></li>
        <li <c:if test="${page=='nuovopost'}">class="active"</c:if>><a href="nuovopost.html">nuovopost</a></li>
        <li <c:if test="${page=='cercaamici'}">class="active"</c:if>><a href="cercaamici.html">cercaamici</a></li>
    </ol>
</nav>
