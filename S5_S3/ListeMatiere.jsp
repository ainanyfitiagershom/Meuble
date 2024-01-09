<%@page import="modele.MatiersPremieres" %>
<%@page import="modele.Unite" %>
<%
    Unite [] unite = (Unite[]) request.getAttribute("unite");
    MatiersPremieres [] matieres =(MatiersPremieres[])request.getAttribute("premiere");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/scss/style.css">
    <script src="assets/js/animateMenu.js" defer></script>
    <title>ListeMatiere</title>
</head>
<body>
    <div class="container-page">
        <%@ include file="menu.jsp" %>
        <div class="content-all-pages">
            <%@ include file="template/FormMatiere.jsp" %>
            <%@ include file="template/Matiere.jsp" %>
        </div>
    </div>
</body>
</html>