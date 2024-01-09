<div class="formulaire-template">
    <form action="allmatiere" method="get">
        <div class="content-form">
            <div class="content-more">
                <label for="">Styles</label>
                <select name="style" id="">
                    <% for (int i=0; i<styless.length; i++){%>
                    <option value="<%= styless[i].getIdStyles()%>"><%= styless[i].getNomStyle()%></option>
                    <% }%>
                </select>
            </div>
        </div>
        <div class="content-form">
            <input type="submit" value="Validation">
        </div>
    </form>
</div>