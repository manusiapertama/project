<%-- 
    Document   : register
    Created on : Jul 1, 2019, 11:15:48 AM
    Author     : asus
--%>

<%-- 
    Document   : login
    Created on : Jun 30, 2019, 2:20:10 AM
    Author     : asus
--%>

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

input[type=text], input[type=password], input[type=email] {
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
            <li><a href="index.jsp" class="smoothscroll">Home</a></li>
            <li> <a href="index.jsp/#Field" class="smoothscroll"> Field</a></li>
            <li> <a href="#contact" class="smoothscroll"> Contact</a></li></ul>
          <ul class="nav navbar-nav navbar-right">
            <li> <a href="#Register" class="smoothscroll"> Register</a></li>
            <li> <a href="login.jsp"> Log in</a></li>
        </div>
        <!--/.nav-collapse -->
      </div>
    </div>
  </div>

<div class="container">
  <center><h2>Register Form</h2></center>
  <form action="RegisController?data=user&proses=input-user" method="post">
      <div class="form-group">
      <label for="nama">Name:</label>
      <input type="name" class="form-control" id="nama" placeholder="Enter Name" name="nama" required>
      </div>
    <div class="form-group">
      <label for="no_telpon">Mobile:</label>
      <input type="text" class="form-control" id="no_telpon" placeholder="Enter Mobile" name="no_telpon" required>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
    </div>
       <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password" required>
    </div>
    <div class="form-group">
      <input type="hidden" class="form-control" name="role" value="user">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</body>
</html>

