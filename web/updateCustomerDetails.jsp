<%@page import="dao.UpdateCustomerDAO"%>
<%@page import="com.app.dto.UpdateCustomerDetailsDto"%>
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
        <title>Customer Details</title>
    </head>
    <body>
            <%
        String meterNo=(String)session.getAttribute("meterNo");
       
        if(meterNo==null){
            response.sendRedirect("updateCustomer.jsp");
        }
       
       
        UpdateCustomerDAO sdao = new UpdateCustomerDAO();
        UpdateCustomerDetailsDto adto = sdao.getCustomerData(meterNo);
       
       
       
     
        %>
        
        <div id="customer">         
            <section class="vh-100">
                <div class="container-fluid h-custom">
                    <div class="row d-flex justify-content-center align-items-center" style="margin-top: 25px">
                        <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                           
                            <form action="UpdateCustomerdetails2" method="post">
                                <h1 style="text-align:center;font-weight:bold">Customer Details</h1>
                                <br>

                                <div class="form-outline">
                                    <label>Customer Name</label>
                                    <input type="text" name="username" value="<%=adto.getUsername()%>" class="form-control" placeholder="Enter name" />
                                </div>
                               
                                <div class="form-outline">
                                    <label>Meter Number</label>
                                    <input type="text" name="meterNo" value="<%=adto.getMeterNo()%>" class="form-control" placeholder="Enter meter no" />
                                </div>
                                
                                <div class="form-outline">
                                    <label>State</label>
                                    <input type="text" name="state" value="<%=adto.getState()%>" class="form-control" placeholder="Enter state" />
                                </div>
                                
                                <div class="form-outline">
                                    <label>City</label>
                                    <input type="text" name="city" value="<%=adto.getCity()%>" class="form-control" placeholder="Enter city" />
                                </div>
                                
                                <div class="form-outline">
                                    <label>Address</label>
                                    <input type="text" name="address" value="<%=adto.getAddress()%>" class="form-control" placeholder="Enter address" />
                                </div>
                                
                                <div class="form-outline">
                                    <label>Email Address</label>
                                    <input type="email" name="email" value="<%=adto.getEmail()%>" class="form-control" placeholder="Enter email address" />
                                </div>
                               
                                <div class="form-outline">
                                    <label>Contact Number</label>
                                    <input type="text" name="contact" value="<%=adto.getContact()%>" class="form-control" placeholder="Enter contact no" />
                                </div>
                              
                                <div class="text-center text-lg-start mt-4 pt-2" style="display: flex" >
                                    <button type="submit" id="submit" class=" btn btn-primary btn-lg btn-block col-3" style="margin-left: 95px;margin-right:15px">Submit</button>
                                    <button type="submit" id="back" class=" btn btn-primary btn-lg btn-block col-3" style="margin-left:15px" ><a href="CustomerFrontPage.jsp" style="text-decoration: none;color: white">Back</a></button>                              
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </body>
</html>
