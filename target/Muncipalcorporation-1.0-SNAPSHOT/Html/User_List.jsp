<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User List</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/User_List.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>
    <body>

        <div class="screen">
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
                    <li><a href="Admin _Logout.jsp"><i class="fa fa-commenting"></i> Logout </a></li>
                </ul>

            </div>
            <div class="header">
            <div class="marquee">

                <% String Admin_MCorp_Name = (String) session.getAttribute("Admin_MCorp_Name");%>
                <marquee> Welcome  To <%=Admin_MCorp_Name%> </marquee>
            </div>
            <div class="show_comlaint_box">

                <jsp:include page="../User_List_Servlet" />
                <table class="newtablecls" id="table">

                    <tr>
                        <th> User Id </th>
                        <!--<th>Type of Complaints</th>-->
                        <!--<th>Ward</th>-->
                        <th> Name Of User</th>
                        <th> Username </th>
                        <th> Password </th>
                        <th> Mobile_Number </th> 
                        <th> City </th>
                        <th> State </th>
                        <th> Area </th>
                        <th> Age </th>
                        <th> Action </th>

                    </tr>


                    <!--jstl tag-->
                    <c:forEach var="comp" items="${user}">
                        <tr>

                            <td><c:out value="${comp.userID}"/></td>
                            <td><c:out value="${comp.u_Name}"/></td>
                            <td><c:out value="${comp.username}"/></td>
                            <td><c:out value="${comp.password}"/></td>
                            <td><c:out value="${comp.mobile_Number}"/></td>
                            <td><c:out value="${comp.city}"/></td>
                            <td><c:out value="${comp.state}"/></td>
                            <td><c:out value="${comp.area}"/></td>
                            <td><c:out value="${comp.age}"/></td>
                            <td><input type="button" value="Delete" id="btn1" onclick="DeleteUser(this)" data-userID="<c:out value="${comp.userID}"/>"></td>

                        </tr> 
                    </c:forEach>

                </table>
                <dir class="lower_part">
                    <!--hello-->

                </dir>
            </div>
            </div>
        </div>
        <script>
            function DeleteUser(e) {
                var Id = $(e).attr("data-userID");
//                    alert( Id);
                $(document).ready(function () {

                    $.post("../DeleteUser_Servlet", {UserId: Id});

//                        location.reload();
                });
                alert("User is Deleted.");
//                    document. location. reload();
//                window.location.assign("");
                window.location.href="User_List.jsp";
            }
            ;
        </script>
    </body>
</html>
