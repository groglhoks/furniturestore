<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <ul class="top-menu">
        <c:forEach var="menuItem" items="${menuItems}" >
                <li
                    <c:if test="${menuItem.active}">
                        class="active"
                    </c:if>
                ><a href="${menuItem.link}">${menuItem.name}</a></li>
        </c:forEach>
    </ul>
</nav>