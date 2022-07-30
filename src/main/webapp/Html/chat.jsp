
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../Css/chat.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
        <div class="chatbox">
            <div class="message_box" id="messagesection">

                <table id="adminall" style="width: 100%">
                    <tr>
                        <td></td>
                    </tr>
                </table>

            </div>
            <div class="input-box">
                <input type="text" id="textbox" class="text" name="textbox" placeholder="Type a message" required>
                <input type="button" value="send" id="send" class="submit_button">
            </div>

        </div>
        <div class="empty_div">

        </div>
        <script>


            setInterval(loadmessage(), 1000);
            function loadmessage() {
                $.post("../LoadMessage_Servlet", {Message: 0}, function (data, status) {
                    $("#adminall").empty();
                    for (var i = 0; i < data.length; i++) {
                        if (data[i].Sender_Id == `${UserID}`) {
                            var htmlname = `<td style=float:right;> <div style="border: 0px solid black; margin: 5px; padding: 15px;border-radius: 20px;background-color: lightgreen;">` + data[i].Message + `<br/><span style="color: gray;font-size:12px;">` + data[i].Date + `</span></div></td>`;
                            $('#adminall tr:last').append(htmlname);
                            var row = document.createElement('tr');
                            var tableCurrentPoints = document.getElementById("adminall"); // find table to append to
                            tableCurrentPoints.appendChild(row);
                        } else {

                            var htmlname = `<td style=float:left;><div style="border: 0px solid black; margin: 5px; padding: 15px;border-radius: 20px;background-color: white;">` + data[i].Message + `<br/><span style="color: gray;font-size:12px;">` + data[i].Date + `</span></div></td>`;
                            $('#adminall tr:last').append(htmlname);
                            var row = document.createElement('tr');
                            var tableCurrentPoints = document.getElementById("adminall"); // find table to append to
                            tableCurrentPoints.appendChild(row);
                        }
                    }
                });
            }
            $(document).ready(function () {
//                var objDiv = document.getElementById("messagesection");
//                 objDiv.scrollTop(objDiv[0].scrollHeight);
                
                $("#send").click(function () {
                    var message = $("#textbox").val();
                    $.post("../sendmessage_Servlet", {Message: message}, function (data, status) {
                        $("#textbox").val("");
                        loadmessage();
                        //                        $.post("LoadMessage_Servlet", {Message: 0}, function (data, status) {
                        //                            for (var i = 0; i < data.length; i++) {
                        //                                var htmlname = "<td>" + data[i].Message + "</td>";
                        //                                $('#adminall tr:last').append(htmlname);
                        //
                        //                                var row = document.createElement('tr');
                        //                                var tableCurrentPoints = document.getElementById("adminall"); // find table to append to
                        //                                tableCurrentPoints.appendChild(row);
                        //                            }
                        //                        });
                    });
                });
            });
        </script>
    </body>
</html>
