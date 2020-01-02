<%-- 
    Document   : login
    Created on : Jun 30, 2019, 2:20:10 AM
    Author     : asus
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.FutsalModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Veranda Futsal</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:Lato:300,400,700,300italic,400italic|Raleway:400,300,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/icomoon/icomoon.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">

  <!-- =======================================================
    Template Name: Shield
    Template URL: https://templatemag.com/shield-bootstrap-agency-template/
    Author: TemplateMag.com
    License: https://templatemag.com/license/
  ======================================================= -->
</head>

<style>

body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>

<head>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<br><br><br><br><br><br>

<body>
  <body data-spy="scroll" data-offset="58" data-target="#navbar-main">

  <div id="navbar-main">
    <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="user_page.jsp" class="smoothscroll">Home</a></li>
            <li> <a href="user_page.jsp/#Field" class="smoothscroll"> Field</a></li>
            <li> <a href="user_page.jsp" class="smoothscroll"> Booking</a></li>
            <li> <a href="history-book.jsp"> History</a></li>
            <li> <a href="#contact" class="smoothscroll"> Contact</a></li></ul>
          <ul class="nav navbar-nav navbar-right">
              <li> <a href="#" ><b style="color:cyan;">Hello <%=session.getAttribute("nama")%></b></a></li>
              <li> <a href="index.jsp">Log Out</a></li></ul>
        </div>
        <!--/.nav-collapse -->
      </div>
    </div>
  </div>
              
      
            <div class="row">
                 <!--  page header -->
                <div class="col-lg-12">
                    <h1 class="page-header">History Booking</h1>
                </div>
                 </div>
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                       
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Booking ID</th>
                                            <th>Name</th>
                                            <th>Team Name</th>
                                            <th>Field Number</th>
                                            <th>Day/Date</th>
                                            <th>Time</th>
                                        </tr>
                                    </thead>
                                    <tbody>
               <tr>
                
                  </tr>

                                        
                                    </tbody>
                                </table>
                            </div>
              
                        </div>
                    </div>
   </body>
</html>
