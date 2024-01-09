<div class="box">
    <div class="title">
        <span>Liste Styles</span>
    </div>
    <div class="#">
        <%
            for(int i = 0 ; i<styless.length ; i++){ %>
                <ul>
                    <li><%= styless[i].getNomStyle()%></li>
                </ul>
              
            <%}
        %>
    </div>
</div>