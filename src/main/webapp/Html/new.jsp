<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Admin Birth Certificate</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/new.css" rel="stylesheet" type="text/css"/>
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


                    <jsp:include page="../Admin_Birth_Certificate_Servlet" />
                    <div style=" position: fixed;">

                        <div class="link">
                            <a href="#" onclick='show(1);'>Birth Certificates</a>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="#" onclick='show(2);'>Death Certificates</a>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="#" onclick='show(3);'>Marriage Certificates</a>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="#" onclick='show(4);'>Ganapati Immersion Booking</a>
                        </div>

                        <div class="content">
                            <div id="table1"> 
                                <h2>Birth Certificates</h2>
                                <table class="newtablecls" id="table">

                                    <tr>
                                        <th> Sr No. </th>

                                        <th> Name Of Applicant</th>
                                        <th> Address </th>
                                        <th> Date </th>
                                        <th> Action </th> 
                                        <th> View </th>
                                        <th> Status </th>
                                    </tr>
                                    <c:forEach var="comp" items="${Birth}">
                                        <tr>
                                            <td></td>
                                            <td><c:out value="${comp.applicant_Name}"/></td>
                                            <td><c:out value="${comp.address}"/></td>
                                            <td><c:out value="${comp.date}"/></td>
                                            <td><input type="button" value="Accept" class="btn1" id="btn1" onclick="AcceptForm(this)" data-Birth_Registration_Id="<c:out value="${comp.birth_Registration_Id}"/>">
                                                <input type="button" value="Reject" class="btn1" id="btn2" onclick="RejectForm(this)" data-Birth_Registration_Id="<c:out value="${comp.birth_Registration_Id}"/>">
                                            </td>
                                            <td><input type="button" value="View" class="btn1" id="btn3" onclick="ViewBirth(this)" data-Birth_Registration_Id="<c:out value="${comp.birth_Registration_Id}"/>"></td>
                                            <td><c:out value="${comp.status}"/></td>
                                        </tr> 
                                    </c:forEach>

                                </table>
                            </div>
                            <div id="table2">
                                <h2>Death Certificates</h2>
                                <table class="newtablecls" id="table">

                                    <tr>
                                        <th> Sr No. </th>
                                        <th> Name Of Applicant</th>
                                        <th> Address </th>
                                        <th> Date </th>
                                        <th> Action </th> 
                                        <th> View </th>
                                        <th> Status </th>
                                    </tr>
                                    <c:forEach var="comp" items="${Death}">
                                        <tr>
                                            <td></td>
                                            <td><c:out value="${comp.applicant_Name}"/></td>
                                            <td><c:out value="${comp.address}"/></td>
                                            <td><c:out value="${comp.date}"/></td>
                                            <td><input type="button" value="Accept" class="btn1" id="btn1" onclick="AcceptDeathForm(this)" data-Death_Registration_Id="<c:out value="${comp.death_Registration_Id}"/>">
                                                <input type="button" value="Reject" class="btn1" id="btn2" onclick="RejectDeathForm(this)" data-Death_Registration_Id="<c:out value="${comp.death_Registration_Id}"/>">
                                            </td>
                                            <td><input type="button" value="View" class="btn1" id="btn3" onclick="ViewDeath(this)" data-Death_Registration_Id="<c:out value="${comp.death_Registration_Id}"/>"></td>
                                            <td><c:out value="${comp.status}"/></td>
                                        </tr> 
                                    </c:forEach>

                                </table>
                            </div>
                            <div id="table3">
                                <h2>Marriage Certificates</h2>
                                <table class="newtablecls" id="table">

                                    <tr>
                                        <th> Sr No. </th>
                                        <th> Husband Name</th>
                                        <th> Wife Name</th>
                                        <th> Marriage Address </th>
                                        <th> Marriage Date </th>
                                        <th> Action </th> 
                                        <th> View </th>
                                        <th> Status </th>
                                    </tr>


                                    <!--jstl tag-->
                                    <c:forEach var="comp" items="${Marriage}">
                                        <tr>

                                            <td></td>
                                            <td><c:out value="${comp.husband_Name}"/></td>
                                            <td><c:out value="${comp.wife_Name}"/></td>
                                            <td><c:out value="${comp.marriage_Address}"/></td>
                                            <td><c:out value="${comp.marriage_Date}"/></td>
                                            <td><input type="button" value="Accept" class="btn1" id="btn1" onclick="AcceptMarriageForm(this)" data-MarriageRregistration_Id="<c:out value="${comp.marriageRregistration_Id}"/>">
                                                <input type="button" value="Reject" class="btn1" id="btn2" onclick="RejectMarrigeForm(this)" data-MarriageRregistration_Id="<c:out value="${comp.marriageRregistration_Id}"/>">
                                            </td>
                                            <td><input type="button" value="View" class="btn1" id="btn3" onclick="ViewMarriage(this)" data-MarriageRregistration_Id="<c:out value="${comp.marriageRregistration_Id}"/>"></td>
                                            <td><c:out value="${comp.status}"/></td>
                                        </tr> 
                                    </c:forEach>

                                </table>
                            </div>
                            <div id="table4">
                                <h2>Ganapati Immersion Booking</h2>
                                <table class="newtablecls" id="table">
                                    <tr>
                                        <th> Sr No. </th>
                                        <th> Type_of_Registration</th>
                                        <th> Name </th>
                                        <th> Address </th>
                                        <th> Place </th>
                                        <th> Action </th> 
                                        <th> View </th>
                                        <th> Status </th>
                                    </tr>

                                    <c:forEach var="comp" items="${Gan}">
                                        <tr>

                                            <td></td>
                                            <td><c:out value="${comp.type_of_Registration}"/></td>
                                            <td><c:out value="${comp.name}"/></td>
                                            <td><c:out value="${comp.address}"/></td>
                                            <td><c:out value="${comp.place}"/></td>
                                            <td><input type="button" value="Accept" class="btn1" id="btn1" onclick="AcceptGanapatiForm(this)" data-Ganapati_Visarjan_Id="<c:out value="${comp.ganapati_Visarjan_Id}"/>">
                                                <input type="button" value="Reject" class="btn1" id="btn2" onclick="RejectGanapatiForm(this)" data-Ganapati_Visarjan_Id="<c:out value="${comp.ganapati_Visarjan_Id}"/>">
                                            </td>
                                            <td><input type="button" value="View" class="btn1" id="btn3" onclick="ViewGan(this)" data-Ganapati_Visarjan_Id="<c:out value="${comp.ganapati_Visarjan_Id}"/>"></td>
                                            <td><c:out value="${comp.status}"/></td>
                                        </tr> 
                                    </c:forEach>

                                </table>
                            </div>        
                        </div>

                    </div>
                    <div class="lower_part">


                    </div>

                </div>

            </div>

        </div>

        <script>
            function AcceptForm(e) {
                var Birth_Registration_Id = $(e).attr("data-Birth_Registration_Id");
//                alert(Birth_Registration_Id);
                $.post("../Admin_Birth_Status_Servlet",{Birth_registration_Id : Birth_Registration_Id});
//                window.location.href="User_List.jsp";
            }
            function RejectForm(e) {
                var Birth_Registration_Id = $(e).attr("data-Birth_Registration_Id");
                alert(Birth_Registration_Id);
                $.post("../Admin_Birth_Status_reject_Servlet",{Birth_registration_Id : Birth_Registration_Id});
//                window.location.href="User_List.jsp";
            }
            function AcceptGanapatiForm(e) {
                var ganapati_Visarjan_Id = $(e).attr("data-ganapati_Visarjan_Id");
//                alert(Birth_Registration_Id);
                $.post("../Admin_Gan_Status_Servlet",{ganapati_Visarjan_Id : ganapati_Visarjan_Id});
//                window.location.href="User_List.jsp";
            }
            function RejectGanapatiForm(e) {
                var ganapati_Visarjan_Id = $(e).attr("data-ganapati_Visarjan_Id");
//                alert(Birth_Registration_Id);
                $.post("../Admin_Gan_Status_reject_Servlet",{ganapati_Visarjan_Id : ganapati_Visarjan_Id});
//                window.location.href="User_List.jsp";
            }
            function AcceptDeathForm(e) {
                var Death_Registration_Id = $(e).attr("data-Death_Registration_Id");
//                alert(Birth_Registration_Id);
                $.post("../Admin_Death_Status_Servlet",{Death_Registration_Id : Death_Registration_Id});
//                window.location.href="User_List.jsp";
            }
            function RejectDeathForm(e) {
                var Death_Registration_Id = $(e).attr("data-Death_Registration_Id");
//                alert(Birth_Registration_Id);
                $.post("../Admin_Death_Status_reject_Servlet",{Death_Registration_Id : Death_Registration_Id});
//                window.location.href="User_List.jsp";
            }
            function AcceptMarriageForm(e) {
                var MarriageRregistration_Id = $(e).attr("data-MarriageRregistration_Id");
//                alert(Birth_Registration_Id);
                $.post("../Admin_Marriage_Status_Servlet",{MarriageRregistration_Id : MarriageRregistration_Id});
//                window.location.href="User_List.jsp";
            }
            function RejectMarrigeForm(e) {
                var MarriageRregistration_Id = $(e).attr("data-MarriageRregistration_Id");
//                alert(Birth_Registration_Id);
                $.post("../Admin_Marriage_Status_reject_Servlet",{MarriageRregistration_Id : MarriageRregistration_Id});
//                window.location.href="User_List.jsp";
            }
            
            function ViewBirth(e) {

                var Birth_Registration_Id = $(e).attr("data-Birth_Registration_Id");                
                jsarray = [Birth_Registration_Id];
                sessionStorage.setItem("jsArray", JSON.stringify(jsarray));
                window.location.href = "viewForm.jsp";
            }
            function ViewDeath(e) {

                var Death_Registration_Id = $(e).attr("data-Death_Registration_Id");                
                jsarray = [Death_Registration_Id];
                sessionStorage.setItem("jsArray", JSON.stringify(jsarray));
                window.location.href = "viewDeathForm.jsp";
            }
            function ViewMarriage(e) {

                var MarriageRregistration_Id = $(e).attr("data-MarriageRregistration_Id");                
                jsarray = [MarriageRregistration_Id];
                sessionStorage.setItem("jsArray", JSON.stringify(jsarray));
                window.location.href = "viewMarriageForm.jsp";
            }
            function ViewGan(e) {

                var Ganapati_Visarjan_Id = $(e).attr("data-Ganapati_Visarjan_Id");                
                jsarray = [Ganapati_Visarjan_Id];
                sessionStorage.setItem("jsArray", JSON.stringify(jsarray));
                window.location.href = "viewGanapatiForm.jsp";
            }



            function show(nr) {
                document.getElementById("table1").style.display = "none";
                document.getElementById("table2").style.display = "none";
                document.getElementById("table3").style.display = "none";
                document.getElementById("table4").style.display = "none";
                document.getElementById("table" + nr).style.display = "block";
            }
        </script>
    </body>
</html>
