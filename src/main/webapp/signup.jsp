<%--
  Created by IntelliJ IDEA.
  User: frant
  Date: 11/11/15
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html>
<html>
<head>
    <!-- Include meta tag to ensure proper rendering and touch zooming -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Include jQuery Mobile stylesheets -->
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
    <!-- Include the jQuery library -->
    <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script type=text/javascript src="js/script.js"></script>
    <!-- Include the jQuery Mobile library -->
    <script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
<div data-role="page">
    <div data-role="header" data-theme="b" data-position="fixed">
        <h1 style="color: white">Project Administration</h1>

        <div data-role="controlgroup" data-type="horizontal" class="ui-mini ui-btn-right">
            <a href="signup.html" class="ui-btn ui-btn ui-btn-icon-right ui-icon-user">Register</a>
            <a href="login.html" class="ui-btn ui-btn ui-btn-icon-right ui-icon-carat-r">Login</a>
        </div>
    </div>
    <!-- /header -->
    <div role="main" class="ui-content">
        <h2 style="text-align: center">Register</h2>

        <form id="registration_form" method="post">
            <div class="ui-field-contain">
                <label for="email">Email</label>
                <form:input type="email" name="email" id="email" path="email" value="" data-corners="false"
                            data-mini="true" placeholder="name@email.com"/>
            </div>
            <div class="ui-field-contain">
                <label for="password">Password</label>
                <form:input type="password" name="password" id="password" value="" path="password" data-corners="false"
                            data-mini="true" placeholder="password"/>
            </div>
            <div class="ui-field-contain">
                <label for="passwordAgain">Password again</label>
                <form:input type="password" name="passwordAgain" id="passwordAgain" value="" path="passwordAgain"
                            data-corners="false" data-mini="true" placeholder="password"/>
            </div>
            <!--
            <div class="ui-field-contain">
              <label for="acceptTerms">Terms of agreement</label>
              <input type="checkbox" name="acceptTerms" id="acceptTerms" value="true" data-corners="false" data-mini="true" id="checkbox"/>
            </div>
            -->
            <input type="submit" value="submit" data-corners="false" data-mini="true" class="ui-input-btn ui-btn"/>
        </form>
    </div>
    <!-- /content -->
    <div data-role="footer" data-position="fixed">
        <h1></h1>
    </div>
    <!-- /footer -->
</div>
<!-- /page -->
</body>

</html>

