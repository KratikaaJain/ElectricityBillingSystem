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
        <title>Front Page</title>
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
                                <h1 style="text-align:center;font-weight:bold">Sign In As</h1>
                                
                                <div class="text-center text-lg-start mt-4 pt-2 Register" id="signIn">

                                    <button type="button"  class=" btn btn-primary btn-lg btn-block col-10 mx-5" style="margin: 10px 10px"><a href="AdminSignIn.jsp" target="_blank" style="text-decoration: none;color: white">Admin</a></button>
                                    <button type="button"  class=" btn btn-primary btn-lg btn-block col-10 mx-5" style="margin: 10px 10px"><a href="CustomerSignIn.jsp" target="_blank" style="text-decoration: none;color: white">Customer</a></button>
                                
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
