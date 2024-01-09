<p style="text-align: center;">Projet MEUBLE</p>
<div class="table" style="margin-left: 100px;">
    <table >
        <tr>
            <th>Categorie</th>
            <th>Style</th>
            <th>Taille</th>
            <th>Unite</th>
            <th>Quantite</th>
        </tr>
        <% for (int i=0; i<donnee.size(); i++){
            if(i%2 == 0){%>
                <tr>
                    <td><%= donnee.get(i).getNomproduit()%></td>
                    <td><%= donnee.get(i).getNomstyle()%></td>
                    <td><%= donnee.get(i).getNametaille() %></td>
                    <td><%= donnee.get(i).getUnite() %></td>
                    <td><%= donnee.get(i).getValeurs() %></td>
                </tr>
            <% } else{ %>
                    <tr  class="gray">
                        <td><%= donnee.get(i).getNomproduit()%></td>
                        <td><%= donnee.get(i).getNomstyle()%></td>
                        <td><%= donnee.get(i).getNametaille() %></td>
                        <td><%= donnee.get(i).getUnite() %></td>
                        <td><%= donnee.get(i).getValeurs() %></td>
                    </tr>    
                <%}
        }%>
    </table>
</div>