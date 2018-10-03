
<html>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <jsp:include page="head-title.jsp"/>
   <% // <jsp:include page="header.jsp"/> %>
   <body>

   	<div id="wrapper">
   		<header>
   		    <h1>${pageLabel}</h1>
   		</header>
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
   		<div id="heading">

   		</div>
   		<aside>
   		    <nav>
            	<ul class="aside-menu">
            		<li class="active">LOREM IPSUM</li>
            		<li><a href="/donec/">DONEC TINCIDUNT LAOREET</a></li>
            		<li><a href="/vestibulum/">VESTIBULUM ELIT</a></li>
            		<li><a href="/etiam/">ETIAM PHARETRA</a></li>
            		<li><a href="/phasellus/">PHASELLUS PLACERAT</a></li>
            		<li><a href="/cras/">CRAS ET NISI VITAE ODIO</a></li>
            	</ul>
            </nav>
   		</aside>

   		<section>
   		    <blockquote>
            	<p>
            		“QUISQUE IN ENIM VELIT, AT DIGNISSIM EST. NULLA UL CORPER, DOLOR AC PELLENTESQUE PLACERAT, JUSTO TELLUS GRAVIDA ERAT, VEL PORTTITOR LIBERO ERAT.”
            	</p>
            	<cite>John Doe, Lorem Ipsum</cite>
            </blockquote>
   		</section>
   	</div>
   	<footer>
   	    <div id="footer">
    		All rights reserved 2018
    	</div>
   	</footer>


   </body>

</html>

