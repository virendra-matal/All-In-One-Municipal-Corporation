
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%--<%@ page isELIgnored="false"%>--%>
<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Complaint1</title>
        <link href="Css/show_complaint1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

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
        <div class="show_comlaint_box">
            <div class="empty_div2">
                <h2>Check the status of complaint which you have submitted.</h2>
                <h3>Thanks to being the responsible person.</h3>
            </div>

            <table class="table">
                <thead>
                    <tr>
                        <th>Complaint Id</th>
                        <th>Type of Complaints</th>
                        <th>Ward</th>
                        <th>Complainants Name</th>
                        <th>Complaint Description</th>
                        <th>Location</th>
                        <th>Complaint Date</th> 
                        <th>Response Date</th> 
                        <th> Mobile Number</th>
                        <th> Image</th>
                        <th> Status</th>
                        <th> Admin Response</th>

                    </tr>
                </thead>
                <tbody class="tbody">
                    <!--jstl tag-->
                    <c:forEach var="comp" items="${complaint}">
                        <tr>
                            <!--<td>hello</td>-->
                            <td><c:out value="${comp.complaint_Id}"/></td>
                            <td><c:out value="${comp.type_Of_Complaint}"/></td>
                            <td><c:out value="${comp.ward}"/></td>
                            <td><c:out value="${comp.complainant_Name}"/></td>
                            <td><c:out value="${comp.complaint_Description}"/></td>
                            <td><c:out value="${comp.location}"/></td>
                            <td><c:out value="${comp.complaint_date}"/></td>
                            <td><c:out value="${comp.response_date}"/></td>
                            <td><c:out value="${comp.mobile_number}"/></td>
                            <td><c:out value="${comp.image}"/></td>
                            <td><c:out value="${comp.status}"/></td>
                            <td><c:out value="${comp.admin_responce}"/></td>
                        </tr> 
                    </c:forEach>
                </tbody>
            </table>
            <dir class="lower_part">
                <table class="2nd_table">
                    
                    <tr>
                        <td>
                            <h3>Go Back To</h3>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <a href="Html/Home.jsp"> Home </a>

                        </td>
                        
                        <td>
                             <a href="Html/complaint_registration.jsp">Complaint Registration</a>
                        </td>
                    </tr>
                   
                    

                </table>

            </dir>
        </div>
        <!--
                <div class="chatbox">
        
                </div>
                    <div class="empty_div">
        
                    </div>-->
    </body>
</html>
