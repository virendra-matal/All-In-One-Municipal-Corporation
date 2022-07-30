

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Admin Marriage form view</title>
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
                                    <td colspan="3" style="text-align: center; background: #ccccff;"><b>Marriage Certificate</b></td>
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>Marriage Details</b></td>
                                </tr>

                                <tr>
                                    <td style="width: 450px;" >Marriage Date : <span class="span_left_space" id="Mdate" > </span></td>
                                    <td style="width: 450px;" >	Ward : <span class="span_left_space" id="ward" > </span></td>
                                    <td style="width: 450px;" >	Place of Marriage : <span class="span_left_space" id="Marriage_place" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="3">House No. and Street road: <span class="span_left_space" id="Maddress" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >City: <span class="span_left_space" id="Mcity" > </span></td>
                                    <td style="width: 450px;" colspan="2">Country: <span class="span_left_space" id="Mcountry" > </span></td>
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>HUSBAND DETAILS</b></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Name of Husband: <span class="span_left_space" id="husband_name" > </span></td>
                                    <td style="width: 450px;" >Religion by the Birth: <span class="span_left_space" id="hus_religion_by_birth" > </span></td>
                                    <td style="width: 450px;" >Religion by the Adoption: <span class="span_left_space" id="hus_religion_by_adopt" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="2">Date of Birth: <span class="span_left_space" id="DOB" > </span></td>
                                    <td style="width: 450px;" >Age: <span class="span_left_space" id="Husband_Age" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Status at the time of marriage: <span class="span_left_space" id="status_husband" > </span></td>
                                    <td style="width: 450px;" colspan="2">Occupation: <span class="span_left_space" id="hus_occupation" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Mobile Number : <span class="span_left_space" id="hus_number" > </span></td>
                                    <td style="width: 450px;" colspan="2">	E-mail address: <span class="span_left_space" id="hus_email" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="3">House No. and Street road : <span class="span_left_space" id="hus_address" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >City: <span class="span_left_space" id="hus_city" > </span></td>
                                    <td style="width: 450px;" colspan="2">Country: <span class="span_left_space" id="hus_country" > </span></td>
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>WIFE DETAILS</b></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Name of Wife: <span class="span_left_space" id="wife_name" > </span></td>
                                    <td style="width: 450px;" >Religion by the Birth: <span class="span_left_space" id="wife_religion_by_birth" > </span></td>
                                    <td style="width: 450px;" >Religion by the Adoption: <span class="span_left_space" id="wife_religion_by_adopt" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="2">Date of Birth: <span class="span_left_space" id="wife_DOB" > </span></td>
                                    <td style="width: 450px;" >Age: <span class="span_left_space" id="wife_Age" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Status at the time of marriage: <span class="span_left_space" id="status_wife" > </span></td>
                                    <td style="width: 450px;" colspan="2">Occupation: <span class="span_left_space" id="wife_occupation" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Mobile Number : <span class="span_left_space" id="wife_mobile_number" > </span></td>
                                    <td style="width: 450px;" colspan="2">	E-mail address: <span class="span_left_space" id="wife_email" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="3">House No. and Street road:  <span class="span_left_space" id="wife_address" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >City: <span class="span_left_space" id="wife_city" > </span></td>
                                    <td style="width: 450px;" colspan="2">Country: <span class="span_left_space" id="wife_country" > </span></td>
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>WITNESS DETAILS</b></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="2">Name of Witness: <span class="span_left_space" id="witness_name" > </span></td>
                                    <td style="width: 650px;" >Relation (if any) with the married couple:<span class="span_left_space" id="witness_relation" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Occupation: <span class="span_left_space" id="witness_occupation" > </span></td>
                                    <td style="width: 450px;" >Mobile Number : <span class="span_left_space" id="witness_number" > </span></td>
                                    <td style="width: 450px;" >	E-mail address: <span class="span_left_space" id="witness_email" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="3">House No. and Street road:  <span class="span_left_space" id="witness_address" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >City :<span class="span_left_space" id="witness_city" > </span></td>
                                    <td style="width: 450px;" colspan="2">Country: <span class="span_left_space" id="witness_country" > </span></td>
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>PRIEST DETAILS</b></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="2">Name of Priest: <span class="span_left_space" id="Priest_name" > </span></td>
                                    <td style="width: 450px;" >Religion : <span class="span_left_space" id="Priest_religion" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="2">Date of Birth: <span class="span_left_space" id="Priest_DOB" > </span></td>
                                    <td style="width: 450px;" >Age: <span class="span_left_space" id="Priest_Age" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >Occupation: <span class="span_left_space" id="Priest_occupation" > </span></td>
                                    <td style="width: 450px;" >Mobile Number : <span class="span_left_space" id="Priest_number" > </span></td>
                                    <td style="width: 450px;" >	E-mail address <span class="span_left_space" id="Priest_email" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" colspan="3">House No. and Street road:  <span class="span_left_space" id="Priest_address" > </span></td>
                                </tr>
                                <tr>
                                    <td style="width: 450px;" >City: <span class="span_left_space" id="Priest_city" > </span></td>
                                    <td style="width: 450px;" colspan="2">Country: <span class="span_left_space" id="Priest_country" > </span></td>
                                </tr>
                                <tr>





                                <tr>
                                    <td style="height: 90px;" colspan="3">Attached Documents:</td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>DOCUMENT UPLOAD BY BRIDE </b></td>
                                </tr>
                                <tr>
                                    <td  colspan="3">Bride Birth Certificate: <span id="doc1" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td  colspan="3">Bride Aadhar Card: <span id="doc2" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td  colspan="3">Passport size photographs of Bride:  <span id="doc3" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>DOCUMENT UPLOAD BY BRIDEGROOM</b></td>
                                </tr>
                                <tr>
                                    <td  colspan="3">Bridegroom Birth Certificate: <span id="doc4" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td  colspan="3">	Bridegroom Aadhar Card: <span id="doc5" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td  colspan="3">Passport size photographs of Bridegroom : <span id="doc6" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>DOCUMENT UPLOAD BY WITNESS </b></td>
                                </tr>
                                <tr>
                                    <td  colspan="3">Witness Aadhar Card: <span id="doc7" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td  colspan="3">	Witness Election Card: <span id="doc8" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>DOCUMENT UPLOAD BY APPLICANT</b></td>
                                </tr>
                                <tr>
                                    <td  colspan="3">Copy of Wedding card: <span id="doc9" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td colspan="3" style="text-align: center;"><b>DOCUMENT UPLOAD BY PRIEST</b></td>
                                </tr>
                                <tr>
                                    <td  colspan="3">Signature of Priest: <span id="doc10" class="span_left_space"> </span></td>
                                    <!--<td></td>-->
                                </tr>
                                <tr>
                                    <td  colspan="3">Signature of applicant: <span id="doc11" class="span_left_space"> </span></td>
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
                var MarriageRregistration_Id = jsarray[0];
                $(document).ready(
                        callServlet()
                        );
                function callServlet() {
                    $.post("../Marriage_Cert_View_Servlet", {MarriageRregistration_Id: MarriageRregistration_Id}, function (data) {
                        for (var i = 0; i < data.length; i++) {
                            
                            $("#Mdate").text(data[i].Marriage_Date);
                            $("#ward").text(data[i].Ward);
                            $("#Marriage_place").text(data[i].Marriage_Place);
                            $("#Maddress").text(data[i].Marriage_Address);
                            $("#Mcity").text(data[i].Marriage_City);
                            $("#Mcountry").text(data[i].Marriage_Country);
                            $("#husband_name").text(data[i].Husband_Name);
                            $("#hus_religion_by_birth").text(data[i].Husband_Religion_by_Birth);
                            $("#hus_religion_by_adopt").text(data[i].Husband_Religion_by_Adoption);
                            $("#DOB").text(data[i].Husband_Date_of_Birth);
                            $("#Husband_Age").text(data[i].Husband_Age);
                            $("#status_husband").text(data[i].Husband_Status_at_marriage);
                            $("#hus_occupation").text(data[i].Husband_Occupation);
                            $("#hus_number").text(data[i].Husband_Mobile_Number);
                            $("#hus_email").text(data[i].Husband_Email);
                            $("#hus_address").text(data[i].Husband_Address);
                            $("#hus_city").text(data[i].Husband_City);
                            $("#hus_country").text(data[i].Husband_Country);
                            $("#wife_name").text(data[i].Wife_Name);
                            $("#wife_religion_by_birth").text(data[i].Wife_Religion_by_Birth);
                            $("#wife_religion_by_adopt").text(data[i].Wife_Religion_by_Adoption);
                            $("#wife_DOB").text(data[i].Wife_Date_of_Birth);
                            $("#wife_Age").text(data[i].Wife_Age);
                            $("#status_wife").text(data[i].Wife_Status_at_marriage);
                            $("#wife_occupation").text(data[i].Wife_Occupation);
                            $("#wife_mobile_number").text(data[i].Wife_Mobile_Number);
                            $("#wife_email").text(data[i].Wife_Email);
                            $("#wife_address").text(data[i].Wife_Address);
                            $("#wife_city").text(data[i].Wife_City);
                            $("#wife_country").text(data[i].Wife_Country);
                            $("#witness_name").text(data[i].Witness_Name);
                            $("#witness_relation").text(data[i].Witness_Relation_With_Couple);
                            $("#witness_occupation").text(data[i].Witness_Occupation);
                            $("#witness_number").text(data[i].Witness_Mobile_Number);
                            $("#witness_email").text(data[i].Witness_Email);
                            $("#witness_address").text(data[i].Witness_Address);
                            $("#witness_city").text(data[i].Witness_City);
                            $("#witness_country").text(data[i].Witness_Country);
                            $("#Priest_name").text(data[i].Priest_Name);
                            $("#Priest_religion").text(data[i].Priest_Religion);
                            $("#Priest_DOB").text(data[i].Priest_Date_of_Birth);
                            $("#Priest_Age").text(data[i].Priest_Age);
                            $("#Priest_occupation").text(data[i].Priest_Occupation);
                            $("#Priest_number").text(data[i].Priest_Mobile_Number);
                            $("#Priest_email").text(data[i].Priest_Email);
                            $("#Priest_address").text(data[i].Priest_Address);
                            $("#Priest_city").text(data[i].Priest_City);
                            $("#Priest_country").text(data[i].Priest_Country);
                            $("#doc1").text(data[i].Bride_Birth_Certificate);
                            $("#doc2").text(data[i].Bride_Aadhar_Card);
                            $("#doc3").text(data[i].Photographs_Bride);
                            $("#doc4").text(data[i].Bridegroom_Birth_Certificate);
                            $("#doc5").text(data[i].Bridegroom_Aadhar_Card);
                            $("#doc6").text(data[i].Photographs_Bridegroom);
                            $("#doc7").text(data[i].Witness_Aadhar_Card);
                            $("#doc8").text(data[i].Witness_Election_Card);
                            $("#doc9").text(data[i].Wedding_card);
                            $("#doc10").text(data[i].Signature_Priest);
                            $("#doc11").text(data[i].Signature_Applicant);

                        }

                    });
                }
            </script>
    </body>
</html>



