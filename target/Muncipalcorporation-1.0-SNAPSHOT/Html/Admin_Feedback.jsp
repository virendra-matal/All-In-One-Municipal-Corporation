
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
        <link href="../Css/Admin_Feedback.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">

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
            <div class="show_comlaint_box">
            
            <jsp:include page="../Admin_Feedback_Servlet" />
            <table class="newtablecls">
                
                    <tr>
                        <th> Feedback Id </th>
                        <th> Name Of User</th>
                        <th> Email </th>
                        <th> Mobile_Number </th> 
                        <th> Feedback </th>
                        <th> Feedback Date </th>
                    </tr>
               
                    <!--jstl tag-->
                    <c:forEach var="comp" items="${feedback}">
                        <tr>
                            <td style="width: 10%"><c:out value="${comp.f_Id}"/></td>
                            <td style="width: 10%"><c:out value="${comp.complainant_name}"/></td>
                            <td style="width: 10%"><c:out value="${comp.email}"/></td>
                            <td style="width: 10%"><c:out value="${comp.mobile_number}"/></td>
                            <td style="width: 10%"><c:out value="${comp.feedback}"/></td>
                            <td style="width: 10%"><c:out value="${comp.feedback_date}"/></td>
                        </tr> 
                    </c:forEach>
                
            </table>
            <dir class="lower_part">
                <!--hello-->

            </dir>
        </div>
        </div>
    </body>
</html>
