<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Complaint Registration</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../Css/complaint_registration.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
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
        <div class="outsideText"> Note:*To pass the complaints, you have fill the below given form with accurate Information.* </div>
        
            <div class="box">
                <form action="../Complaint_Servlet" method="post">
                <div class="c_heading"> Complaint Registration </div>
                <table>

                    <!--select type-->

                    <tr>
                        <td class="td">
                            Select Complaint Type.
                            <span class=" span">*</span>
                        </td>
                        <td>:</td>
                        <td class="td1"> </td>

                        <td class="select1">
                            <select id="c_type" name="complaint_type">
                                <option>Select</option>
                                <option > Desilting </option>
                                <option > Garden & Tree </option>
                                <option > Solid Waste Management </option>
                                <option > Drainage </option>
                                <option > Storm water drain </option>
                                <option > Roads and traffic </option>
                                <option > Factories </option>
                                <option> Licence </option>
                                <option > Water supply </option>
                                <option > Colony officer  Pest control </option>
                                <option > Buildings </option>
                                <option > Repairs to municipal property </option>
                                <option > Shops & Establishment </option>
                                <option > School </option>
                                <option > Retired Employees Complaints </option>

                            </select>
                        </td> 


                        <!--select ward-->

                        <td class="td1"> </td>
                        <td class="td"> </td>
                        <td class="td1"> </td>
                        <td class="td" style="text-align: center">
                            Ward  
                            <span class=" span">* </span>
                        </td>
                        <td>:</td>
                        <td class="td1" > </td>
                        
                        <td>
                            <select id="c_type" name="ward">
                                <option>Select</option>
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

                    <!--Enter name-->

                    <tr>
                        <td class="td">Name Of Complainant
                            <span class=" span">*</span>
                        </td>
                        <td>:</td>
                        <td class="td1"> </td>

                        <td >
                            <input type="text" id="fname" name="name" minlength="8" autocomplete="off" required>
                        </td>

<!--                        <td>
                            <input type="text" id="mname" name="name" required>
                        </td>

                        <td >
                            <input type="text" id="lname" name="name" required>
                        </td>-->
                    </tr>

                    <!--Name labels-->

                    <tr>
                        <td class="td"> </td>
                        <td> </td>
                        <td class="td1"> </td>

                        <td class="name_labels" > FirstName  LastName </td>
                       
                    </tr>

                    <!--Complaint description-->

                    <tr>
                        <td class="td">
                            Complaint Description
                            <span class=" span">*</span>
                        </td>
                        <td>:</td>
                        <td class="td1"> </td>

                        <td>
                            <textarea class="txt" placeholder="add description" name="desc" id="desc"></textarea>
                        </td>
                        <td class="td1"> </td>
                        <td class="td"> </td>
                        <td class="td1"> </td>
                        <td class="td" style="text-align: center">
                            Location
                            <span class=" span">*</span>
                        </td>
                        <td>:</td>
                        <td class="td1"> </td>

                        <td>
                            <textarea class="txt" name="location" id="location"></textarea>
                        </td>
                    </tr>

                    <!--Complaint date-->

                    <tr> 
                        <td class="td">
                            Complaint Date
                            <span class=" span">*</span>
                        </td>
                        <td>:</td>
                        <td class="td1"> </td>

                        <td>
                            <input type="date" name="calender" >
                        </td>

                    </tr>
                    <tr>
                        <td class="td">
                            Complainant Mobile Number
                            <span class=" span"></span>
                        </td>
                        <td>:</td>
                        <td class="td1"> </td>

                        <td>
                            <input type="text" maxlength="10" required="" name="number" autocomplete="off" requied>
                        </td>
                    </tr>

                    <!--upload images-->

                    <tr>
                        <td class="td">
                            Upload images
                            <span class=" span"></span>
                        </td>
                        <td>:</td>
                        <td class="td1"> </td>

                        <td>
                            <input type="file" id="uploadfile1" name="uploadfile1">
                        </td>
                        <td>
                            <!--<input type="submit" name="BtnUpload" value="Upload Image" id="BtnUpload" >--> 
                        </td>
                    </tr>
                    <tr></tr>
                </table>

                <input type="submit" name="BtnSubmit" value="Get Status" id="BtnSubmit" class="button">

            </form>    
            </div>
            
    </body>
</html>

