<p style="text-align: center;">Projet MEUBLE</p>
<div class="formulaire-template">
    <form action="yahoo" method="get">    
        <div class="content-form">
            <div class="content-more">
                <label for="">Matiers Premieres</label>
                <select name="MatPer" id="">
                    <% for (int i=0; i<MatiersPremieress.length; i++){%>
                    <option value="<%= MatiersPremieress[i].getIdMatiers()%>"><%= MatiersPremieress[i].getNomMatiere()%></option>
                <% }%>
                </select>
            </div>
        </div>
        <div class="content-form">
            <input type="submit" value="Validation">
        </div>
    </form>
</div>