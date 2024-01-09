<div class="table">
    <table>
        <tr>
            <th>Id-Matiere</th>
            <th>Nom</th>
            <th>Unite</th>
        </tr>
        <% for (int i=0; i<MatiersPremieress.size(); i++){
            if(i%2 == 0){%>
                <tr>
                    <td><%= MatiersPremieress.get(i).getIdMatiers()%></td>
                    <td><%= MatiersPremieress.get(i).getNomMatiere()%></td>
                    <td><%= MatiersPremieress.get(i).getNameUnite() %></td>
                </tr>
            <% } else{ %>
                    <tr  class="gray">
                        <td><%= MatiersPremieress.get(i).getIdMatiers()%></td>
                        <td><%= MatiersPremieress.get(i).getNomMatiere()%></td>
                        <td><%= MatiersPremieress.get(i).getNameUnite() %></td>
                    </tr>    
                <%}
        }%>
    </table>
</div>