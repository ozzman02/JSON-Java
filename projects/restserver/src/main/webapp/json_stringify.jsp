<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>JavaScript JSON stringify sample</title>
	</head>
	<body>
		<pre id="result"></pre>
		<script type="text/javascript">
			
			var udemyLecture = {
					id: 1,
					name: 'JSON with Java',
					nameLine2: 'Json and Java Lecture',
					desc: 'Udemy lecture',
					enabled: true
			};
			
			/* stringify: convert javascript object to json */
			var jsonUdemyLecture = JSON.stringify(udemyLecture, null, 2);
			
			console.log(jsonUdemyLecture);
			
			document.getElementById("result").innerHTML = jsonUdemyLecture;
			
		</script>
	</body>
</html>