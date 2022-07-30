

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Admin Death Certificate view</title>
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
                                    <td colspan="3" style="text-align: center; background: #ccccff;"><b><%=Admin_MCorp_Name%></b></td>
                                </tr>

                                <tr>
                                    <td colspan="3" style="text-align: center; background: #ccccff;"><b>Death Certificate</b></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="3">Date:  <span class="span_left_space" id="date" > </span></td>
                                    <!--                                    <td></td>
                                                                        <td></td>-->
                                </tr>
                                <tr>
                                    <td colspan="3">Address:<span id="address" class="span_left_space"> </span> </td>
                                </tr>
                                <tr>
                                    <td> Name Of Deceased :<span id="mother_name" class="span_left_space"> </span></td>
                                    <td colspan="2"><span id="father_name" class="span_left_space"> </span></td>
                                </tr>
                                <tr>
                                    <td colspan="3">Residential place of Parent at the time of Death as furnished for Death Certificate:<span id="residential_place" class="span_left_space"> </span></td>
                                </tr>
                                <tr>
                                    <td>Hospital Name:<span id="hospital_name" class="span_left_space"> </span></td>
                                    <td style="width: 300px;">Date Of Birth:<span id="DOB" class="span_left_space" > </span></td>
                                    <td>Sex:<span id="sex" class="span_left_space"> </span></td>
                                </tr>
                                <tr>
                                    <td>Name of Applicant:<span id="applicant_name" class="span_left_space"> </span></td>
                                    <td  colspan="2">Relation with Deceased person:<span id="ralation" class="span_left_space"> </span></td>
                                </tr>
                                <tr>
                                    <td style="height: 90px;" colspan="3">Attached Documents:</td>
                                    <!--<td></td>-->
                                </tr>
                                  <tr>
                                    <td  colspan="3"><span id="doc1" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                  <tr>
                                    <td  colspan="3"><span id="doc2" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                  <tr>
                                    <td  colspan="3"><span id="doc3" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                  <tr>
                                    <td  colspan="3"><span id="doc4" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                  <tr>
                                    <td  colspan="3"><span id="doc5" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                  <tr>
                                    <td  colspan="3"><span id="doc6" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                  <tr>
                                    <td  colspan="3"><span id="doc7" class="span_left_space"> </span></td>
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
                var Death_Registration_Id = jsarray[0];
//                alert(" Death_Registration_Id  " + Death_Registration_Id);

                $(document).ready(
                        callServlet()
                        );
                function callServlet() {
//                    alert("hii" + Death_Registration_Id);
                    $.post("../Death_Cert_View_Servlet", {Death_Registration_Id : Death_Registration_Id}, function (data) {
                        for (var i = 0; i < data.length; i++) {
                            $("#date").text(data[i].Date);
                            $("#address").text(data[i].Address);
                            $("#mother_name").text(data[i].Name_Of_Deceased);
//                            $("#father_name").text(data[i].Father_Name);
                            $("#residential_place").text(data[i].Residential_Place);
                            $("#hospital_name").text(data[i].Hospital_Name);
                            $("#DOB").text(data[i].Date_Of_Death);
                            $("#sex").text(data[i].Sex);
//                            $("#child_name").text(data[i].Child_Name);
                            $("#applicant_name").text(data[i].Applicant_Name);
                            $("#ralation").text(data[i].Relation_with_Person);
                            $("#doc1").text(data[i].Id_proof);
                            $("#doc2").text(data[i].Birth_Certificate_Of_Deceased);
                            $("#doc3").text(data[i].Medical_certificate);
                            $("#doc4").text(data[i].Adhar_Card_Of_Deceased);
                            $("#doc5").text(data[i].Copy_of_Ration_Card);
                            $("#doc6").text(data[i].Residensial_proof);
                            $("#doc7").text(data[i].Signature);

                        }

                    });
//                        $("#response").val("");
                }




//                function show(nr) {
//                    document.getElementById("table1").style.display = "none";
//                    document.getElementById("table2").style.display = "none";
//                    document.getElementById("table3").style.display = "none";
//                    document.getElementById("table4").style.display = "none";
//                    document.getElementById("table" + nr).style.display = "block";
//                }
            </script>
    </body>
</html>



