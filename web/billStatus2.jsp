<%@page import="com.app.dto.BillStatusDto"%>
<%@page import="dao.BillStatusDAO"%>
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
        <title>Electricity Bill Status</title>
    </head>
    <body>
                    <%
        String meterNo=(String)session.getAttribute("meterNo");
        String month=(String)session.getAttribute("month");
       
        if(meterNo==null && month==null){
            response.sendRedirect("CustomerFrontPage.jsp");
        }
       
       
        BillStatusDAO sdao = new BillStatusDAO();
        BillStatusDto adto = sdao.getBillStatus(meterNo,month);
       
       
       
     
        %>
        <div id="customer">         
            <section class="vh-100">
                <div class="container-fluid h-custom">
                    <div class="row d-flex justify-content-center align-items-center h-100" >
                        <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                            
                            <form action="BillStatus2" method="post" >
                                <h1 style="text-align:center;font-weight:bold">Electricity Bill Status</h1>
                                <br>
 
                                <div class="form-outline">
                                    <label>Customer Name</label>
                                    <input type="text" name="name" value="<%=adto.getUsername()%>" class="form-control" placeholder="" />
                                </div>
                                
                                <div class="form-outline">
                                    <label>Meter Number</label>
                                    <input type="text" name="meterNo" value="<%=adto.getMeterNo()%>" class="form-control" placeholder="" />
                                </div>               
                                
                                <div class="form-outline">
                                    <label>Month</label>
                                    <input type="text" name="month" value="<%=adto.getMonth()%>" class="form-control" placeholder="" />

                                </div>

                               
                                <div class="form-outline">
                                    <label>Units Consumed</label>
                                    <input type="text" name="units" value="<%=adto.getUnits()%>" class="form-control" placeholder="Enter units" />
                                </div>
                                
                                <div class="form-outline">
                                    <label>Total Bill</label>
                                    <input type="text" name="bill" value="<%=adto.getCalcbill()%>" class="form-control" placeholder="" />
                                </div>
                                
                                <div class="form-outline">
                                    <label>Select Payment Status</label>
                                    <select class="form-control month" name="payment" ">
                                        <option><%=adto.getPayment()%></option>
                                        <option>Not Paid</option>
                                        <option>Paid</option>
                                    </select>
                                </div>
                              
                                <div class="text-center text-lg-start mt-4 pt-2" style="display: flex" >
                                    <button type="submit" id="pay" class=" btn btn-primary btn-lg btn-block col-3" style="margin-left: 95px;margin-right:15px">Pay</button>
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
