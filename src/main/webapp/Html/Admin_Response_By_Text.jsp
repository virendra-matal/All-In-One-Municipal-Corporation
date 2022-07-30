
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Response By Text </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../Css/Admin_ResponseByText.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="background">
            <div class="form-square">
                <h1> RESPONSE TO COMPLAINTS </h1>
                <!--<form class="form-body" action="../Admin_ResponseByText_Servlet" method="post">-->
                <div class="form-body">
                    <table>
                        <tr>
                            <td>
                                <label>Complainant Name: </label>

                            </td>
                            <td id="name">

                            </td>

                        </tr>      
                        <tr>
                            <td>
                                <label> Type of Complaint: </label>

                            </td>
                            <td id="type">

                            </td>
                            <td>
                                <label>Location</label>

                            </td>
                            <td id="location">

                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label> Date of Complaint: </label>

                            </td>
                            <td id="date">

                            </td>
                            <td>
                                <label>Mobile No.: </label>

                            </td>
                            <td id="number">

                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label> Complaint Description:  </label>

                            </td>
                            <td id="desc">

                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label> Type Response: </label>

                            </td>
                            <td>
                                <textarea class="txt" name="Response" id="response" required ></textarea >
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <button type="submit" id="btn" class="btn">Submit</button>
                            </td>
                      
                            <td>
                                <button id="button" class="btn" onclick="window.location.href = 'Admin_Complaints.jsp';">Back to Complaints </button>
                            </td>
                        </tr>
                    </table>
                <!--</form>-->
                </div>
            </div>
        </div>
        <script>
            jsarray = JSON.parse(sessionStorage.getItem("jsArray"));
            var userid = jsarray[0];
            var complaintId = jsarray[1];
            var complaintsType = jsarray[2];
            var name = jsarray[3];
            var place = jsarray[4];
            var complaint_date = jsarray[5];
            var number = jsarray[6];
            var desc = jsarray[7];
            
//            alert("usernameid is :" + userid + "\n complaintId" + complaintId + "\n complaintsType" + complaintsType + "\nname " + name + "\n location" + place + "\n complaint_date" + complaint_date + "\n number" + number + "\n desc" + desc);


            document.getElementById("name").innerText += name;
            document.getElementById("type").innerText += complaintsType;
            document.getElementById("location").innerText += place;
            document.getElementById("date").innerText += complaint_date;
            document.getElementById("number").innerText += number;
            document.getElementById("desc").innerText += desc;
            $(document).ready(function () {
                $("#btn").click(function(){
                var Response= $("#response").val();
//                alert("Response"+Response);
                $.post("../Admin_ResponseByText_Servlet",{Complaint_Id: complaintId,Admin_Response: Response});
                $("#response").val("");
                alert("you have successfully pass the Response to "+name);
            });
            });
        </script>
    </body>
</html>
location