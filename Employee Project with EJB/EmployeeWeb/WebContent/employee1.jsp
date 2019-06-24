<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%-- jsf:pagecode language="java" location="/src/pagecode/Employee1.java" --%><%-- /jsf:pagecode --%><%@page
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%><%@taglib
	uri="http://www.ibm.com/jsf/html_extended" prefix="hx"%><%@taglib
	uri="http://java.sun.com/jsf/html" prefix="h"%><html>
<head>
<title>employee1</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" title="Style"
	href="theme/stylesheet.css">
</head>
<f:view>
	<body>
	<hx:scriptCollector id="scriptCollector1">

		<hx:dataTableEx value="#{list.l1}" var = "n" border="0" cellpadding="2" cellspacing="0"
			columnClasses="columnClass1" headerClass="headerClass"
			footerClass="footerClass" rowClasses="rowClass1, rowClass2"
			styleClass="dataTableEx" id="tableEx1">
			<hx:columnEx id="columnEx1">
				<f:facet name="header">
					<h:outputText id="text1" styleClass="outputText" value="name"></h:outputText>
				</f:facet>
				<h:outputText value = "#{n.name}" styleClass="outputText" id="text5"></h:outputText>
			</hx:columnEx>
			<hx:columnEx id="columnEx2">
				<f:facet name="header">
					<h:outputText value="Designation" styleClass="outputText"
						id="text2"></h:outputText>
				</f:facet>
				<h:outputText value="#{n.desg}" styleClass="outputText" id="text6"></h:outputText>
			</hx:columnEx>
			<hx:columnEx id="columnEx3">
				<f:facet name="header">
					<h:outputText value="salary" styleClass="outputText" id="text3"></h:outputText>
				</f:facet>
				<h:outputText value="#{n.salary}" styleClass="outputText" id="text7"></h:outputText>
			</hx:columnEx>
			<hx:columnEx id="columnEx4">
				<f:facet name="header">
					<h:outputText value="Gross salary" styleClass="outputText"
						id="text4"></h:outputText>
				</f:facet>
				<h:outputText value="#{n.nsalary}" styleClass="outputText" id="text8"></h:outputText>
			</hx:columnEx>
		</hx:dataTableEx>
	</hx:scriptCollector>
	</body>
</f:view>
</html>