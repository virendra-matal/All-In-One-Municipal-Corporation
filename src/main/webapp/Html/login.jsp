

<%@page import="com.MunicipalCorporation.Model.Municipal_Corporation"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="../Css/login.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
    </head>
    <body>
        <div class="head">
            <div class="form-box">
                <div class="button-box">
                    <div id="btn"></div>
                    <button type="button" class="toggle-btn" onclick="login()">Login</button>
                    <button type="button" class="toggle-btn" onclick="register()">Register</button>
                </div> 
                <form id="login" class="form" action="../login_servlet" method="post" onsubmit="return validation()">
                    <i class="fa fa-user-circle"></i>
                    <input type="text" class="input-field" placeholder="Username" id="user" name="username" autocomplete="off" >
                    <div class="error"> </div>
                    <i class="fa fa-lock"></i>
                    <input type="password" class="input-field" id="pass" placeholder="Enter Password" name="password"  autocomplete="off" >
                    <div class="error"> </div>
                    <!--<i class="fa fa-lock"></i>-->
                    <!--                    <input type="password" class="input-field" id="cpass" placeholder="Confirm Password" autocomplete="off" >
                                        <div class="error"> </div>-->
                    <!--<input type="checkbox" class="check-box" checked><span id="remember">Remember me</span>-->
                    <button type="submit" class="submit-btn">Login</button>

                    <!--<p>${errorMessage}</p>-->
                </form>
                <!--<form id="register" class="form" action="../register" method="post">-->
                <div id="register" class="form" >     
                    <input type="text" class="input-field" id="name" placeholder="Enter Name"  name="U_Name">
                    <input type="text" class="input-field" id="username" placeholder="Username"  name="Username">
                    <input type="password" class="input-field" id="password" placeholder="Enter Password"  name="Password">
                    <input type="text" class="input-field" id="number" placeholder="Enter your Mobile no."  name="Mobile_Number" maxlength="10">
                    <select name="city" id="city" >
                        <option>City</option>
                        <option>Mumbai</option>
                        <option>Pune</option>
                        <option>Aurangabad</option>
                        <option>Vasai-Virar</option>
                        <option>Delhi</option>
                    </select>
                    <select name="State" id="state" >
                        <option>State</option>
                        <option>Andhra pradesh</option>
                        <option>Gujarat</option>
                        <option>Goa</option>
                        <option>Kerala</option>
                        <option>Maharashtra</option>
                        <option>Rajasthan</option>
                    </select>
                    <select name="Area" id="area" onchange="SelectMunicipalCorp()">
                        <option>Area</option>
                        <option> Mumbai </option>
                        <option> Pune </option>
                        <option> Aurangabad </option>
                        <option> Vasai-Virar </option>
                        <option> Delhi </option>
                    </select><br>

                    <input type="text" class="input-field" id="municipal_corp" name="municipal_corp" disabled>

                    <!--                    <input type="checkbox" class="check-box" checked><span>I agree to the terms & condition</span>-->
                    <button type="submit" class="submit-btn" id="submit_btn" onclick="SubmitForm(); RegisterValidation()">Register</button>
                </div>
                <!--</form>-->
                <br>
                <a href="Admin_login.jsp">Click here, if you are admin</a>
            </div>
        </div>
        <script>
            var x = document.getElementById("login");
            var y = document.getElementById("register");
            var z = document.getElementById("btn");
            function register() {
                x.style.left = "-400px";
                y.style.left = "30px";
                z.style.left = "130px";
            }
            function login() {
                x.style.left = "30px";
                y.style.left = "450px";
                z.style.left = "0px";
            }
            function validation() {
//                event.preventDefault();
                valid = true;
                var user = document.getElementById('user').value.trim();
//                alert(user);
                var pass = document.getElementById('pass').value.trim();
                if (user === "" || user === null) {
                    alert("Username is required.");
                    valid = false;
                } else if (user.length < 8) {
                    alert("Username should be at least 8 character");
                    valid = false;
                } else if (user.length > 15) {
                    alert("Username should be less than 15 character");
                    valid = false;
                }

                if (pass === "" || pass === null) {
                    alert("Password is required.");
                    valid = false;
                } else if (pass.length < 8) {
                    alert("Password should be at least 8 character");
                    valid = false;
                } else if (pass.length > 15) {
                    alert("Password should be less than 15 character");
                    valid = false;
                }
//                alert("form submitted");
                return valid;

            }





            function RegisterValidation() {
//                event.preventDefault();
                valid = true;
                var name = document.getElementById('name').value.trim();
//                alert(name);
                var username = document.getElementById('username').value.trim();
                var password = document.getElementById('password').value.trim();
                var number = document.getElementById('number').value.trim();
                var city = document.getElementById('city').value.trim();
                var cityIndex = document.getElementById('city').selectedIndex;
//                alert(cityIndex);
                var state = document.getElementById('state').value.trim();
                var stateIndex = document.getElementById('state').selectedIndex;
                var area = document.getElementById('area').value.trim();
                var areaIndex = document.getElementById('area').selectedIndex;

                if (name === "" || name === null) {
                    alert("Name is required.");
                    valid = false;
                } else if (name.length < 8) {
                    alert("Please enter full name.");
                    valid = false;
                } else if (name.length > 30) {
                    alert("Name should be up to 30 characters.");
                    valid = false;
                }

                if (username === "" || username === null) {
                    alert("Username is required.");
                    valid = false;
                } else if (username.length < 8) {
                    alert("Username should be at least 8 characters.");
                    valid = false;
                } else if (username.length > 30) {
                    alert("Username should be up to 30 characters.");
                    valid = false;
                }

                if (password === "" || password === null) {
                    alert("Password is required.");
                    valid = false;
                } else if (password.length < 8) {
                    alert("Password should be at least 8 character");
                    valid = false;
                } else if (password.length > 30) {
                    alert("Password should be less than 15 character");
                    valid = false;
                }

                if (number === "" || number === null) {
                    alert("number is required.");
                    valid = false;
                } else if (number.length < 10) {
                    alert("Number should be 10 digits only.");
                    valid = false;
                } else if (number.length > 10) {
                    alert("Number should be 10 digits only.");
                    valid = false;
                }
                
                 if (cityIndex === 0) {
                    alert("City is required.");
                    valid = false;
                } 
                
                 if (stateIndex === 0) {
                    alert("State is required.");
                    valid = false;
                } 
                
                 if (areaIndex === 0) {
                    alert("Area is required.");
                    valid = false;
                } 
//                alert("form submitted");
                return valid;

            }
            var name_corp;
            var corp_Id;
            function SelectMunicipalCorp() {
                $(document).ready(function () {
                    var area = $("#area").val();
//                    alert(area);
                    $.post("../FindMunicipalCorp_Servlet", {Area: area}, function (data) {
                        for (var i = 0; i < data.length; i++) {
                            name_corp = data[i].Mc_name;
                            corp_Id = data[i].MCId;
                            $("#municipal_corp").val(name_corp);
//                        sendinfo(name_corp, corp_Id);
                        }
                    });

                });
            }
            function SubmitForm() {
                var name = $("#name").val();
                var username = $("#username").val();
                var password = $("#password").val();
                var number = $("#number").val();
                var city = $("#city").val();
                var state = $("#state").val();
                var area = $("#area").val();
                var municipal_corp = $("#municipal_corp").val();
                var mcorpId = corp_Id;
//                alert(mcorpId+"\n"+name+"\n"+username+"\n"+password+"\n"+number+"\n"+city+"\n"+state+"\n"+area+"\n"+municipal_corp);
                $.post("../register", {U_Name: name, Username: username, Password: password, Mobile_Number: number, city: city, State: state, Area: area, Municipal_corp_name: municipal_corp, MCId: mcorpId});
//                $("#municipal_corp").empty();
                window.location.href="login.jsp";
//                $('#register').each(function () {
//                    this.reset();
//                });
            }

        </script>
    </body>
</html>

