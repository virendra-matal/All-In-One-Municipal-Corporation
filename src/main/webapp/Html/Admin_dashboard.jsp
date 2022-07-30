
<%@page import="java.util.List"%>
<%@page import="com.MunicipalCorporation.Model.admin"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
        <link href="../Css/Admin_Dashboard.css" rel="stylesheet" type="text/css"/>
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
            <div  class="left_side">
                <div class="header">
                    <div class="marquee">
                        <% String Admin_MCorp_Name = (String) session.getAttribute("Admin_MCorp_Name");%>
                <marquee> Welcome  To <%=Admin_MCorp_Name%> </marquee>
                    </div>

                    <div class="main_content">
                        <h2>Profile</h2>
                    </div>
                </div>
                <div class="profile">
                    <jsp:include page="../Admin_Dashboard_Servlet" />
                    <table style="width: 100%;">
                        <%List<admin> addmin= (ArrayList<admin>) request.getAttribute("data");
                            for (admin a : addmin) {%>
                        <tr >
                            <td >
                                <div >
                                <!--<img src="../images/pune m. c. logo.jfif" alt="">-->
                                <img class="photo" src="../images/Admin profile img.jpg" alt=""/>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Name: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.getAdmin_Name()%>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Username:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.getAdmin_Username()%>
                        </td>
                        </tr>
                        <tr>
                            <td>
                                Corporation Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.getMunicipal_Corporation()%>
                        </td>
                        </tr>
                        <tr>
                            <td>
                                Fax:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.getAdmin_fax()%>
                        </td>
                        </tr>
                        <tr>
                            <td>
                                Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.getAdmin_Email()%>
                        </td>
                        </tr>
                        <tr>
                            <td>
                                <p>Welcome to the official web portal of the Municipal Corporation of India. we aim to provide services to the resident of India in an efficient and user-friendly manner and reduce inconveniences cause to the public for getting information from various department.</p> 
                            </td>
                        </tr>
                        <%}%>
                    </table>
                </div>
                <div class="lower_part">

                </div>
            </div>
        </div>
    </body>
</html>
