<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>JavaScript JSON array of objects sample</title>
	</head>
	<body>
		<pre id="result"></pre>
		<script type="text/javascript">
			
			var arrayOfObjects = {
					udemyLecture: [ 
						{id: 1, name: 'JSON with Java', nameLine2: 'Json and Java Lecture', desc: 'Udemy lecture', enabled: true},
						{id: 2, name: 'JSON Spring MVC', nameLine2: 'Json and Java Lecture', desc: 'Udemy lecture', enabled: true},
						{id: 3, name: 'JSON Spring MVC Hibernate', nameLine2: 'Json and Java Lecture', desc: 'Udemy lecture', enabled: true},
						{id: 4, name: 'JSON with REST', nameLine2: 'Json and Java Lecture', desc: 'Udemy lecture', enabled: true}
					]
			};
			alert(arrayOfObjects.udemyLecture[0].name);
			
			document.getElementById("result").innerHTML = JSON.stringify(arrayOfObjects, null, 2);
			
		</script>
	</body>
</html>