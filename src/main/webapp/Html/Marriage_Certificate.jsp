<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Marriage Certificate t</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/marriage_Certificate.css" rel="stylesheet" type="text/css"/>
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
                        <h2> Marriage Certificate </h2><br>
                        <a href="Home.jsp"><span>Home</span></a>
                        <meta property="position" content="1">
                        >
                        <a href="Ganpati_booking_slot.jsp"><span>Marriage Certificate </span></a>

                    </div>
                </div>
                <div class="solid_waste">

                    <form action="../Marriage_Registration_Servlet" method="post">
                        <div class="c_heading"> Marriage Certificate Registration </div>
                        <table>


                            <tr class="extra_space"></tr>

                            <!--marriage details-->
                            <tr>
                                <td class="td"> <b>MARRIAGE DETAILS</b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr><!-- comment -->


                            <!--select ward-->
                            <tr>
                                <td class="td"> Marriage Date
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input class="input" type="date" name="marriage_date" required> 
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>

                                <!--select ward-->
                                <td class='td'> Select Ward
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="ward" id="c_type" required="">
                                        <option> Select </option>
                                        <option > A Ward  </option>
                                        <option > B Ward  </option>
                                        <option> C Ward  </option>
                                        <option > D Ward  </option>
                                        <option > BHAG  </option>
                                        <option > BPD  </option>
                                        <option > CW Ward  </option>
                                        <option > COOP  </option>
                                        <option > DA  </option>
                                        <option > E Ward  </option>
                                        <option > FN Ward  </option>
                                        <option > GN Ward  </option>
                                        <option > GS Ward  </option>
                                        <option > HE Ward  </option>
                                        <option > L Ward  </option>
                                    </select> 
                                </td> 
                            </tr>

                            <tr class="extra_space"></tr>



                            <!--place of marriage and address-->
                            <tr>
                                <td class='td'> Place of Marriage
                                    <span class=" span">*</span>
                                </td>
                                <td class="td2">:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input class="input" type="text" id="marriage_place" name="marriage_place" required autocomplete="off">
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> House No. and Street road
                                    <span class=" span">*</span>
                                </td>
                                <td class="td2">:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input class="input" type="text" id="marriage_address" name="marriage_address" required autocomplete="off">
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>



                            <!--ciyt and country-->
                            <tr>
                                <td class='td'> Select city
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="marriage_city" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Mumbai  </option>
                                        <option> Pune  </option>
                                        <option> Nashik  </option>
                                        <option> Nagpur  </option>
                                        <option> Ratnagiri  </option>
                                        <option> Vasai-Virar  </option>

                                    </select> 
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Select Country
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="marriage_country" id="c_type">
                                        <option> Select </option>
                                        <option> India  </option>
                                    </select> 
                                </td> 
                            </tr>



                            <tr class="extra_space"></tr>



                            <tr>
                                <td class='td'><b> HUSBAND DETAILS</b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <!--husband name-->
                            <tr>
                                <td class='td'> Name of Husband
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="husband_name" name="husband_name" required autocomplete="off"> 
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Religion by the Birth
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="religion_birth" id="c_type">
                                        <option> Select </option>
                                        <option> Hindu  </option>
                                        <option> Muslim  </option>
                                        <option> Christian  </option>
                                        <option> Sikh  </option>
                                        <option> Budh  </option>
                                        <option> Jain </option>

                                    </select> 
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Religion by the Adoption
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="religion_adopt" id="c_type">
                                        <option> Select </option>
                                        <option> Hindu  </option>
                                        <option> Muslim  </option>
                                        <option> Christian  </option>
                                        <option> Sikh  </option>
                                        <option> Budh  </option>
                                        <option> Jain </option>

                                    </select> 
                                </td>  
                            </tr>




                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Date of Birth
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="date" id="hus_DOB" name="hus_DOB" required="" >

                                </td> 
                            </tr>
                            <tr>
                                <td class='td'> 
                                    <span class=" span"></span>
                                </td>
                                <td></td>
                                <td class="td1"> </td>
                                <td>
                                    <button type="submit" onclick = "ageCalculatorHusband()"> Calculate age </button>

                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Age
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="show_age" name="show_age" >
                                </td>  
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Status at the time of marriage
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="hus_status" id="c_type">
                                        <option> Select </option>
                                        <option> Unmarried  </option>
                                        <option> Divorced  </option>
                                        <option> Widower  </option>
                                    </select> 
                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Occupation 
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="hus_occupation" id="c_type">
                                        <option> Select </option>
                                        <option> Administrative, Executive and managerial worker  </option>
                                        <option> Clerical and related worker   </option>
                                        <option> Sales worker  </option>
                                        <option> Service worker  </option>
                                        <option> Farmer, Fisherman, Hunter, logger and other worker  </option>
                                        <option> production and other related worker </option>
                                        <option> Professional, Technical and related worker </option>
                                        <option> Others </option>
                                        <option> Non-Worker </option>
                                    </select> 
                                </td>  
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Mobile Number
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="mobile" name="mobile"  maxlength="10" autocomplete="off" required="">
                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> E-mail address 
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="email" name="email" id="email" required autocomplete="off">
                                </td>  
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> House No. and Street road
                                    <span class=" span">*</span>
                                </td>
                                <td class="td2">:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input class="input" type="text" id="hus_address" name="hus_address" required autocomplete="off">
                                </td> 


                            </tr>


                            <tr class="extra_space"></tr>



                            <!--ciyt and country-->
                            <tr>
                                <td class='td'> Select city
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="hus_city" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Mumbai  </option>
                                        <option> Pune  </option>
                                        <option> Nashik  </option>
                                        <option> Nagpur  </option>
                                        <option> Ratnagiri  </option>
                                        <option> Vasai-Virar  </option>

                                    </select> 
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Select Country
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="hus_country" id="c_type">
                                        <option> Select </option>
                                        <option> India  </option>
                                    </select> 
                                </td> 
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> <b>WIFE DETAILS</b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <!--husband name-->
                            <tr>
                                <td class='td'> Name of Wife
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="wige_name" name="wige_name" required autocomplete="off"> 
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Religion by the Birth
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="wife_reli_birth" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Hindu  </option>
                                        <option> Muslim  </option>
                                        <option> Christian  </option>
                                        <option> Sikh  </option>
                                        <option> Budh  </option>
                                        <option> Jain </option>

                                    </select> 
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Religion by the Adoption
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="wife_reli_adopt" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Hindu  </option>
                                        <option> Muslim  </option>
                                        <option> Christian  </option>
                                        <option> Sikh  </option>
                                        <option> Budh  </option>
                                        <option> Jain </option>

                                    </select> 
                                </td>  
                            </tr>




                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Date of Birth
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="date" id="DOB_wife" name="DOB_wife" required="">

                                </td> 
                            </tr>
                            <tr>
                                <td class='td'> 
                                    <span class=" span"></span>
                                </td>
                                <td></td>
                                <td class="td1"> </td>
                                <td>
                                    <button type="submit" onclick = "ageCalculatorWife()"> Calculate age </button>

                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Age
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="show_age_wife" name="show_age_wife" required="" >
                                </td>  
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Status at the time of marriage
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="wife_status_marr" id="c_type">
                                        <option> Select </option>
                                        <option> Unmarried  </option>
                                        <option> Divorced  </option>
                                        <option> Widower  </option>
                                    </select> 
                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Occupation 
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="wife_occupation" id="c_type">
                                        <option> Select </option>
                                        <option> Administrative, Executive and managerial worker  </option>
                                        <option> Clerical and related worker   </option>
                                        <option> Sales worker  </option>
                                        <option> Service worker  </option>
                                        <option> Farmer, Fisherman, Hunter, logger and other worker  </option>
                                        <option> production and other related worker </option>
                                        <option> Professional, Technical and related worker </option>
                                        <option> Others </option>
                                        <option> Non-Worker </option>
                                    </select> 
                                </td>  
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Mobile Number
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="wife_mobile" name="wife_mobile"  maxlength="10" autocomplete="off" required="">
                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> E-mail address 
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="email" name="wife_email" id="wife_email" required autocomplete="off">
                                </td>  
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> House No. and Street road
                                    <span class=" span">*</span>
                                </td>
                                <td class="td2">:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input class="input" type="text" id="wife_address" name="wife_address" required autocomplete="off">
                                </td> 


                            </tr>


                            <tr class="extra_space"></tr>



                            <!--ciyt and country-->
                            <tr>
                                <td class='td'> Select city
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="wife_city" id="c_type">
                                        <option> Select </option>
                                        <option> Mumbai  </option>
                                        <option> Pune  </option>
                                        <option> Nashik  </option>
                                        <option> Nagpur  </option>
                                        <option> Ratnagiri  </option>
                                        <option> Vasai-Virar  </option>

                                    </select> 
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Select Country
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="wife_country" id="c_type">
                                        <option> Select </option>
                                        <option> India  </option>
                                    </select> 
                                </td> 
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> <b>WITNESS DETAILS</b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <!--Witness name-->
                            <tr>
                                <td class='td'> Name of Witness
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="witness_name" name="witness_name" required autocomplete="off"> 
                                </td>
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Relation (if any) with the married couple	
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="relation_with_couple" name="relation_with_couple" required autocomplete="off"> 
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>

                            <tr>
                                <td class='td'> Occupation 
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="witness_occupation" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Administrative, Executive and managerial worker  </option>
                                        <option> Clerical and related worker   </option>
                                        <option> Sales worker  </option>
                                        <option> Service worker  </option>
                                        <option> Farmer, Fisherman, Hunter, logger and other worker  </option>
                                        <option> production and other related worker </option>
                                        <option> Professional, Technical and related worker </option>
                                        <option> Others </option>
                                        <option> Non-Worker </option>
                                    </select> 
                                </td>  
                            </tr>



                            <tr class="extra_space"></tr>




                            <tr>
                                <td class='td'> Mobile Number
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="witness_number" name="witness_number"  maxlength="10" autocomplete="off" required="">
                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> E-mail address 
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="email" name="witness_email" id="witness_email" required autocomplete="off">
                                </td>  
                            </tr>


                            <tr class="extra_space"></tr>




                            <tr>
                                <td class='td'> House No. and Street road
                                    <span class=" span">*</span>
                                </td>
                                <td class="td2">:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input class="input" type="text" id="witness_address" name="witness_address" required autocomplete="off">
                                </td> 


                            </tr>


                            <tr class="extra_space"></tr>



                            <!--ciyt and country-->
                            <tr>
                                <td class='td'> Select city
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="witness_city" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Mumbai  </option>
                                        <option> Pune  </option>
                                        <option> Nashik  </option>
                                        <option> Nagpur  </option>
                                        <option> Ratnagiri  </option>
                                        <option> Vasai-Virar  </option>

                                    </select> 
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Select Country
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="witness_country" id="c_type" required="">
                                        <option> Select </option>
                                        <option> India  </option>
                                    </select> 
                                </td> 
                            </tr>





                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> <b>PRIEST DETAILS</b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <!--husband name-->
                            <tr>
                                <td class='td'> Name of Priest
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="priest_name" name="priest_name" required autocomplete="off"> 
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Religion 
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="priest_religion" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Hindu  </option>
                                        <option> Muslim  </option>
                                        <option> Christian  </option>
                                        <option> Sikh  </option>
                                        <option> Budh  </option>
                                        <option> Jain </option>

                                    </select> 
                                </td> 
                            </tr>




                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Date of Birth
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="date" id="DOB_Priest" name="DOB_Priest" >

                                </td> 
                            </tr>
                            <tr>
                                <td class='td'> 
                                    <span class=" span"></span>
                                </td>
                                <td></td>
                                <td class="td1"> </td>
                                <td>
                                    <button type="submit" onclick = "ageCalculatorPriest()"> Calculate age </button>

                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Age
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="show_age_priest" name="show_age_priest" >
                                </td>  
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Occupation 
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="priest_occupation" id="c_type">
                                        <option> Select </option>
                                        <option> Administrative, Executive and managerial worker  </option>
                                        <option> Clerical and related worker   </option>
                                        <option> Sales worker  </option>
                                        <option> Service worker  </option>
                                        <option> Farmer, Fisherman, Hunter, logger and other worker  </option>
                                        <option> production and other related worker </option>
                                        <option> Professional, Technical and related worker </option>
                                        <option> Others </option>
                                        <option> Non-Worker </option>
                                    </select> 
                                </td>  
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> Mobile Number
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="text" id="priest_number" name="priest_number"  maxlength="10" autocomplete="off" required="">
                                </td> 
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> E-mail address 
                                    <span class=" span"></span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="email" name="priest_email" id="priest_email" required autocomplete="off">
                                </td>  
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> House No. and Street road
                                    <span class=" span">*</span>
                                </td>
                                <td class="td2">:</td>
                                <td class="td1"> </td>
                                <td>
                                    <input class="input" type="text" id="priest_address" name="priest_address" required autocomplete="off">
                                </td> 


                            </tr>


                            <tr class="extra_space"></tr>



                            <!--ciyt and country-->
                            <tr>
                                <td class='td'> Select city
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="priest_city" id="c_type" required="">
                                        <option> Select </option>
                                        <option> Mumbai  </option>
                                        <option> Pune  </option>
                                        <option> Nashik  </option>
                                        <option> Nagpur  </option>
                                        <option> Ratnagiri  </option>
                                        <option> Vasai-Virar  </option>

                                    </select> 
                                </td> 

                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class='td'> Select Country
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>
                                <td>
                                    <select name="priest_country" id="c_type" required="">
                                        <option> Select </option>
                                        <option> India  </option>
                                    </select> 
                                </td> 
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> <b> DOCUMENT UPLOAD BY BRIDE </b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr> 
                                <td class="td">
                                    Bride Birth Certificate
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile1" name="uploadfile1" required="">
                                </td>
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center">
                                    Bride Aadhar Card
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile2" name="uploadfile2" required="">
                                </td>
                            </tr>
                            <tr class="extra_space"></tr>


                            <tr> 
                                <td class="td">
                                    Passport size photographs of Bride 
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile13" name="uploadfile13" required="">
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> <b> DOCUMENT UPLOAD BY BRIDEGROOM </b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr> 
                                <td class="td">
                                    Bridegroom Birth Certificate
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile5" name="uploadfile5" required="">
                                </td>
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center">
                                    Bridegroom Aadhar Card
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile6" name="uploadfile6" required="">
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr> 
                                <td class="td">
                                    Passport size photographs of Bridegroom 
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile12" name="uploadfile12" required="">
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> <b> DOCUMENT UPLOAD BY WITNESS </b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr> 
                                <td class="td">
                                    Witness Aadhar Card
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile7" name="uploadfile7" required="">
                                </td>
                                <td class="td"> </td>
                                <td class="td2"> </td>
                                <td class="td" style="text-align: center">
                                    Witness Election Card
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile8" name="uploadfile8" required="">
                                </td>
                            </tr>





                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> <b> DOCUMENT UPLOAD BY APPLICANT </b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr> 
                                <td class="td">
                                    Copy of Wedding card
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile9" name="uploadfile9" required="">
                                </td>
                            </tr>






                            <tr class="extra_space"></tr>


                            <tr>
                                <td class='td'> <b> DOCUMENT UPLOAD BY PRIEST </b>
                                </td>
                            </tr>



                            <tr class="extra_space"></tr>


                            <tr> 
                                <td class="td">
                                    Signature of Priest
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td class="td1"> </td>

                                <td>
                                    <input type="file" id="uploadfile10" name="uploadfile10" required="">
                                </td>
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

                                <td class="td" style="text-align: center"> Signature of applicant
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="file" id="uploadfile11" name="uploadfile11">
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
            function ageCalculatorHusband() {
                var userinput = document.getElementById("hus_DOB").value;
                var dob = new Date(userinput);
                var input = document.getElementById("show_age");
                if (userinput === null || userinput === '') {
                    document.getElementById("message").innerHTML = "**Choose a date please!";
                    return false;
                } else {

                    //calculate month difference from current date in time  
                    var month_diff = Date.now() - dob.getTime();

                    //convert the calculated difference in date format  
                    var age_dt = new Date(month_diff);

                    //extract year from date      
                    var year = age_dt.getUTCFullYear();

                    //now calculate the age of the user  
                    var age = Math.abs(year - 1970);

                    //display the calculated age  
                    input.setAttribute('value', age);
                }
            }
            function ageCalculatorWife() {
                var userinput = document.getElementById("DOB_wife").value;
                var dob = new Date(userinput);
                var inputf = document.getElementById("show_age_wife");
                if (userinput === null || userinput === '') {
                    document.getElementById("message").innerHTML = "**Choose a date please!";
                    return false;
                } else {

                    //calculate month difference from current date in time  
                    var month_diff = Date.now() - dob.getTime();

                    //convert the calculated difference in date format  
                    var age_dt = new Date(month_diff);

                    //extract year from date      
                    var year = age_dt.getUTCFullYear();

                    //now calculate the age of the user  
                    var age = Math.abs(year - 1970);

                    //display the calculated age  
                    inputf.setAttribute('value', age);
                }
            }
            function ageCalculatorPriest() {
                var userinput = document.getElementById("DOB_Priest").value;
                var dob = new Date(userinput);
                var inputg = document.getElementById("show_age_priest");
                if (userinput === null || userinput === '') {
                    document.getElementById("message").innerHTML = "**Choose a date please!";
                    return false;
                } else {

                    //calculate month difference from current date in time  
                    var month_diff = Date.now() - dob.getTime();

                    //convert the calculated difference in date format  
                    var age_dt = new Date(month_diff);

                    //extract year from date      
                    var year = age_dt.getUTCFullYear();

                    //now calculate the age of the user  
                    var age = Math.abs(year - 1970);

                    //display the calculated age  
                    inputg.setAttribute('value', age);
                }
            }
        </script>
    </body>
</html>
