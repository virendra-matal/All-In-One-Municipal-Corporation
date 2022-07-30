<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.MunicipalCorporation.Model.department"%>
<%@page import="com.MunicipalCorporation.Model.department"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Town Planning Department</title>
        <link href="../Css/Department.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">

    </head>
    <body>
        <div class="screen">

            <div class="sidebar">
                <h1> DEPARTMENTS </h1>
                <ul>
                    <li> <a href="Home.jsp"><i class="fa fa-home"> </i> Home </a></li>
                    <li> <a href="Department.jsp"><i class="fa fa-home"> </i> IT Department </a></li>
                    <li><a href="License_Dept.jsp"><i class="fa fa-user"></i> License Department </a></li>
                    <li><a href="Town_planning.jsp"><i class="fa fa-list-ul"></i>Town Planning Department </a></li>
                    <li><a href="Health_Dept.jsp"><i class="fa fa-diamond"></i>Health Department</a></li>
                    <li><a href="Fire_dept.jsp"><i class="fa fa-commenting"></i> Fire Department </a></li>
                    <li><a href="Garden_Tree_Dept.jsp"><i class="fa fa-commenting"></i> Garden and Trees Department </a></li>
                    
                </ul>
                
            </div>
            <div  class="left_side">
                <div class="header">
                    <div class="marquee">
                        <c:set var = "usertype" scope="session" value ='${sessionScope.UserType}'/>

                        <c:choose>
                            <c:when test="${usertype == 'Users'}">
                                <% String Municipal_corp_Name = (String) session.getAttribute("Municipal_corp_Name");%>
                                <marquee> Welcome To <%=Municipal_corp_Name%></marquee>
                            </c:when>
                            <c:when test="${usertype == 'Admin'}">
                                <% String Admin_MCorp_Name = (String) session.getAttribute("Admin_MCorp_Name");%>
                                <marquee> Welcome  To <%=Admin_MCorp_Name%></marquee>
                            </c:when>
                            <c:otherwise>
                                <marquee>Welcome to the municipal corporation of India</marquee>
                            </c:otherwise>
                        </c:choose>
                    </div>

                    <!--                    <div class="main_content">
                                            
                                        </div>-->
                </div>
                <div class="dept_body">

                    <table>
                        <jsp:include page="../Town_Planning_Servlet" />
                        <%List<department> town = (ArrayList<department>) request.getAttribute("town");
                            for (department d : town) {%>
                        <tr>
                            <td class="dept_name">
                                <%=d.getDept_Name()%>
                            </td>
                        </tr> 
                        <tr>
                            <td class="dept_desc">
                                SHORT DESCRIPTION ABOUT IT DEPARTMENT:<br><br>
                                <p><%=d.getDept_Description()%></p>
                            </td>
                        </tr> 
                        <table class="inner_table">

                            <thead>
                                <tr>
                                    <th> DEPARTMENT NAME</th>
                                    <th> HEAD OF DEPARTMENT</th>
                                    <th> DESIGNATION</th>
                                    <th> EMAIL ID</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><%=d.getDept_Name()%></td>
                                    <td><%=d.getHead_Of_Dept()%></td>
                                    <td><%=d.getDesignation()%></td>
                                    <td><%=d.getEmail_Id()%></td>
                                </tr>
                            </tbody>
                        </table>
                        <%}%>
                    </table>
                </div>
                <div class="lower_part">

                </div>
            </div>
        </div>
    </body>
</html>
