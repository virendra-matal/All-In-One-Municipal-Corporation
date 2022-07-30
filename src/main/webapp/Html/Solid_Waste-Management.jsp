<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.MunicipalCorporation.Model.Solid_Waste_Management"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solid Waste Management</title>
        <link href="../Css/solid waste management.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">

    </head>
    <body>
        <div class="screen">

            <div class="sidebar">
                <h1>City Services</h1>
                <ul>
                    <li> <a href="index.html"><i class="fa fa-home"> </i> Home </a></li>
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
                        <h2>Solid Waste Management</h2><br>
                        <a href="Home.jsp"><span>Home</span></a>
                        <meta property="position" content="1">
                        >
                         <a href="Solid_Waste-Management.jsp "><span>Solid Waste Management</span></a>
                    </div>
                </div>
                <div class="solid_waste">
                    <jsp:include page="../Solid_Waste_Management_Servlet" />
                    
                    <h2>TOTAL EXISTING VEHICLES</h2>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Compactors</th>
                                <th>Dumpers</th>
                                <th>Tippers</th>
                                <th>Tractors</th>
                                <th>Mechanised Sweeping Machine</th>
                                <th>Tricycle</th>
                                <th>Handcart</th>
                                <th>Waste Bins</th>
                            </tr>
                        </thead>
                        <tbody>
                             <%List<Solid_Waste_Management> hosp= (ArrayList<Solid_Waste_Management>) request.getAttribute("solid");
                            for (Solid_Waste_Management a : hosp) {%>
                            <tr>
                                <td><%=a.getExisting_Compactor()%></td>
                                <td><%=a.getExisting_Dumper()%></td>
                                <td><%=a.getExisting_Tippers()%></td>
                                <td><%=a.getExisting_Tractor()%></td>
                                <td><%=a.getExisting_Machanised_Swipping_Machine()%></td>
                                <td><%=a.getExisting_Tricycle()%></td>
                                <td><%=a.getExisting_Handcraft()%></td>
                                <td><%=a.getExisting_Waste_Bin()%></td>
                            </tr>
                        </tbody>
                        <%}%>
                    </table>
                    
                    <h2>TOTAL EXISTING CAPACITY AVAILABLE</h2>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Compactors</th>
                                <th>Dumpers</th>
                                <th>Tippers</th>
                                <th>Tractors</th>
                                <th>Mechanised Sweeping Machine</th>
                                <th>Tricycle</th>
                                <th>Handcart</th>
                                <th>Waste Bins</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%List<Solid_Waste_Management> hosp1= (ArrayList<Solid_Waste_Management>) request.getAttribute("solid");
                            for (Solid_Waste_Management a : hosp1) {%>
                            <tr>
                                <td><%=a.getAvailable_Compactor()%></td>
                                <td><%=a.getAvailable_Dumper()%></td>
                                <td><%=a.getAvailable_Tippers()%></td>
                                <td><%=a.getAvailable_Tractor()%></td>
                                <td><%=a.getAvailable_Machanised_Swipping_Machine()%></td>
                                <td><%=a.getAvailable_Tricycle()%></td>
                                <td><%=a.getAvailable_Handcraft()%></td>
                                <td><%=a.getAvailable_Waste_Bin()%></td>
                            </tr>
                        </tbody>
                        <%}%>
                    </table>
                    <h2>TOTAL ADDITIONAL VEHICLES PROPOSED</h2>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Dumper with closed body</th>
                                <th>Tractors with closed body</th>
                                <th>Tricycle</th>
                                <th>Dumper with closed body(Capital Expenditure)</th>
                                <th>Tractors with closed body(Capital Expenditure)</th>
                                <th>Tricycle(Capital Expenditure)</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%List<Solid_Waste_Management> hosp2= (ArrayList<Solid_Waste_Management>) request.getAttribute("solid");
                            for (Solid_Waste_Management a : hosp1) {%>
                            <tr>
                                <td><%=a.getAdditional_Dumper_with_closed_body()%></td>
                                <td><%=a.getAdditional_Tractor_with_closed_body()%></td>
                                <td><%=a.getAdditional_Tricycle()%></td>
                                <td><%=a.getAdditional_Dumper_Expenditure()%></td>
                                <td><%=a.getAdditional_Tractor_Expenditure()%></td>
                                <td><%=a.getAdditional_Tricycle_Expenditure()%></td>
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
