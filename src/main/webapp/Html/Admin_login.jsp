

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Admin Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../Css/admin_login.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
    </head>
    <body>
        <div class="head">
            <div class="form-box">
                <div class="button-box">
                    <div id="btn"></div>
                    <button type="button" class="toggle-btn" onclick="login()">Login</button>

                </div> 
                <form id="login" class="form" name="form" action="../Admin_Login_Servlet" method="post" onsubmit="return AdminValidation()">
                    <i class="fa fa-user-circle"></i>
                    <input type="text" class="input-field" placeholder="Username" id="Auser" name="Username" autocomplete="off" >
                    <i class="fa fa-lock"></i>
                    <input type="password" class="input-field" placeholder="Enter Password" id="Apass" name="Password" autocomplete="off" >

                    <select name="Municipal_Corporation" id="Municipal_Corporation" class="required">
                        <option disabled selected>Municipal Corporation</option>
                        <option value="Vasai-Virar Municipal Corporation"> Vasai-Virar Municipal Corporation </option>
                        <option value="Pune Municipal Corporation"> Pune Municipal Corporation</option>
                        <option value="Mumbai Municipal Corporation"> Mumbai Municipal Corporation </option>
                        <option value="Aurangabad Municipal Corporation"> Aurangabad Municipal Corporation </option>
                        <option value="Delhi Municipal Corporation"> Delhi Municipal Corporation</option>
                        <!--<option> Gujarat Municipal Corporation </option>-->
                    </select><br>
                    <input type="checkbox" class="check-box" checked><span>Remember me</span>
                    <button type="submit" class="submit-btn">Login</button>
                </form>

            </div>
        </div>
        <script>
            function AdminValidation() {
//                event.preventDefault();
                valid = true;
                var Auser = document.getElementById('Auser').value.trim();
//                alert(user);
                var Apass = document.getElementById('Apass').value.trim();
                var Municipal_Corporation = document.getElementById('Municipal_Corporation').value.trim();
                var Municipal_Corporation1 = document.getElementById('Municipal_Corporation').selectedIndex;
//                alert(Municipal_Corporation1);
//                alert(Municipal_Corporation);
                
//                alert(Municipal_Corporation.selectedIndex);
                if (Auser === "" || Auser === null) {
                    alert("Username is required.");
                    valid = false;
                } else if (Auser.length < 8) {
                    alert("Username should be at least 8 character");
                    valid = false;
                } else if (Auser.length > 25) {
                    alert("Username should be less than 25 character");
                    valid = false;
                }

                if (Apass === "" || Apass === null) {
                    alert("Password is required.");
                    valid = false;
                } else if (Apass.length < 8) {
                    alert("Password should be at least 8 character");
                    valid = false;
                } else if (Apass.length > 25) {
                    alert("Password should be less than 25 character");
                    valid = false;
                }

                if (Municipal_Corporation1 === 0) {
//                    alert("index : "+Municipal_Corporation.selectedIndex);
                    alert("Municipal Corporation is required.");
                    valid = false;
                } 
//                else if (Area.selected < 8) {
//                    alert("Password should be at least 8 character");
//                    valid = false;
//                } else if (Apass.length > 20) {
//                    alert("Password should be less than 20 character");
//                    valid = false;
//                }

                return valid;

            }
        </script>
    </body>
</html>

