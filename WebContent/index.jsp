<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$(":text").blur(function(){
			var date = $(this).val();
			var url = "${pageContext.request.contextPath}/ajaxdate";
			var args = {name:date};
			$.post(url,args,function(data){
				alert(data);
			})
		})
	})

</script>
</head>
<body>
	<a href="error">error</a> <br>
	<form action="${pageContext.request.contextPath}/date">
		<input type="text" name="date">
		<input type="submit">
	</form>
</body>
</html>






