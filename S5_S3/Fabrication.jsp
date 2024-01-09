<%@page import="modele.*" %>
<% 
    Styles[] styless= (Styles[])request.getAttribute("styles");
    Taille[] tailles= (Taille[])request.getAttribute("tailles");
    Produit [] prod= (Produit[])request.getAttribute("produits");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/scss/style.css">
    <script src="assets/js/animateMenu.js" defer></script>
    <title>Fabrication</title>
</head>
<body>
    <div class="container-page">
        <%@ include file="menu.jsp" %>
        <div class="content-all-pages">
                <%@ include file="template/FormulaireFabrication.jsp" %>
        </div>
    </div>
</body>
</html>