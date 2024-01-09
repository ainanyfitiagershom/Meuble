<div class="box">
    <div class="title">
        <span>Liste Categorie</span>
    </div>
    <div class="#">
        <%
            for(int i = 0 ; i<produit.length ; i++){ %>
                <ul><li>
                    <%=produit[i].getNomProduit()%>
                </li></ul>
             
            <%}
        %>
    </div>
</div>