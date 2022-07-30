

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Logout </title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/admin_logout.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="sidebar">
            <h1>Admin Dashboard</h1>
            <ul>
                <li> <a href="Home.jsp"><i class="fa fa-home"> </i> Home </a></li>
                <li><a href="Admin_dashboard.jsp"><i class="fa fa-user"></i> Admin Profile </a></li>
                <li><a href="User_List.jsp"><i class="fa fa-list-ul"></i>User List </a></li>
                <li><a href="Admin_Complaints.jsp"><i class="fa fa-diamond"></i>Complaints</a></li>
                <li><a href="Chatbox.jsp"><i class="fa fa-commenting"></i> Chatbox </a></li>
                <li><a href="Admin_Feedback.jsp"><i class="fa fa-commenting"></i> Feedback </a></li>
                <li><a href="new.jsp"><i class="fa fa-commenting"></i> Online Applications </a></li>
                <li><a href="Admin_Logout.jsp"><i class="fa fa-lock"></i> Logout </a></li>
            </ul>

        </div>
        <div  class="left_side">
            <div class="header">
                <div class="marquee">
                    <% String Admin_MCorp_Name = (String) session.getAttribute("Admin_MCorp_Name");%>
                    <marquee> Welcome  To <%=Admin_MCorp_Name%></marquee>
                </div>

                <div class="main_content">
                    <p> Are you sure to Logout? </p>
                    <input type="button" id="button" name="button" onclick="logout()" value="Logout"  >
                </div>
            </div>

        </div>

        <script>
            function  logout() {
//                $(document).ready(function () {
                $.post("../Admin_Logout_Servlet");
                alert("Logout succefull!!");
                window.location.href = "Admin_login.jsp";
//                });
            }
            ;
        </script>

    </body>
</html>
