<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Baloo+2&family=Lora&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Calculate Bill</title>
    </head>
    <body>
        <div id="customer">         
            <section class="vh-100">
                <div class="container-fluid h-custom">
                    <div class="row d-flex justify-content-center align-items-center h-100" >
                        <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                            
                            <form action="CalculateBill" method="post">
                                <h1 style="text-align:center;font-weight:bold">Calculate Bill</h1>
                                <br>

                                <div class="form-outline">
                                    <label>Customer Name</label>
                                    <input type="text" name="username" class="form-control" placeholder="Enter name" />
                                </div>
                               
                                <div class="form-outline">
                                    <label>Meter Number</label>
                                    <input type="text" name="meterNo" class="form-control" placeholder="Enter meter no" />
                                </div>
                                
                               
                                <div class="form-outline">
                                    <label>Address</label>
                                    <input type="text" name="address" class="form-control" placeholder="Enter address" />
                                </div>
                                
                                <div class="form-outline">
                                    <label>Select Month</label>
                                    <select class="form-control month" name="month">
                                        <option>January</option>
                                        <option>February</option>
                                        <option>March</option>
                                        <option>April</option>
                                        <option>May</option>
                                        <option>June</option>
                                        <option>July</option>
                                        <option>August</option>
                                        <option>September</option>
                                        <option>October</option>
                                        <option>November</option>
                                        <option>December</option>                                        
                                    </select>
                                </div>

                               
                                <div class="form-outline" name="units">
                                    <label>Units Consumed</label>
                                    <input type="text" name="units" class="form-control" placeholder="Enter units" />
                                </div>
                              
                                <div class="text-center text-lg-start mt-4 pt-2" style="display: flex" >
                                    <button type="submit" id="submit" class=" btn btn-primary btn-lg btn-block col-3" style="margin-left: 95px;margin-right:15px">Submit</button>
                                    <button type="submit" id="back" class=" btn btn-primary btn-lg btn-block col-3" style="margin-left:15px" ><a href="AdminFrontPage.jsp" style="text-decoration: none;color: white">Back</a></button>                              
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </body>
</html>
