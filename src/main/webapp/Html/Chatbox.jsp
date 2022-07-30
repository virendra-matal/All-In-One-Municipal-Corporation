
<%@page import="com.MunicipalCorporation.Model.chatbox"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Chat Box</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="../Css/Chatbox.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
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
                    <li><a href="Chatbox.jsp"><i class="fa fa-commenting"></i> Chatbox </a></li>
                    <li><a href="Admin_Feedback.jsp"><i class="fa fa-commenting"></i> Feedback </a></li>
                    <li><a href="new.jsp"><i class="fa fa-commenting"></i> Online Applications </a></li>
                    <li><a href="Admin _Logout.jsp"><i class="fa fa-commenting"></i> Logout </a></li>
                </ul>

            </div>
            <div class="list_box">
                <div class="heading">
                    <h2>COMMUNICATE WITH USERS</h2>
                    <i class="fa fa-search"></i>
                    <input type="text" name="search" placeholder="Search" maxlenght="20">
                    <h3>CHATS</h3>
                </div>
                <table class="table">
                    <jsp:include page="../Getting_UName_Servlet" />
                    <%List<chatbox> hosp = (ArrayList<chatbox>) request.getAttribute("username");
                        for (chatbox a : hosp) {%>
                    <tbody class="tbody">
                        <tr style="background: antiquewhite;
                            border-bottom: 1px solid #999;
                            margin-top: 50px;">
                            <td style=" height: 60px"><a href="#chat" onclick="startChat(this)" data-UserID=<%=a.getUserID()%> id="username"> <%=a.getU_Name()%> </a></td>
                            <td><%=a.getDate()%></td>
                        </tr>
                    </tbody>
                    <%}%>
                </table>  
            </div>
            <div class="chat" id="chat">
                chatbox
                <div class="message_box" id="messagesection">

                    <table id="adminall" style="width: 100%">
                        <tr><td></td></tr>
                    </table>

                </div>
                <div class="input-box">
                    <input type="text" id="selecteduserid" hidden="">
                    <input type="text" id="textbox" class="text" name="textbox" placeholder="Type a message" required>
                    <input type="button" value="send" id="send" class="submit_button">
                </div>

            </div>
        </div>
        <script>
            var global_userid;
            function startChat(e) {
                var userid = $(e).attr('data-UserID');
                if (userid != undefined) {
                    $('#selecteduserid').val(userid);
                }
                setInterval(loadmessage(), 1000);
               

            }
            $(document).ready(function () {
//                var objDiv = document.getElementById("messagesection");
//                objDiv.scrollTop(objDiv[0].scrollHeight);

                $("#send").click(function () {
                    var userid = $('#selecteduserid').val();
//                    alert(userid);
                    var message = $("#textbox").val();
                    $.post("../send_Admin_message_Servlet", {Message: message, UserId: userid}, function (data, status) {
                        $("#textbox").val("");
                        loadmessage();
                    });
                    message = null;
                });
            });
            
             function loadmessage() {
                    $("#adminall").empty();
                    $.post("../Load_Admin_Message_Servlet", {UserId: $('#selecteduserid').val()}, function (data, status) {
                        for (var i = 0; i < data.length; i++) {
                            if (data[i].Sender_Id == `${Admin_Id}`) {
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
        </script>
    </body>
</html>
