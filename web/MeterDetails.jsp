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
        <title>Meter Details</title>
    </head>
    <body>
        <div id="customer">         
            <section class="vh-100">
                <div class="container-fluid h-custom">
                    <div class="row d-flex justify-content-center align-items-center h-100" >
                        <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                            
                            <form action="AddMeterDetails" method="post">
                                <h1 style="text-align:center;font-weight:bold">Meter Details</h1>
                                <br>


                                <div class="form-outline">
                                    <label>Meter Number</label>
                                    <input type="text" name="meterNo" class="form-control" placeholder="Enter meter no" />
                                </div>
                                                                
                                <div class="form-outline">
                                    <label>Select Meter Location</label>
                                    <select class="form-control month" name="location" >
                                        <option>Inside</option>
                                        <option>Outside</option>         
                                    </select>
                                </div>
                                <div class="form-outline">
                                    <label>Select Meter Type</label>
                                    <select class="form-control month" name="type">
                                        <option>Electric Meter</option>
                                        <option>Solar Meter</option>         
                                    </select>
                                </div>
                                
                                <div class="form-outline">
                                    <label>Phase Code</label>
                                    <input type="text" name="phase" class="form-control" placeholder="Enter phase code" />
                                </div>
                                                                                             
                                <div class="form-outline">
                                    <label>Select Bill Type</label>
                                    <select class="form-control month " name="billType">
                                        <option>Normal</option>
                                        <option>Industrial</option>                                      
                                    </select>
                                </div>

                               
                                <div class="form-outline">
                                    <label>Days</label>
                                    <input name="days" class="form-control" value="30" />
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
