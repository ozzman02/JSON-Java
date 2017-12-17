<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>json parse sample</title>
	</head>
	<body>
		<pre id="result"></pre>
		<script type="text/javascript">
			
			var jsonUdemyLecture = "{\"id\": 1, \"name\": \"JSON with Java\", \"nameLine2\": \"Json and Java Lecture\"," + 
				"\"desc\": \"Udemy lecture\", \"enabled\": true}";
			
			console.log(jsonUdemyLecture);
			
			/* string to javascript */
			var udemyLecture = JSON.parse(jsonUdemyLecture);
			
			document.getElementById("result").innerHTML = "id: " + udemyLecture.id + " name: " + udemyLecture.name;
			
		</script>
	</body>
</html>