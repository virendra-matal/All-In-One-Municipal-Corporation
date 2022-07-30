

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Feedback</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../Css/feedback.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="background">
            <div class="form-square">
                <h1> FEEDBACK </h1>
                <form class="form-body" action="../Feedback_Servlet" method="post" onsubmit="return RegisterValidation()">

                    <table>
                        <tr>
                            <td>
                                <label>Name: </label>
                                <input type="text" name="name" id="name" class="input-box"  autocomplete="off">
                            </td>
                        </tr>      
                        <tr>
                            <td>
                                <label>Email: </label>
                                <input type="email" name="email" id="email" class="input-box"  autocomplete="off">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Mobile No.: </label>
                                <input type="text" name="phone" id="phone" class="input-box" autocomplete="off" >
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label> Feedback: </label>
                                <textarea class="txt" id="txt" name="feedback"></textarea >
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <button type="submit" id="submit" class="btn" onclick="submit()">Submit</button>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <script>
            function RegisterValidation() {
//                event.preventDefault();
                valid = true;
                var regName = /^[a-zA-Z]+ [a-zA-Z]+$/;
                var Email_pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                var phone_pattern = /^\d{10}$/;
                var name = document.getElementById('name').value.trim();
//                alert(name);
                var email = document.getElementById('email').value.trim();
                var phone = document.getElementById('phone').value.trim();
                var txt = document.getElementById('txt').value.trim();
//                var city = document.getElementById('city').value.trim();
//                var cityIndex = document.getElementById('city').selectedIndex;
////                alert(cityIndex);
//                var state = document.getElementById('state').value.trim();
//                var stateIndex = document.getElementById('state').selectedIndex;
//                var area = document.getElementById('area').value.trim();
//                var areaIndex = document.getElementById('area').selectedIndex;

                if (name === "" || name === null) {
                    alert("Name is required.");
                    valid = false;
//                } else if (name.length < 8) {
//                    alert("Please enter full name.");
//                    valid = false;
                } else if (name.length > 30) {
                    alert("Name should be up to 30 characters.");
                    valid = false;
                } else if (!regName.test(name)) {
                    alert('Invalid name, Enter FirstName then LastName.');
                    valid = false;
                }

                if (email === "" || email === null) {
                    alert("Email Address is required.");
                    valid = false;
                } else if (email.length > 30) {
                    alert("Username should be up to 30 characters.");
                    valid = false;
                } else if (!Email_pattern.test(email))
                {
                    alert("You have entered an invalid email address!");
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

                if (txt === "" || txt === null) {
                    alert("Please enter you Feedback.");
                    valid = false;
                }

//
//                if (cityIndex === 0) {
//                    alert("City is required.");
//                    valid = false;
//                }
//
//                if (stateIndex === 0) {
//                    alert("State is required.");
//                    valid = false;
//                }
//
//                if (areaIndex === 0) {
//                    alert("Area is required.");
//                    valid = false;
//                }
                alert("Are you sure to submit your feedback.");
                return valid;
                
            }
//            function submit(){
//                alert("Thanks for your feedback.");
//            }

        </script>
    </body>
</html>

