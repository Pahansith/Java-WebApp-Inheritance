<%--
  Created by IntelliJ IDEA.
  User: pahan
  Date: 10/8/2018
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.pahansith.parentwebapp.portal.utility.JspPathResolverUtility" %>
<html>
<head>
    <title>Dependent Web App Demo</title>
</head>
<body>
<%
    String header = (String) request.getServletContext().getAttribute(JspPathResolverUtility.HEADER_JSP);
%>

<jsp:include page="<%=header%>"></jsp:include>
</body>
</html>
