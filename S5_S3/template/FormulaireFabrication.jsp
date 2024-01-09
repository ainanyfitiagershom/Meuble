
<p style="text-align: center;">Projet MEUBLE</p>
<div class="formulaire-template">
    <form action="addformule" method="get">
        <div class="content-form">
            <div class="content-more">
                <label for="">Categorie</label>
                <select name="categorie" id="">
                    <% for (int i=0; i<prod.length; i++){%>
                    <option value="<%= prod[i].getIdProduit()%>"><%= prod[i].getNomProduit()%></option>
                <% }%>
                </select>
            </div>
        </div>
        <div class="content-form">
            <div class="content-more">
                <label for="">Styles</label>
                <select name="styles" id="">
                    <% for (int i=0; i<styless.length; i++){%>
                    <option value="<%= styless[i].getIdStyles()%>"><%= styless[i].getNomStyle()%></option>
                <% }%>
                </select>
            </div>
        </div>
        <div class="content-form">
            <div class="content-more">
                <label for="">Taille</label>
                <select name="tailles" id="">
                    <% for (int i=0; i<tailles.length; i++){%>
                    <option value="<%= tailles[i].getIdtaille()%>"><%= tailles[i].getNameTaille()%></option>
                <% }%>
                </select>
            </div>
        </div>
        <div class="content-form">
            <input type="submit" value="Suivant">
        </div>
    </form>
</div>