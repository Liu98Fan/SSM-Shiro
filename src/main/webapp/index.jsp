<html>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<body>
<h2>Hello World!</h2>
<shiro:hasRole name="user"><a href="/SSM-Shiro/Test/user">user.jsp</a></shiro:hasRole>
<br>
<shiro:hasRole name="admin"><a href="/SSM-Shiro/Test/admin">admin.jsp</a></shiro:hasRole>
<br>
<a href="/SSM-Shiro/Test/hello">hello</a>
<br>
<a href="/SSM-Shiro/user/logout">logout</a>
</body>
</html>
