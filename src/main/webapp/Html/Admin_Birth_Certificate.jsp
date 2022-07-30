<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Admin Birth Certificate</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/Admin_Birth_Certificate.css" rel="stylesheet" type="text/css"/>
        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>-->
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
                    <li><a href="Admin_Birth_Certificate.jsp"><i class="fa fa-commenting"></i>Online Certificate </a></li>
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
                    <table>
                        <tr>
                            <td class="link">
                                <a href="#" onclick='show(1);'>Birth Certificates</a>
                                <br />
                                <br />
                                <br />
                                <br />
                                <a href="new.jsp">new</a>
                                <br />
                                <br />
                                <br />
                                <br />
                                <a href="#" onclick='show(2);'>Death Certificates</a>
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <a href="#" onclick='show(3);'>Marriage Certificates</a>
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <a href="#" onclick='show(4);'>Ganapati Immersion Booking</a>
                                
                            </td>
                            
                            <td class="content">
                                <div id="table1"> 
                                    
                                    <table class="newtablecls" id="table">

                                        <tr>
                                            <th> Sr No. </th>
                                            
                                            <th> Name Of Applicant</th>
                                            <th> Address </th>
                                            <th> Date </th>
                                            <th> Action </th> 
                                            <th> Download </th>
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
                                                <td><input type="button" value="Download" class="btn1" id="btn3" onclick="DownloadForm(this)" data-Birth_Registration_Id="<c:out value="${comp.birth_Registration_Id}"/>"></td>
                                            </tr> 
                                        </c:forEach>

                                    </table>
                                </div>
                                <div id="table2">
                                  
                                    <table class="newtablecls" id="table">

                                        <tr>
                                            <th> Sr No. </th>
                                            <th> Name Of Applicant</th>
                                            <th> Address </th>
                                            <th> Date </th>
                                            <th> Action </th> 
                                            <th> Download </th>
                                        </tr>
                                        <c:forEach var="comp" items="${Death}">
                                            <tr>
                                                <td></td>
                                                <td><c:out value="${comp.applicant_Name}"/></td>
                                                <td><c:out value="${comp.address}"/></td>
                                                <td><c:out value="${comp.date}"/></td>
                                                <td><input type="button" value="Accept" class="btn1" id="btn1" onclick="AcceptForm(this)" data-Death_Registration_Id="<c:out value="${comp.death_Registration_Id}"/>">
                                                    <input type="button" value="Reject" class="btn1" id="btn2" onclick="RejectForm(this)" data-Death_Registration_Id="<c:out value="${comp.death_Registration_Id}"/>">
                                                </td>
                                                <td><input type="button" value="Download" class="btn1" id="btn3" onclick="DownloadForm(this)" data-Death_Registration_Id="<c:out value="${comp.death_Registration_Id}"/>"></td>

                                            </tr> 
                                        </c:forEach>

                                    </table>
                                </div>
                                <div id="table3">
                                   
                                    <table class="newtablecls" id="table">

                                        <tr>
                                            <th> Sr No. </th>
                                            <th> Husband Name</th>
                                            <th> Wife Name</th>
                                            <th> Marriage Address </th>
                                            <th> Marriage Date </th>
                                            <th> Action </th> 
                                            <th> Download </th>
                                        </tr>


                                        <!--jstl tag-->
                                        <c:forEach var="comp" items="${Marriage}">
                                            <tr>

                                                <td></td>
                                                <td><c:out value="${comp.husband_Name}"/></td>
                                                <td><c:out value="${comp.wife_Name}"/></td>
                                                <td><c:out value="${comp.marriage_Address}"/></td>
                                                <td><c:out value="${comp.marriage_Date}"/></td>
                                                <td><input type="button" value="Accept" class="btn1" id="btn1" onclick="AcceptForm(this)" data-MarriageRregistration_Id="<c:out value="${comp.marriageRregistration_Id}"/>">
                                                    <input type="button" value="Reject" class="btn1" id="btn2" onclick="RejectForm(this)" data-MarriageRregistration_Id="<c:out value="${comp.marriageRregistration_Id}"/>">
                                                </td>
                                                <td><input type="button" value="Download" class="btn1" id="btn3" onclick="DownloadForm(this)" data-MarriageRregistration_Id="<c:out value="${comp.marriageRregistration_Id}"/>"></td>

                                            </tr> 
                                        </c:forEach>

                                    </table>
                                </div>
                                <div id="table4">
                                 
                                    <table class="newtablecls" id="table">
                                        <tr>
                                            <th> Sr No. </th>
                                            <th> Type_of_Registration</th>
                                            <th> Name </th>
                                            <th> Address </th>
                                            <th> Place </th>
                                            <th> Action </th> 
                                            <th> Download </th>
                                        </tr>

                                        <c:forEach var="comp" items="${Gan}">
                                            <tr>

                                                <td></td>
                                                <td><c:out value="${comp.type_of_Registration}"/></td>
                                                <td><c:out value="${comp.name}"/></td>
                                                <td><c:out value="${comp.address}"/></td>
                                                <td><c:out value="${comp.place}"/></td>
                                                <td><input type="button" value="Accept" class="btn1" id="btn1" onclick="AcceptForm(this)" data-Ganapati_Visarjan_Id="<c:out value="${comp.ganapati_Visarjan_Id}"/>">
                                                    <input type="button" value="Reject" class="btn1" id="btn2" onclick="RejectForm(this)" data-Ganapati_Visarjan_Id="<c:out value="${comp.ganapati_Visarjan_Id}"/>">
                                                </td>
                                                <td><input type="button" value="Download" class="btn1" id="btn3" onclick="DownloadForm(this)" data-Ganapati_Visarjan_Id="<c:out value="${comp.ganapati_Visarjan_Id}"/>"></td>

                                            </tr> 
                                        </c:forEach>

                                    </table>
                                </div>        
                            </td>
                        </tr>
                    </table>

                    <dir class="lower_part">
                        <!--hello-->

                    </dir>
                </div>
            </div>
        </div>
        <script>
            function AcceptForm(e) {
                var Birth_Registration_Id = $(e).attr("data-Birth_Registration_Id");
                alert(Birth_Registration_Id);

//                window.location.href="User_List.jsp";
            }


//            document.getElementById("birth").addEventListener("click", visibleTable);
//            function visibleTable(table_no) {
////                var table_id = document.querySelector("#show_birth");
//                var divCSS = window.getComputedStyle(table_id); // element CSS 
//                var display = divCSS.getPropertyValue('display'); // property
//                var click = document.getElementById("birth");
//                if (display == "none") {
//                    table_id.setAttribute("style", "display: block;");
//                } else if (display == "block") {
//                    table_id.setAttribute("style", "display: none;");
//                }
//                
//            }
//            function visibleTable(table_no) {
////                alert(table_no);
////                var id= document.getElementById("table" + table_no);
////                var divCSS = window.getComputedStyle(id); // element CSS 
////                var display = divCSS.getPropertyValue('display'); // property
//                document.getElementById("table1").style.display = "none";
//                document.getElementById("table2").style.display = "none";
//                document.getElementById("table3").style.display = "none";
//                document.getElementById("table4").style.display = "none";
//                document.getElementById("table" + table_no).style.display = "block";
//               
////                display.setAttribute("style", "display: block;");
//            }

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
