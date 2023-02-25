<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="signin.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Baloo+2&family=Lora&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Sign In</title>
    </head>
    <body>
        
        <div id="login">
            <nav class="navbar">
                <div class="heading">
                    <img src="Icon/ebs.jpg" alt="">
                    <h3>Electricity Billing System</h3>
                    <div class="time">
                        <img src="Icon/calendar.png" alt="" style="width: 35px; height: 35px;">
                        <div class="d" id="date">
                            <p>Mon, 06/03/2000</p>
                        </div>
                        <img src="Icon/clock.png" alt="" style="width: 35px; height: 35px;">

                        <div class="c" id="clock">
                            <p>08:12:34</p>
                        </div>
                    </div>
                </div>
            </nav>
            <section class="vh-100">
                <div class="container-fluid h-custom">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-md-9 col-lg-6 col-xl-5">
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp" class="img-fluid" alt="Sample image">
                        </div>
                        <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                            <form>
                                <!-- Email input -->
                                <h1 style="text-align:center;font-weight:bold">Sign In</h1>
                                <br>


                                <div class="form-outline d-flex flex-row align-items-center mb-4">
                                    <span class="fav"><img src="Icon/user.png" alt=""></span>
                                    <input type="text" id="username" class="form-control" placeholder="Enter Username" />
                                    <!--<small id="usernamevalid" class=" form-text text-muted invalid-feedback"><p style="margin:5px">Invalid Username</p></small>-->
                                </div>

                                <!-- Password input -->
                                <div class="form-outline d-flex flex-row align-items-center mb-4 ">
                                    <span class="fav"><img src="Icon/key.png" alt=""></span>
                                    <input type="password" id="password" class="form-control" placeholder="Enter password" />
                                    <!--<small id="passwordvalid" class="form-text text-muted invalid-feedback"><p style="margin:5px">Invalid Password</p></small>-->
                                </div>
                                <div class="form-outline d-flex flex-row align-items-center mb-4 ">
                                    <span class="fav" style="margin-right: 6px"><img src="Icon/login.png" alt=""></span>
                                    <select class="form-control">
                                        <option>Login as</option>
                                        <option>Admin</option>
                                        <option>Customer</option>
                                    </select>
                                </div>

                                <div class="d-flex justify-content-between align-items-center">
                                    <!-- Checkbox -->
                                    <div class="form-check mx-5">
                                        <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" />
                                        <label class="form-check-label" for="form2Example3">Remember me</label>
                                    </div>
                                    <div class="forgetPassword"><a href="#!" class="text-body">Forgot password?</a></div>
                                </div>

                                <div class="text-center text-lg-start mt-4 pt-2 Register">

                                    <button type="button" id="signIn" class=" btn btn-primary btn-lg btn-block col-10 mx-5">Sign In</button>
                                    <p class="small fw-bold mt-3 pt-1 mb-0 text-center " style="font-size: large ">Don't have an account? <a href="SignUp.jsp" class="link-danger register ">Sign Up</a></p>
                                </div>
                                <br>

                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </div>

        <!--<script src="index.js"></script>-->
        <script src="clock.js"></script>
        <script src="date.js"></script>



        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js " integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p " crossorigin="anonymous "></script>
    </body>
</html>
