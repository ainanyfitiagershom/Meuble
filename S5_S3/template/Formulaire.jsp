<p style="text-align: center;">Projet MEUBLE</p>
<div class="formulaire-template">
    <form action="insertion" method="get">
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
            <label class="title-form">Liste Matiere Premiere</label>
            <div class="content-child">
                <% for (int i=0; i<MatiersPremieress.length; i++){%>
                    <div class="content-child-check">
                        <label for=""><%= MatiersPremieress[i].getNomMatiere()%> : </label>
                        <input type="checkbox" id="check<%=i%>" name="check<%=i%>"/>
                        <label for="check<%=i%>">
                            <span></span>
                        </label>
                    </div>
                <% }%>
            </div>
        </div>
        <div class="content-form">
            <input type="submit" value="Validation">
        </div>
    </form>
</div>