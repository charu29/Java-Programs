<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%-- jsf:pagecode language="java" location="/src/pagecode/Employee2.java" --%><%-- /jsf:pagecode --%><%@page
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%><%@taglib
	uri="http://java.sun.com/jsf/html" prefix="h"%><%@taglib
	uri="http://www.ibm.com/jsf/html_extended" prefix="hx"%><html>
<head>
<title>employee2</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" title="Style"
	href="theme/stylesheet.css">
</head>
<f:view>
	<body>
	<hx:scriptCollector id="scriptCollector1">
		<h:form styleClass="form" id="form1">
			EmployeeName: <h:inputText styleClass="inputText" id="text1"></h:inputText>
			<br>
			Designation: <h:inputText styleClass="inputText" id="text2"></h:inputText>
			<br>
			Salary: <h:inputText styleClass="inputText" id="text3"></h:inputText>
			<br>
			<hx:commandExButton type="submit" value="Generate Salary"
				styleClass="commandExButton" id="button1" action="#{pc_Employee2.doButton1Action}"></hx:commandExButton>
		</h:form>
	</hx:scriptCollector>
	</body>
</f:view>
</html>