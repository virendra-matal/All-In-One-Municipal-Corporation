<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Birth Certificate</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/Birth_certificate.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="screen">

            <div class="sidebar">
                <h1>City Services</h1>
                <ul>
                    <li> <a href="Home.jsp"><i class="fa fa-home"> </i> Home </a></li>
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
                        <h2>Birth Certificate </h2><br>
                        <a href="Home.jsp"><span>Home</span></a>
                        <meta property="position" content="1">
                        >
                        <a href="Birth_Certificate.jsp"><span>Birth Certificate</span></a>

                    </div>
                </div>
                <div class="solid_waste">

                    <!--<h1></h1>-->
                    <form action="../Birth_Registration_Servlet" method="post" onsubmit="return BirthValidation()">
                        <div class="c_heading"> Birth Certificate Registration </div>
                        <table>


                            <tr class="extra_space"></tr>


                            <!--Date-->
                            <tr> 
                                <td class="td">
                                    Date
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="date" name="calender" id="cal" >
                                </td>

                            </tr>


                            <tr class="extra_space"></tr>



                            <!--Enter Address-->

                            <tr>
                                <td class="td">Complete Address
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td >
                                    <input type="text" id="address" name="address" autocomplete="off" >
                                </td>

                            </tr>



                            <tr class="extra_space"></tr>



                            <!--Name of parents-->
                            <tr>
                                <td class="td">
                                    Full Name Of Parents
                                </td>
                                <!--                                <td>:</td>-->
                            </tr>
                            <tr>
                                <td class="td"> Mother 
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="mother_name" name="mother_name" autocomplete="off" >
                                </td>
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center"> Father 
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="father_name" name="father_name"  autocomplete="off" >
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>


                            <!--Residential place of parent-->
                            <tr>
                                <td class="td">
                                    Residential place of parent at the time of Birth as furnished for Birth Registration
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td >
                                    <select name="birth_place" id="place"  class="c_type">
                                        <option> select </option>
                                        <option> Mumbai </option>
                                        <option> Pune </option>
                                        <option> Nashik </option>
                                        <option> Rajasthan </option>
                                        <option> Ratnagiri </option>
                                        <option> Satara </option>
                                    </select> 
                                </td>

                            </tr>


                            <tr class="extra_space"></tr>


                            <!--name of the hospital-->
                            <tr>
                                <td class="td">
                                    If Birth take place in the hospital
                                </td>
                            </tr>
                            <tr> 
                                <td class="td"> Name of the Hospital
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text"  name="hospital_name" id="hospital_name" autocomplete="off" >
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>


                            <!--date and sex of the child-->
                            <tr>
                                <td class="td"> Date of Birth 
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="date" name="date_of_birth" id="DOB" >
                                </td>
                                <td class="td"> </td>
                                <td class="td2"> </td>

                                <td class="td" style="text-align: center"> Sex 
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>

                                <td>
                                    <select name="select_sex" id="sex" class="c_type">
                                        <option> Select </option>
                                        <option> Male </option>
                                        <option> Female </option>
                                        <option> Other </option>
                                    </select>
                                </td>

                            </tr>


                            <tr class="extra_space"></tr>


                            <!--name of the child-->
                            <tr>
                                <td class="td">Full Name of Child 
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="child_name" name="child_name"  autocomplete="off" >
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>


                            <!--name of applicant  and relation-->
                            <tr>
                                <td class="td">Name of the applicant 
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="applicant_name" name="applicant_name"  autocomplete="off" >
                                </td>


                                <td class="td"> </td>
                                <td class="td2"> </td>

                                <td class="td" style="text-align: center"> Relation with the child
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="applicant_relation_with_child" id="relation" class="c_type">
                                        <option> Select </option>
                                        <option> Father </option>
                                        <option> Mother </option>
                                        <option> GrandFather </option>
                                        <option> GrandMother </option>
                                        <option> Uncle </option>
                                    </select> 
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>


                            <!--upload images-->
                            <tr>
                                <td class="td">
                                    Upload Documents
                                    <span class=" span"></span>
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>



                            <tr> 
                                <td class="td">
                                    Identity proof of parent for verification(Eg. Adhar card, Pan card, ect...)
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile1" name="uploadfile1" >
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center">
                                    Parent's marriage certificate
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile2" name="uploadfile2" >
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                            </tr>


                            <tr class="extra_space"></tr>



                            <tr> 
                                <td class="td">
                                    Letter from the hospital-proof of birth of the child issued by the Hospital
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="file" id="uploadfile3" name="uploadfile3" >
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center">
                                    Parent's Birth  certificate
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile4" name="uploadfile4" >
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                            </tr>


                            <tr class="extra_space"></tr>



                            <tr>
                                <td class="td">
                                </td>
                                <td>  </td>
                                <td class="td1"> </td>
                                <td > </td>

                                <td class="td"> </td>
                                <td class="td2"> </td>

                                <td class="td" style="text-align: center"> Signature
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="file" id="uploadfile5" name="uploadfile5" >
                                </td>
                            </tr>
                        </table>

                        <input type="submit" name="BtnSubmit" value="Submit" id="BtnSubmit" class="button">
                        <div class="space_empty"></div>
                    </form> 
                </div>
                <div class="lower_part">

                </div>
            </div>
        </div>
        <script>
            function BirthValidation() {
                //                event.preventDefault();
                valid = true;
                var regName = /^[a-zA-Z]+ [a-zA-Z]+$/;
                var child_name_pattern = /^[a-zA-Z]+[a-zA-Z]+ [a-zA-Z]+$/;
                var Email_pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                var phone_pattern = /^\d{10}$/;
//                var address_pattern = /^[a-zA-Z0-9\s,-]{10,}$/;
                var cal = document.getElementById('cal').value.trim();
                var address = document.getElementById('address').value.trim();
                var mother_name = document.getElementById('mother_name').value.trim();
                var father_name = document.getElementById('father_name').value.trim();
                var place = document.getElementById('place').value.trim();
                var placeIndex = document.getElementById('place').selectedIndex;
                var hospital_name = document.getElementById('hospital_name').value.trim();
                var DOB = document.getElementById('DOB').value.trim();
                var sex = document.getElementById('sex').value.trim();
                var sexIndex = document.getElementById('sex').selectedIndex;
                var child_name = document.getElementById('child_name').value.trim();
                var applicant_name = document.getElementById('applicant_name').value.trim();
                var relation = document.getElementById('relation').value.trim();
                var relationIndex = document.getElementById('relation').selectedIndex;
//                var phone = document.getElementById('phone').value.trim();
                var image = document.getElementById("uploadfile1").value;
                var image2 = document.getElementById("uploadfile2").value;
                var image3 = document.getElementById("uploadfile3").value;
                var image4 = document.getElementById("uploadfile4").value;
                var image5 = document.getElementById("uploadfile5").value;

//                   var ward = document.getElementById('ward').value.trim();
//                var wardIndex = document.getElementById('ward').selectedIndex;

//                   var time = document.getElementById('time').value.trim();
//                var timeIndex = document.getElementById('time').selectedIndex;

                if (cal === "" || cal === null) {
                    alert("Please fill the Date.");
                    valid = false;
                }

                if (address === "" || address === null) {
                    alert("Please enter complete Address.");
                    valid = false;
                } 
//                else if (!address_pattern.test(address)) {
//                    alert("You have entered an invalid Address!");
//                    valid = false;
//                }

                if (mother_name === "" || mother_name === null) {
                    alert("mother_name is required.");
                    valid = false;
                } else if (mother_name.length > 30) {
                    alert("mother_name should be up to 30 characters.");
                    valid = false;
                } else if (!regName.test(mother_name)) {
                    alert('Invalid mother_name, Enter FirstName then LastName.');
                    valid = false;
                }
                if (father_name === "" || father_name === null) {
                    alert("father_name is required.");
                    valid = false;
                } else if (father_name.length > 30) {
                    alert("father_name should be up to 30 characters.");
                    valid = false;
                } else if (!regName.test(father_name)) {
                    alert('Invalid father_name, Enter FirstName then LastName.');
                    valid = false;
                }

//                if (phone === "" || phone === null) {
//                    alert("number is required.");
//                    valid = false;
//                } else if (!phone_pattern.test(phone))
//                {
//                    alert("Please enter 10 digits only.");
//                    valid = false;
//                }


//
//                if (wardIndex === 0) {
//                    alert("Plaeaase select the Ward.");
//                    valid = false;
//                }
                if (placeIndex === 0) {
                    alert("Please select the Place.");
                    valid = false;
                }
                
                if (hospital_name === "" || hospital_name === null) {
                    alert("hospital_name is required.");
                    valid = false;
                }
                
                if (DOB === "" || DOB === null) {
                    alert("Please fill the Date of Birth.");
                    valid = false;
                }
                
                 if (sexIndex === 0) {
                    alert("Please select the Sex.");
                    valid = false;
                }
                
                
                if (child_name === "" || child_name === null) {
                    alert("child_name is required.");
                    valid = false;
                } else if (child_name.length > 30) {
                    alert("child_name should be up to 30 characters.");
                    valid = false;
                } else if (!regName.test(child_name)) {
                    alert('Invalid child_name, Enter FirstName then LastName.');
                    valid = false;
                }
                
                if (applicant_name === "" || applicant_name === null) {
                    alert("applicant_name is required.");
                    valid = false;
                } else if (mother_name.length > 30) {
                    alert("applicant_name should be up to 30 characters.");
                    valid = false;
                } else if (!regName.test(mother_name)) {
                    alert('Invalid applicant_name, Enter FirstName then LastName.');
                    valid = false;
                }
                
                if (relationIndex === 0) {
                    alert("Please select the Place.");
                    valid = false;
                }

                if (image === "" || image === null) {
                    alert("Please upload the Identity proof of parent.");
                    valid = false;
                }
                if (image2 === "" || image2 === null) {
                    alert("Please upload the Parent's marriage certificate.");
                    valid = false;
                }
                if (image3 === "" || image3 === null) {
                    alert("Please upload the Letter from the hospital-proof of birth of the child issued by the Hospital.");
                    valid = false;
                }
                if (image4 === "" || image4 === null) {
                    alert("Please upload the Parent's Birth  certificate.");
                    valid = false;
                }
                if (image5 === "" || image5 === null) {
                    alert("Please upload the Signature.");
                    valid = false;
                }
                alert("Are you sure to book your Slot.");
                return valid;

            }

        </script>
    </body>
</html>
