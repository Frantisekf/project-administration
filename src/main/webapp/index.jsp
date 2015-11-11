<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
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
<div data-role="header" data-theme="b" data-position="fixed">
    <h1 style="color: white">Project Administration</h1>

    <div data-role="controlgroup" data-type="horizontal" class="ui-mini ui-btn-right">
        <a href="signup.jsp" class="ui-btn ui-btn ui-btn-icon-right ui-icon-user">Register</a>
        <a href="login.jsp" class="ui-btn ui-btn ui-btn-icon-right ui-icon-carat-r">Login</a>
    </div>

</div>
<!-- /header -->
<div data-role="content">

    <div>
        &nbsp; &nbsp;
        <h1 style="text-align: center">Welcome</h1>

        <p align="center">
            This is Project-administration please login to your account or register a new one
            to proceed.
        </p>
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
