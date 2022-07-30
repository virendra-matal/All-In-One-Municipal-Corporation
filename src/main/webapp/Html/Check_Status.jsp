<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Check Status of Complaints</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../Css/Check_Status.css" rel="stylesheet" type="text/css"/>
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
        <div class="Search_box">
            <form action="../Get_Status_Complaint_Servlet" method="post">
            <table>
                <tr class="empty_row"></tr>
                <tr>
                    <td class="space"> </td>
                    <td  class="label">
                        Complaint No.
                    </td>
                    <td> </td>
                    <td>:</td>
                    <td> </td>
                    <td>
                        <input name="complaint_no" type="text" maxlength="5" id="complaint_no" class="textbox" required autocomplete="off">
                    </td>
                    <td> </td>
                </tr>
                <tr>
                    <td class="space"> </td>
                    <td  class="label"></td>
                    <!--<td class="space"> </td>-->
                    <td >
                        <b>AND</b>
                    </td>
                </tr>
                <tr>
<!--                    <td> </td>-->
                    <td class="space"> </td>
                    <td class="label">
                        Mobile No.
                    </td>
                    <td> </td>
                    
                    <td>:</td>
                    <td> </td>
                    <td>
                        <input name="txtCheck" type="text" maxlength="10" id="mobile" class="textbox" autocomplete="off" required>
                    </td>
                </tr>
                <tr>
<!--                    <td class="space"> </td>
                    <td class="space"> </td>-->
                    <td class="space"> </td>
                    <td  class="label"></td>
                    <td>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="submit" name="BtnSubmit" value="Search" id="BtnSubmit" class="button">
                    </td>
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>

