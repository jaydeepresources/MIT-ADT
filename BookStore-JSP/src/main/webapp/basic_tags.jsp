<html>
<body>
    <h1>View all JSP Java Tags</h1>


    <%-- Declarative:- Declare instance level objects / variables --%>
    <%! String msg= "Instance Hi"; %>

    <%-- Scriptlet:- Declare local level logic --%>
    <% String msg= "Local Hi"; %>

    <%-- Directive:- Import, meta data --%>
    <%@ page import="java.util.List" %>

    <%-- Expression:- Display variable on html page --%>
    <%= msg  %>

    <% String colorName="red"; %>
    <p style="color: <%=colorName%>">Text</p>

</body>

</html>