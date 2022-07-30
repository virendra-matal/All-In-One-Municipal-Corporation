<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="java.util.List"%>
<%@page import="com.MunicipalCorporation.Model.admin"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
        <link href="../Css/Municipal_Commissioner.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">

    </head>
    <body>
        <div class="screen">
        
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

                    <div class="main_content">
                        <h2 style="text-transform: uppercase; color: blue;">Municipal Commissioner</h2>
                    </div>
                </div>
                <div class="profile">
                    <jsp:include page="../Admin_Dashboard_Servlet" />
                    <table>
                        <%List<admin> addmin = (ArrayList<admin>) request.getAttribute("data");
                            for (admin a : addmin) {%>
                        <tr class="photo">
                            <td class="photo_col">
                                <img class="photo" style="height: 300px;" src="../images/Admin profile img.jpg" alt=""/>

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
