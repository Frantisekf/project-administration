<%--
  Created by IntelliJ IDEA.
  User: frant
  Date: 11/11/15
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>

<body>
<div data-role="page">
    <div data-role="header" data-theme="b" data-position="fixed">
        <h1 style="color: white">Project Administration</h1>

        <div data-role="controlgroup" data-type="horizontal" class="ui-mini ui-btn-right">
            <a href="#" data-ajax="false" class="ui-btn  ui-btn-icon-right ui-icon-user">Register</a>
            <a href="#" data-ajax="false" class="ui-btn  ui-btn-icon-right ui-icon-carat-r">Login</a>
        </div>
    </div>
    <!-- /header -->
    <div role="main" class="ui-content">
        <h2 style="text-align: center">Login</h2>

        <form id="login_form" action="/login" method="post">
            <div class="ui-field-contain">
                <label>UserName</label>
                <form:input type="userName" name="password" id="password" path="userName" data-corners="false"
                            data-mini="true" placeholder="User Name"/>
            </div>
            <div class="ui-field-contain">
                <label for="password">Password</label>
                <form:input type="password" name="password" id="password" path="password" data-corners="false"
                            data-mini="true" placeholder="password"/>

            </div>
            &nbsp;
            <input type="submit" value="submit" data-corners="false" data-mini="true"
                   class="ui-input-btn ui-btn ui-mini"/>

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
