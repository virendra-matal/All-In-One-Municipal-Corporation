<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Death Certificate</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/Death_Certificate.css" rel="stylesheet" type="text/css"/>
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
                        <h2>Death Certificate </h2><br>
                        <a href="Home.jsp"><span>Home</span></a>
                        <meta property="position" content="1">
                        >
                        <a href="Death_Certificate.jsp"><span>Death Certificate</span></a>

                    </div>
                </div>
                <div class="solid_waste">

                    <form action="../Death_Registration_Servlet" method="post">
                        <div class="c_heading"> Death Certificate Registration </div>
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
                                    <input type="date" name="calender" required="">
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
                                    <input type="text" id="address" name="address" autocomplete="off" required>
                                </td>

                            </tr>



                            <tr class="extra_space"></tr>



                            <!--Name of parents-->
                            <tr>
                                <td class="td">
                                    Full Name Of the Deceased
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="deceased_name" name="deceased_name" minlength="10" autocomplete="off" required>
                                </td>

                            </tr>


                            <tr class="extra_space"></tr>


                            <!--Residential place-->
                            <tr>
                                <td class="td">
                                    His or her residential place at the time of Death as furnished at the ceremony for Registration of Death
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td >
                                    <select name="death_place" id="c_type" required="">
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
                                    If Death took place in the hospital
                                </td>
                            </tr>
                            <tr> 
                                <td class="td"> Name of the Hospital
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" maxlength="30" id="hospital_name"  name="hospital_name" autocomplete="off" requied>
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>


                            <!--date and sex of the child-->
                            <tr>
                                <td class="td"> Date of Death 
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="date" name="date_of_death" required="">
                                </td>
                                <td class="td"> </td>
                                <td class="td2"> </td>

                                <td class="td" style="text-align: center"> Sex 
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>

                                <td>
                                    <select name="select_sex" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Male </option>
                                        <option> Female </option>
                                        <option> Other </option>
                                    </select>
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
                                    <input type="text" id="applicant_name" name="applicant_name" minlength="10" autocomplete="off" required>
                                </td>

                                <td class="td"> </td>
                                <td class="td2"> </td>

                                <td class="td" style="text-align: center"> Relation with the person
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="applicant_relation_with_person" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Son </option>
                                        <option> Daughter </option>
                                        <option> Daughter-in-law </option>
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
                                    Identity proof of Applicant(Eg. Adhar card, Pan card, ect...)
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile1" name="uploadfile1" required="">
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center">
                                    Birth certificate of the deceased
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile2" name="uploadfile2" required="">
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                            </tr>


                            <tr class="extra_space"></tr>



                            <tr> 
                                <td class="td">
                                    Medical certificate of caused of death, If required
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="file" id="uploadfile3" name="uploadfile3">
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center">
                                    Adhar card of deceased 
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile4" name="uploadfile4" required="">
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                            </tr>


                            <tr class="extra_space"></tr>



                            <tr> 
                                <td class="td">
                                    Copy of Ration card
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="file" id="uploadfile5" name="uploadfile5">
                                </td>
                                <!--                                <td>
                                                                    <input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" > 
                                                                </td>-->
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center">
                                    Residential proof(if available)
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile6" name="uploadfile6">
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

                                <td class="td" style="text-align: center"> Applicant Signature
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="file" id="uploadfile7" name="uploadfile7" required="">
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
    </body>
</html>
