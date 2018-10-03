<html>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:include page="head-title.jsp"/>
<body>
    <div id="wrapper">
    <header>
        <h1>${pageLabel}</h1>
   	</header>

   	<jsp:include page="navigation-menu.jsp" />

    <jsp:include page="aside_nav.jsp" />

    <jsp:include page="footer.jsp"/>

</div>
</body>
</html>