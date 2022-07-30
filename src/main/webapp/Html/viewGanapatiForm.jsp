

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Admin Ganapati Immersion form view</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/viewForm.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
                    <li><a href="Chatbox.jsp"><i class="fa fa-commenting"></i> Chat box </a></li>
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


                    <%--<jsp:include page="../Admin_Death_Certificate_Servlet" />--%>
                    <div style=" position: fixed;">
                        <div class="content">
                            <table class="newtablecls" style="border: 1px;">
                                <tr>
                                    <td colspan="2" style="text-align: center; background: #ccccff;"><b><%=Admin_MCorp_Name%></b></td>
                                </tr>

                                <tr>
                                    <td colspan="2" style="text-align: center; background: #ccccff;"><b>Ganapati Immersion Booking</b></td>
                                </tr>
                               
                                <tr>
                                    <td style="width: 450px;" >Type of Registration:  <span class="span_left_space" id="type" > </span></td>
                                    <td style="width: 450px;" >Name of Applicant:  <span class="span_left_space" id="applicant_name" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="2">Mobile Number: <span class="span_left_space" id="number" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Address: <span class="span_left_space" id="address" > </span></td>
                                    <td style="width: 450px;" >Ward: <span class="span_left_space" id="ward" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Place: <span class="span_left_space" id="place" > </span></td>
                                    <td style="width: 450px;" >Date_and_Time: <span class="span_left_space" id="date" > </span></td>
                                </tr>
                                
                                <tr>
                                    <td style="height: 90px;" colspan="2">Attached Documents:</td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td  colspan="2">Signature: <span id="doc7" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                            </table>
                        </div>
                        <div class="lower_part">


                        </div>

                    </div>

                </div>

            </div>

            <script>
                jsarray = JSON.parse(sessionStorage.getItem("jsArray"));
                var Ganapati_Visarjan_Id = jsarray[0];
                $(document).ready(
                        callServlet()
                        );
                function callServlet() {
                    $.post("../Gan_Immersion_View_Servlet", {Ganapati_Visarjan_Id : Ganapati_Visarjan_Id}, function (data) {
                        for (var i = 0; i < data.length; i++) {
                            $("#type").text(data[i].Type_of_Registration);
                            $("#applicant_name").text(data[i].Name);
                            $("#number").text(data[i].Mobile_Number);
                            $("#address").text(data[i].Address);
                            $("#ward").text(data[i].Ward);
                            $("#place").text(data[i].Place);
                            $("#date").text(data[i].Date_and_Time);
                            $("#doc7").text(data[i].Signature);

                        }

                    });
                }
            </script>
    </body>
</html>



