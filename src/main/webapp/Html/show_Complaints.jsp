<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%--<%@ page isELIgnored="false"%>--%>
<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Complaints</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="Css/Show_Complaints.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
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
                        <!--                        <th>Response Date</th> -->
                        <th> Mobile Number</th>
                        <th> Image</th>
                        <th> Status</th>
                        <!--<th> Admin Response</th>-->

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
                            <td><c:out value="${comp.mobile_number}"/></td>
                            <td><c:out value="${comp.image}"/></td>
                            <td><c:out value="${comp.status}"/></td>
                            <!--<td><c:out value="${comp.admin_responce}"/></td>-->
                        </tr> 
                    </c:forEach>
                </tbody>
            </table>
            <div class="link">
                <a href="Html/complaint_registration.jsp">Add new complaint</a><a href="Html/Home.jsp"> Home </a>
                <br><br><br><br>
                <a href="Html/chat.jsp">Chat with Municipal Commissioner </a>
            </div>
        </div>

<!--        <div class="chatbox">

            <div class="message_box">

                <table id="adminall">
                    <tr>
                        <c:if test="$(data.Sender_Id=1)">
                        <td " style="margin-left: 100px"></td>
                        </c:if>
                    </tr>
                </table>

            </div>
            <div class="input-box">
                <input type="text" id="textbox" class="text" name="textbox" placeholder="Type a message" required>
                <input type="button" value="send" id="send" class="submit_button">
            </div>

        </div>-->
        <div class="empty_div">

        </div>
        <script>
//                setInterval(loadmessage(),1000);
//                function loadmessage(){
//                    $.post("LoadMessage_Servlet", {Message: 0}, function (data, status) {
//                            for (var i = 0; i < data.length; i++) {
//                                var htmlname = "<td>" + data[i].Message+ + data[i].Date + + data[i].Sender_Id +"</td>";
//                                $('#adminall tr:last').append(htmlname);
//
//                                var row = document.createElement('tr');
//                                var tableCurrentPoints = document.getElementById("adminall"); // find table to append to
//                                tableCurrentPoints.appendChild(row);
//                            }
//                        });
//            }
//            $(document).ready(function () {
//                $("#send").click(function () {
//                    var message = $("#textbox").val();
//                    $.post("sendmessage_Servlet", {Message: message}, function (data, status) {
//                        $("#textbox").val("");
////                        $.post("LoadMessage_Servlet", {Message: 0}, function (data, status) {
////                            for (var i = 0; i < data.length; i++) {
////                                var htmlname = "<td>" + data[i].Message + "</td>";
////                                $('#adminall tr:last').append(htmlname);
////
////                                var row = document.createElement('tr');
////                                var tableCurrentPoints = document.getElementById("adminall"); // find table to append to
////                                tableCurrentPoints.appendChild(row);
////                            }
////                        });
//                    });
//                });
//            });
        </script>
    </body>
</html>
