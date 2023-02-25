<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="updateCustomer.css">
        <title>Show details</title>
    </head>
    <body>
        
      
        <input type="checkbox" id="show">
    <label for="show" class="show-btn">Show customer details</label>

    <div class="container">
        <label for="show" class="close-btn" title="close">×</label>
        <h1>Enter meter no to view details </h1>
        
        <form action="ViewCustomerDetails"  method="get">
          <label> Meter No : </label>         
          <input type="text" name="meterNo" size="15"/> 
          <button >Submit</button>
                        
        </form>
      
    </div>
             
    </body>
</html>
