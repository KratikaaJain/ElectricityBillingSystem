<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="signup.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Baloo+2&family=Lora&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Sign Up</title>
</head>

<body>


    <div id="login">

        <section class="vh-100">

            <div class="container-fluid h-custom">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-md-9 col-lg-6 col-xl-5">
                        <img src="Icon/signup.jpg" class="img-fluid" alt="Sample image">
                    </div>
                    <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                        
                        
                        
                        <form action="Siignup" method="post">
                            <h1 style="text-align:center;font-weight:bold">Sign Up</h1>
                            <br>
                            
                            
                            <div class="form-outline d-flex flex-row align-items-center mb-4" >
                                <span class="fav"><img src="Icon/user.png" alt=""></span>
                                <input type="text" name="username" class="form-control " placeholder="Enter Username" />
                                <!--<small id="username" class="form-text text-muted invalid-feedback"> Your username must be 2-10 characters long and must not start with a digit</small>-->
                            </div>
                            
                            <!-- Password input -->
                            <div class="form-outline d-flex flex-row align-items-center mb-4 ">
                                <span class="fav"><img src="Icon/lock.png" alt=""></span>
                                <input type="password" name="password" class="form-control" placeholder="Enter password" />
                                <!--<small id="passwordvalid" class="form-text text-muted invalid-feedback"> Your password must be 5-10 characters long, contain letters,numbers and atleast 1 special character.</small>-->
                            </div>

                            <div class="form-outline d-flex flex-row align-items-center mb-4 ">
                                <span class="fav"><img src="Icon/key.png" alt=""></span>
                                <input type="password" name="checkpassword" class="form-control" placeholder="Repeat your password" />
                                <!--<small id="passwordvalid" class="form-text text-muted invalid-feedback">Invalid password</small>-->
                            </div>
                            <div class="form-outline d-flex flex-row align-items-center mb-4 ">
                                <span class="fav" style="margin-right: 14px"><img src="Icon/login.png" alt=""></span>
                                <select class="form-control" name="loginas">
                                    <option>Sign Up as</option>
                                    <option>Customer</option>
                                </select>
                            </div>
                            <div class="text-center text-lg-start mt-4 pt-2 Register ">
                                <button type="submit" id="signUp" class=" btn btn-primary btn-lg btn-block col-11 mx-5">Sign Up</button>
                            </div>
                        </form>
                        
                        
                        
                    </div>
                </div>
            </div>
        </section>
    </div>
    <script src="register.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js " integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p " crossorigin="anonymous "></script>


</body>

</html>