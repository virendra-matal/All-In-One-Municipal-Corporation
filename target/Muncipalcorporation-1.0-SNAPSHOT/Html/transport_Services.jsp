<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.MunicipalCorporation.Model.Trnsport_Service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solid Waste Management</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/transport_Service.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="screen">

            <div class="sidebar">
                <h1>City Services</h1>
                <ul>
                    <li> <a href="Home.jsp"><i class="fa fa-home"> </i> Home </a></li>
                    <li><a href="City_Services.jsp"><i class="fa fa-user"></i> Hospitals </a></li>
                    <li><a href="Solid_Waste-Management.jsp"><i class="fa fa-list-ul"></i>Solid Waste Management </a></li>
                    <li><a href="transport_Services.jsp"><i class="fa fa-diamond"></i> Transport service</a></li>
                    <li><a href=""><i class="fa fa-commenting"></i> Apply for </a>
                        <div class="sub-links">
                            <ul>
                               <li> <a href="Birth_Certificate.jsp"> Birth Certificate </a> </li>
                                <li> <a href="Death_Certificate.jsp"> Death Certificate </a> </li>
                                <li> <a href="Marriage_Certificate.jsp"> Marriage Certificate </a> </li>
                                <li> <a href="Ganpati_booking_slot.jsp"> Ganapati Visarjan Slot Booking  </a> </li>
                            </ul>

                        </div>
                    </li>
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

                    <div class="main_content">
                        <h2>Transport service </h2><br>
                        <a href="Home.jsp"><span>Home</span></a>
                        <meta property="position" content="1">
                        >
                        <a href="transport_Services.jsp"><span>Transport service</span></a>
                    </div>
                </div>
                <div class="solid_waste">
                    <jsp:include page="../Transport_service_Servlet" />

                    <h2>TRANSPORT SERVICE TIMETABLE</h2>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Sr. No.</th>
                                <th>Route</th>
                                <th>First Bus</th>
                                <th>Last Bus</th>
                                <th>Rounds</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%List<Trnsport_Service> hosp = (ArrayList<Trnsport_Service>) request.getAttribute("services");
                                 for (Trnsport_Service a : hosp) {%>
                            <tr>
                                <td><%--<%=a.getTransport_Service_Id()%>--%></td>
                                <td><%=a.getRoute()%></td>
                                <td><%=a.getFirst_Bus()%></td>
                                <td><%=a.getLast_Bus()%></td>
                                <td><%=a.getRounds()%></td>
                            </tr>
                        </tbody>
                        <%}%>
                    </table>
                </div>
                <div class="lower_part">

                </div>
            </div>
        </div>
    </body>
</html>
