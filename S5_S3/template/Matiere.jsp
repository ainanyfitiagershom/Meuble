
<div class="box">
    <div class="title">
        <span>Liste Matiere Premiere</span>
    </div>
    <div class="tableau">
        <%
            for(int i = 0 ; i<matieres.length ; i++){ %>
                <div class="#">
                    <ul>
                        <li><p><%=matieres[i].getNomMatiere()%></p></li>
                    </ul>
                    <!-- <span><%=matieres[i].getNomMatiere()%></span> -->
                </div>
            <%}
        %>
    </div>
</div>