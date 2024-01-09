<p style="text-align: center;">Projet MEUBLE</p>
<div class="formulaire-template">
    <form action="insertion_mat" method="get">
        <div class="content-form">
            <div class="content-form">
                <div class="content-more">
                    <label for="">Nom MatierePremiere</label>
                    <input type="text" name="matiere" id="">
                </div>
            </div>
            <div class="content-more">
                <label for="">Unite</label>
                <select name="unite" id="">
                    <% for (int i=0; i<unite.length; i++){%>
                    <option value="<%= unite[i].getIdunite()%>"><%= unite[i].getUnite()%></option>
                <% }%>
                </select>
            </div>
        </div>
        <div class="content-form">
            <input type="submit" value="Validation">
        </div>
    </form>
</div>