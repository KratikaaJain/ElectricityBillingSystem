<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="AdminPanel.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Baloo+2&family=Lora&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Admin Panel</title>
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
            <div class="box">
                <h1>Admin Panel</h1>
                <br>
                <div class="box1">
                    <h3 style="color:black;">New Customer</h3>
                    <div class="box2">
                        <button type="button" id="btn1" class="btn btn-secondary btn-sm"><a href="addCustomer.jsp">Add</a></button>
                    </div>
                </div>

                <div class="box1">
                    <h3 style="color:black;">Meter Details</h3>
                    <div class="box2">
                        <button type="button" id="btn1" class="btn btn-secondary btn-sm"><a href="MeterDetails.jsp">Add</a></button>
                    </div>
                </div>
                
                <form action="ShowCustomerDetails" method="get">
                <div class="box1">
                    <h3 style="color:black;">Customer Details</h3>
                    <div class="box2">
                        <button type="submit" id="btn1" class="btn btn-secondary btn-sm"><a>Show</a></button>
                    </div>
                </div>
                </form>
                
                <div class="box1">
                    <h3 style="color:black;">Customer Payment Status</h3>
                    <div class="box2">
                        <button type="button" id="btn1" class="btn btn-secondary btn-sm"><a href="paymentHistory.jsp">Show</a></button>
                    </div>
                </div>
                <div class="box1">
                    <h3 style="color:black;">Electricity Bill</h3>
                    <div class="box2">
                        <button type="button" id="btn1" class="btn btn-secondary btn-sm"><a href="calculateBill.jsp">Calculate</a></button>
                    </div>
                </div>

            </div>
        </div>

        <script src="clock.js"></script>
        <script src="date.js"></script>



        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js " integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p " crossorigin="anonymous "></script>
    </body>
</html>