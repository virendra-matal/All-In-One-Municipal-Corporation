<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ganapati Visarjan Booking slot</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <link href="../Css/Ganapati_booking_slot.css" rel="stylesheet" type="text/css"/>
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
                        <h2>Ganapati Visarjan Booking slot</h2><br>
                        <a href="Home.jsp"><span>Home</span></a>
                        <meta property="position" content="1">
                        >
                        <a href="Ganpati_booking_slot.jsp"><span>Ganapati Visarjan Slot Booking</span></a>

                    </div>
                </div>
                <div class="solid_waste">
                    <h1></h1>
                    <form action="../Ganapti_Visarjan_Booking_Slot_Servlet" method="post" onsubmit="return GanaptiValidation()">
                        <div class="c_heading"> Ganapati Visarjan Booking slot </div>
                        <table>


                            <tr class="extra_space"></tr>


                            <p> Register to fix the immersion time slot so that no more than 10 circles come together at a time for immersion of Ganpati due to the prevalence of covid 19.</p>


                            <tr class="extra_space"></tr>


                            <!--type of registration-->
                            <tr>
                                <td class='td'> Type of registration
                                    <span class=" span">*</span>                                    </td>
                                <td class="td2">:</td>
                                <td>
                                    <input class="radio" type="radio" id="radio" name="radio" value="Mandal" >
                                    <span class="abc">Mandal</span>
                                    <!--                                </td>
                                                                    <td>-->
                                    <input class="radio" type="radio" id="radio2" name="radio" value="Individual" >
                                    <span class="abc">Individual</span>
                                </td>
                            </tr>


                            <tr class="extra_space"></tr>
                            <!--name-->
                            <tr>
                                <td class='td'> Name 
                                    <span class=" span">*</span>
                                </td>
                                <td class="td2">:</td>
                                <!--<td class="td1"></td>-->
                                <td>
                                    <input class="input" type="text" id="name" name="name">
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>
                            <!--mobile number-->
                            <tr>
                                <td class='td'> Mobile No. 
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td>
                                    <input class="input" type="text" id="phone" name="number" >
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>
                            <!--address-->
                            <tr>
                                <td class='td'> Address
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td>
                                    <input class="input" type="text" id="address" name="address" >  
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>

                            <!--select ward-->
                            <tr>
                                <td class='td'> Select Ward
                                    <span class=" span"*</span>
                                </td>
                                <td>:</td>
                                <td>
                                    <select name="ward" id="ward">
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
                            <!--slect place-->
                            <tr>
                                <td class='td'> Select Place
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td>
                                    <select name="place" id="place">
                                        <option> Select </option>
                                        <option> mumbai chowpatty </option>

                                    </select> 
                                </td> 
                            </tr>


                            <tr class="extra_space"></tr>
                            <!--Date and time-->
                            <tr>
                                <td class='td'> Date and time
                                    <span class=" span">*</span>
                                </td>
                                <td>:</td>
                                <td>
                                    <select name="time" id="time">
                                        <option> Select </option>
                                        <option> 5 september 2022 at 5pm </option>
                                        <option> 5 september 2022 at 6pm </option>
                                        <option> 5 september 2022 at 7pm </option>
                                        <option> 5 september 2022 at 8pm </option>
                                        <option> 5 september 2022 at 9pm </option>
                                        <option> 5 september 2022 at 10pm </option>
                                        <option> 5 september 2022 at 11pm </option>
                                        <option> 5 september 2022 at 12pm </option>

                                    </select> 
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

                                <td class="td" style="text-align: center" > Signature
                                    <span class=" span">*</span>
                                </td>
                                <td> : </td>
                                <td class="td1"> </td>
                                <td>
                                    <input type="file" id="uploadfile1" name="uploadfile1">
                                </td>
                            </tr>
                        </table>

                        <input type="submit" name="BtnSubmit" value="Get Status" id="BtnSubmit" class="button">
                        <div class="space_empty"></div>
                    </form> 
                </div>
                <div class="lower_part">

                </div>
            </div>
        </div>
        <script>
            function GanaptiValidation() {
                //                event.preventDefault();
                valid = true;
                var regName = /^[a-zA-Z]+ [a-zA-Z]+$/;
//                var Email_pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                var phone_pattern = /^\d{10}$/;
                var address_pattern = /^[a-zA-Z0-9\s,-]{10,}$/;
                var name = document.getElementById('name').value.trim();
                var phone = document.getElementById('phone').value.trim();
                var address = document.getElementById('address').value.trim();
//                   var ward = document.getElementById('ward').value.trim();
                var wardIndex = document.getElementById('ward').selectedIndex;
//                   var place = document.getElementById('place').value.trim();
                var placeIndex = document.getElementById('place').selectedIndex;
//                   var time = document.getElementById('time').value.trim();
                var timeIndex = document.getElementById('time').selectedIndex;
                
                var radio =document.getElementById("radio");
                var radio2 = document.getElementById("radio2");
                
                var image=document.getElementById("uploadfile1").value;
//                alert(image);
                if (radio.checked === false && radio2.checked === false) {
                    alert("You must select either Mandal or Individual");
                    valid = false;
                }
                if (name === "" || name === null) {
                    alert("Name is required.");
                    valid = false;
                } else if (name.length > 30) {
                    alert("Name should be up to 30 characters.");
                    valid = false;
                } else if (!regName.test(name)) {
                    alert('Invalid name, Enter FirstName then LastName.');
                    valid = false;
                }

                if (phone === "" || phone === null) {
                    alert("number is required.");
                    valid = false;
                } else if (!phone_pattern.test(phone))
                {
                    alert("Please enter 10 digits only.");
                    valid = false;
                }

                if (address === "" || address === null) {
                    alert("Please enter complete Address.");
                    valid = false;
                } else if (!address_pattern.test(address)) {
                    alert("You have entered an invalid Address!");
                    valid = false;
                }




//                if (txt === "" || txt === null) {
//                    alert("Please enter you Feedback.");
//                    valid = false;
//                }

                if (wardIndex === 0) {
                    alert("Plaeaase select the Ward.");
                    valid = false;
                }
                if (placeIndex === 0) {
                    alert("Please select the Place.");
                    valid = false;
                }
                //
                if (timeIndex === 0) {
                    alert("Please select the time from slot.");
                    valid = false;
                }
                if (image === "" || image === null) {
                    alert("Please upload the image.");
                    valid = false;
                }
                alert("Are you sure to book your Slot.");
                return valid;

            }

        </script>
    </body>
</html>
