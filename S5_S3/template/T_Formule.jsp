<p style="text-align: center;">Projet MEUBLE</p>
<div class="formulaire-template">
    <span class="title-form">Formule</span>
    <form action="myformule" method="get">
        <input type="hidden" name="categorie" value="<%=categorie%>">
        <input type="hidden" name="style" value="<%=style%>">
        <input type="hidden" name="taille" value="<%=taille%>">
        <%
            for(int i = 0 ; i<MatiersPremieress.size() ; i++) { %>
                <div class="content-form">
                    <div class="content-more">
                        <label for=""><%= MatiersPremieress.get(i).getNomMatiere()%></label>
                        <input type="hidden" name="matiere<%=i%>" value="<%= MatiersPremieress.get(i).getIdMatiers()%>">
                        <input type="text" name="valeur<%=i%>" required >
                    </div>
                </div>
            <%}
        %>
        <div class="content-form">
            <input type="submit" value="Valider">
        </div>
    </form>
</div>