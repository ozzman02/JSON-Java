<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>JavaScript JSON array sample</title>
	</head>
	<body>
		<pre id="result"></pre>
		<script type="text/javascript">
			
			var array = ['Json', 'REST', 'jQuery', 1, 2, 3, 4, true];
			
			document.getElementById("result").innerHTML = JSON.stringify(array, null, 2);
			
		</script>
	</body>
</html>