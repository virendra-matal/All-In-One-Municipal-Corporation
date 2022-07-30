<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>IT PROJECT</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../Css/style.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
    </head>
    <body>
        <section class="header"> 
            <nav>

                <a href="Home.jsp"> <img src="../images/m. c. logo.png" alt=""> </a>

                <div class="links">
                    <ul>
                        <li> <a href="Home.jsp"><i class="fa fa-home"> </i> HOME </a></li>

                        <c:set var = "type" scope="session" value ='${sessionScope.UserType}'/>

                        <li> <a href=""><i class="fa fa-lock"></i> ADMIN </a>
                            <div class="sub-links">
                                <ul>
                                    <c:if test="${type == 'Admin'}"> 
                                        <li> <a href="Admin_dashboard.jsp">Admin Dashboard</a> </li>
                                        </c:if>
                                    <li> <a href="Municipal_Commissioner.jsp"> Municipal Commissioner </a> </li>
                                    <li> <a href="Department.jsp"> Department </a> </li>
                                        <c:if test="${type == 'Users'}"> 
                                        <li> <a href="chat.jsp">Chat with Commissioner </a> </li>
                                        </c:if>
                                </ul>
                            </div>
                        </li>


                        <li> <a href=""><i class="fa fa-diamond"></i> COMPLAINTS </a>
                            <div class="sub-links">
                                <ul>
                                    <li> <a href="complaint_registration.jsp"> Register your complaints </a> </li>
                                    <li> <a href="Check_Status.jsp"> Get status of complaints </a> </li>
                                </ul>
                            </div>
                        </li>

                        <li> <a href="logout.jsp"><i class="fa fa-sign-in"></i> LOGOUT </a> 
                            <div class="sub-links">
                                <ul>

                                    <!--<li> <a href="login.jsp"> User login </a> </li>-->
                                    <!--<li> <a href="Admin_login.jsp"> Admin login </a> </li>-->
                                </ul>
                            </div>
                        </li>

                        <li> <a href="City_Services.jsp"><i class="fa fa-server"></i> CITY SERVICES </a>
                            <div class="sub-links">
                                <ul>
                                    <li> <a href="City_Services.jsp"> Hospitals </a> </li>
                                    <li> <a href="Solid_Waste-Management.jsp"> Solid waste management </a> </li>
                                    <li> <a href="transport_Services.jsp"> Transport services </a> </li>
                                    <li> <a href="City_Services.jsp"> Apply For </a> </li>
                                </ul>

                            </div>
                        </li>

                        <li> <a href="Feedback.jsp"><i class="fa fa-comments"></i> FEEDBACK </a> </li>
                        <li> <a href="About.jsp"><i class="fa fa-users"></i> ABOUT </a> </li>

                    </ul>
                </div>
            </nav>
            <div class="heading">
                <c:set var = "usertype" scope="session" value ='${sessionScope.UserType}'/>

                <c:choose>
                    <c:when test="${usertype == 'Users'}">
                        <% String Municipal_corp_Name = (String) session.getAttribute("Municipal_corp_Name");%>
                        <h1> <b> Welcome To <%=Municipal_corp_Name%></b></h1>
                    </c:when>
                    <c:when test="${usertype == 'Admin'}">
                        <% String Admin_MCorp_Name = (String) session.getAttribute("Admin_MCorp_Name");%>
                        <h1> <b> Welcome  To <%=Admin_MCorp_Name%></b></h1>
                    </c:when>
                    <c:otherwise>
                        <h1> <b>Welcome to the municipal corporation of India</b></h1>
                    </c:otherwise>
                </c:choose>



            </div>

            <div class="images ">

            </div>
        </section>

        <!-- online civil services-->

        <section class="services">
            <h2> ONLINE CIVIL CERVICES </h2>
            <div class="row1">

                <div class="service-colm">
                    <h3> Online Property Tax </h3>
                    <p> Online Tax bill payment help citizen to view or pay their bill online without any hassle.</p>
                </div>

                <div class="service-colm">
                    <h3> Online Water Tax </h3>
                    <p> Online Tax bill payment help citizen to view or pay their bill online without any hassle.</p>
                </div>

                <div class="service-colm">
                    <h3> <a href="complaint_registration.jsp">Complaint Registration </a></h3>
                    <p> register your complaints online instead of offline process .</p>
                </div>

                <div class="service-colm">
                    <h3> RTS </h3>
                    <p> Online services .</p>
                </div>

                <div class="service-colm">
                    <h3> Scheme </h3>
                    <p> We provide different kind of scheme which helps citizen for improving themselves.  .</p>
                </div>

                <div class="service-colm">
                    <h3> E-Tender </h3>
                    <p> For E-tender and quotation related updates click here  .</p>
                </div>

                <div class="service-colm">
                    <h3> Election </h3>
                    <p> Upcoming .</p>
                </div>

                <div class="service-colm">
                    <h3><a href="transport_Services.jsp"> Transport </a></h3>
                    <p> For bus time table .</p>
                </div>
            </div>
        </section>


        <!-- footer-->
        <section class="footer">
            <footer>
                <p class="about">  
                    <a href="home.html" rel="nofollow"> HOME </a>
                    |
                    <a href="about.html" rel="nofollow"> ABOUT </a>
                    |
                    <a href="" rel="nofollow"> PRIVACY POLICY </a>

                </p>
                <p>
                    Copyright 2000 - 2022 tyit project.com
                </p>
            </footer>


        </section>
    </body>
</html>

