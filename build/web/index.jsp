<%-- 
    Document   : index
    Created on : Jun 29, 2019, 11:08:32 PM
    Author     : asus
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.FutsalModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Veranda Futsal</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

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

<body data-spy="scroll" data-offset="58" data-target="#navbar-main">


  <div id="navbar-main">
    <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="#home" class="smoothscroll">Home</a></li>
            <li> <a href="#Field" class="smoothscroll"> Field</a></li>
            <li> <a href="#contact" class="smoothscroll"> Contact</a></li></ul>
          <ul class="nav navbar-nav navbar-right">
            <li> <a href="register.jsp">Register</a></li>
            <li> <a href="login.jsp">Login</a></li>
        </div>
        <!--/.nav-collapse -->
      </div>
    </div>
  </div>

  <!-- ==== HEADERWRAP ==== -->
  <div id="home"></div>
  <div id="headerwrap" name="home">
    <header class="clearfix">
        <h1><span></span></h1><br><br><br><br><br><br><br>
      <p>Veranda Futsal</p>
      <p>Exclusive for playing futsal</p>
    </header>
  </div>
  <!-- /headerwrap -->

  <!-- ==== GREYWRAP ==== -->
    <div id="greywrap">
    <div class="row">
      <div class="col-lg-4 callout">
        <br><br>
        <h2>Veranda Futsal</h2>
      </div>
      <!-- col-lg-4 -->

      <div class="col-lg-4 callout">
        <h2>Various Field</h2>
        <p>There is two fields are available, namely synthetic and polyethylene fields</p>
      </div>
      <!-- col-lg-4 -->

      <div class="col-lg-4 callout">
        <h2>Schedule Veranda Futsal</h2>
        <p>We are open from <br>monday-friday at 09:00 - 23:00.
          <br> Saturday-Sunday 08:00-00:00</p>
      </div>
      <!-- col-lg-4 -->
    </div>
    <!-- row -->
  </div>
  <!-- greywrap -->

  <!-- ==== FIELD ==== -->

  <div class="container" id="Field" name="Field">
    <div class="row white">
      <br>
      <h1 class="centered">Field of Veranda Futsal</h1>
      <hr>

      <div class="col-lg-6">
        <img src="img/field.jpg">
      </div>
      <!-- col-lg-6 -->

      <div class="col-lg-6">
        <img src="img/field2.jpg">
      </div>
     </div>
    <!-- row -->
  </div>
  <!-- container -->

  <!-- ==== GREYWRAP ==== -->
            <% FutsalModel km = new FutsalModel();
                  List<FutsalModel> data = new ArrayList<FutsalModel>();
                  List<FutsalModel> data2 = new ArrayList<FutsalModel>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil_lap();
                      data2 = km.tampil_lap2();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
              
<div id="greywrap">
    <div class="row">
      <div class="col-lg-4 callout">
      <h2>Veranda Futsal</h2>
      <p>veranda futsal is a place that has two futsal fields consisting of synthetic and polyethylene fields.</p>
    </div>
    
    <div class="col-lg-4 callout">
        <h2><%=data.get(0).getJenisLap()%></h2>
        <p> Price of Synthetic field = <%=data.get(0).getTarif()%>/hours <br>
            Field area: <%=data.get(0).getLuas()%> </p>
      </div>
    <div class="col-lg-4 callout">
        <h2><%=data2.get(0).getJenisLap()%></h2>
        <p> Price of Synthetic field = <%=data2.get(0).getTarif()%>/hours <br>
            Field area: <%=data2.get(0).getLuas()%> </p>
      </div>
        <%}%>
    <div class="col-lg-4 callout">
        
      </div>
    </div>
</div>
         <!-- ==== SERVICES ==== -->
  <div class="container" id="Register" name="Register">
    <br>
    <div class="col-lg-5" style="margin-left: 330px;">
    <div class="form-group">
        <a href="login.jsp"><button type="submit" class="btn btn-large">BOOK NOW</button></a>
    </div>
    </div>
    <br>
    
     </div>
     <!-- col --> 

 
  <!-- ==== SECTION DIVIDER6 ==== -->
  <div class="container" id="contact" name="contact">
  <section class="section-divider textdivider divider6">
    <div class="container">
      <h1>Veranda Futsal. Indonesia.</h1>
      <hr>
        <p><span class="icon icon-home"></span> Some Address <br/>
          <span class="icon icon-phone"></span> +021 870 684 <br/>
          <span class="icon icon-mobile"></span> +62 859 5268 0011 <br/>
          <span class="icon icon-envelop"></span> <a href="#"> vernada@gmail.com</a> <br/>
        </p>
    </div>
  </div>
    <!-- container -->
  </section>
  <!-- section -->

  
    <div class="row">
      <br>
      <h1 class="centered">THANKS FOR VISITING US</h1>
      <hr>
      <br>
      <br>
    </div>
  </div>
  <!-- container -->

<div id="copyrights">
  <div class="container">
    <p>
      &copy; Copyrights <strong>Veranda</strong>. All Rights Reserved
    </p>
    <div class="credits">
      
      Created by Veranda Futsal
    </div>
  </div>
</div>
<!-- / copyrights -->

<!-- JavaScript Libraries -->
<script src="lib/jquery/jquery.min.js"></script>
<script src="lib/bootstrap/js/bootstrap.min.js"></script>
<script src="lib/php-mail-form/validate.js"></script>
<script src="lib/easing/easing.min.js"></script>

<!-- Template Main Javascript File -->
<script src="js/main.js"></script>

</body>
</html>
