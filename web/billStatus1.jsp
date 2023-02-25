<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="updateCustomer.css">
        <title>Payment Status</title>
    </head>
    <body>
        
      
        <input type="checkbox" id="show">
    <label for="show" class="show-btn">Show Electricity Bill</label>

    <div class="container">
        <label for="show" class="close-btn" title="close">×</label>
        <h1>Enter meter no and month to view details </h1>
        
        <form action="BilllStatus1"  method="post">
          <label> Meter No : </label>         
          <input type="text" name="meterNo" size="15"/> 
          <label> Month : </label>         
          <input type="text" name="month" size="15"/> 
          <button >Submit</button>
                        
        </form>
      
    </div>
             
    </body>
</html>

