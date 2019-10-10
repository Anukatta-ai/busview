<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Details</title>
</head>
<body>
<table width=100% frame="box">
<tr>
<th>Bus ID</th>
<th>Bus Travel Name</th>
<th>Source</th>
<th>Destination</th>
<th>Seats Availability</th>
</tr>
<c:forEach var="bus" items="${busDetails}">
<tr>
<td align="center">${bus.busid}</td>
<td align="center">${bus.bustravelname}</td>
<td align="center">${bus.source}</td>
<td align="center">${bus.destination}</td>
<td align="center">${bus.availableseats}</td>
</tr>
</c:forEach>
</table>
</body>
</html>