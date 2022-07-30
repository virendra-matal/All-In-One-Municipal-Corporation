<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Complaints</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/Admin_Complaints.css" rel="stylesheet" type="text/css"/>
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

                    <jsp:include page="../Admin_Complaints_Servlet" />


                    <table class="newtablecls">
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
                            <th> Response By Webchat </th>
                            <th> Response </th>
                        </tr>
                        <c:forEach var="comp" items="${complaint}">
                            <tr>
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
                                <td><input type="button" class="btn1" name="responce" id="ResBychat" value="Response" onclick="window.location.href = 'Chatbox.jsp';" data-complaintby="<c:out value="${comp.complaintby}"/>"></td>
                                <td><input type="button" class="btn1" name="responce" id="ResByText" value="Response" onclick="ResponceByText(this)" data-complaintby="<c:out value="${comp.complaintby}"/>" data-complaintId="<c:out value="${comp.complaint_Id}"/>" data-complaintsType='<c:out value="${comp.type_Of_Complaint}"/>' data-name='<c:out value="${comp.complainant_Name}"/>' data-location='<c:out value="${comp.location}"/>' data-complaint_date='<c:out value="${comp.complaint_date}"/>' data-number='<c:out value="${comp.mobile_number}"/>' data-desc='<c:out value="${comp.complaint_Description}"/>'> </td>
                            </tr> 
                        </c:forEach>
                    </table>
                    <div class="lower_part">
                        <!--hello-->

                        </dir>
                    </div>


                </div>
            </div>
            <script>
                //              function ResponceByWebchat(e){
                //                  var userid = $(e).attr('data-complaintby'); 
                //                  alert(" user id is"+ userid);
                //                   window.location.assign("Chatbox.jsp");
                //                   
                //              };  
                function ResponceByText(e) {
                    var userid = $(e).attr('data-complaintby');
                    var complaintId = $(e).attr('data-complaintId');
                    var complaintsType = $(e).attr('data-complaintsType');
                    var name = $(e).attr('data-name');
                    var location = $(e).attr('data-location');
                    var complaint_date = $(e).attr('data-complaint_date');
                    var number = $(e).attr('data-number');
                    var desc = $(e).attr('data-desc');
                    //                alert(" binded data is :" + userid +"\n complaintId"+complaintId+ "complaintsType" + complaintsType + "name" + name + "location" + location + "complaint_date" + complaint_date + "number" + number + "desc" + desc);
                    jsarray = [userid, complaintId, complaintsType, name, location, complaint_date, number, desc];
                    sessionStorage.setItem("jsArray", JSON.stringify(jsarray));
                    window.location.assign("Admin_Response_By_Text.jsp");

                }
                
            </script>
    </body>
</html>
