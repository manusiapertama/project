<%-- 
    Document   : edit_boking
    Created on : Jul 2, 2019, 12:23:07 AM
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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboad | Account Table</title>
    <link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
  <link href="assets/css/style.css" rel="stylesheet" />
      <link href="assets/css/main-style.css" rel="stylesheet" />

    <link href="assets/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
    <style>
       button {
  background-color: black;
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

/* Extra styles for the cancel button */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
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

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
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

        <style>
* {
  box-sizing: border-box;
}

    </style>

</head>

<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation" id="navbar">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index_admin.jsp">
                    <h1 style="color: white;"><b>Veranda Futsal</b></h1>
                </a>
            </div>
            <ul class="nav navbar-top-links navbar-right">  
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-3x"></i>
                    </a>
                    <!-- dropdown user-->
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i>User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i>Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login_admin.jsp"><i class="fa fa-sign-out fa-fw"></i>Logout</a>
                        </li>
                    </ul>
                </li>
            </ul>

        </nav>

        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
                    <li>
                        <div class="user-section">
                            
                        </div>
                    </li>
                    <li class>
                        <a href="index_admin.jsp"><i class="fa fa-dashboard fa-fw"></i>Dashboard</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table fa-fw"></i>Tables<span class="fa arrow"></a>
                        <ul class="nav nav-second-level">
                            <li class="selected">
                                <a href="tabel_akun.jsp">Account Table</a>
                            </li>
                            <li>
                                <a href="tabel_boking.jsp">Booking Table</a>
                            </li>
                        </ul>
                    </li>
                    </ul>
            </div>
        </nav>
        <div id="page-wrapper">

            
            <div class="row">
                 <!--  page header -->
                <div class="col-lg-12">
                    <h1 class="page-header">Edit Booking</h1>
                </div>
                 </div>
           <div class="row">
                <div class="col-lg-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                      
      
     <div class="panel-body">
         <div class="row">
             <div class="col-lg-6">
                 <form role="form" action="UserController?data=user&proses=update-booking" method="post">
                     <%
                  String ket = request.getParameter("id_booking");
                  FutsalModel km = new FutsalModel();
                  km.setId_book(ket);
                  List<FutsalModel> data = new ArrayList<FutsalModel>();
                  data = km.cariId_book();
                  if (data.size() > 0) {
              %>
     
      <div class="form-group">
           <input class="form-control" type="hidden" placeholder="Enter ID" name="id_booking" value="<%=data.get(0).getId_book()%>" >
      </div>
          <div class="form-group">
          <label for="uname"><b>Team Name</b></label>
           <input class="form-control" type="text" placeholder="Enter Name" name="nama_tim" value="<%=data.get(0).getNamaTim()%>" required>
      </div>
      <div class="form-group">
      <label for="psw"><b>Field Choice</b></label>
      <select class="form-control" name="no_lapangan"><option><%=data.get(0).getNoLap()%></option>
          
                    <option value="1">1. Syntetic Field</option>
                    <option value="2">2. Polyethylene Field</option>
      </select>
      </div>
      <div class="form-group">
      <label for="psw"><b>Day</b></label>
      <input class="form-control" type="date" placeholder="Enter Date" name="hari" value="<%=data.get(0).getHari()%>" required>
      </div>
      <div class="form-group">
      <label for="psw"><b>Time</b></label>
      <input class="form-control" type="time" placeholder="Enter Time" name="jam" value="<%=data.get(0).getJam()%>" required>
      </div>
      
      <button class="btn btn-lg btn-success btn-block" type="submit" value="Update">Update</button>
      <%}%>
      </div>
    </form>
                    
                                        
                                   
                            
                        </div>
                    </div>
                </div>
            </div>
            
    </div>
    <!-- end wrapper -->

    <!-- Core Scripts - Include with every page -->
    <script src="assets/plugins/jquery-1.10.2.js"></script>
    <script src="assets/plugins/bootstrap/bootstrap.min.js"></script>
    <script src="assets/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="assets/plugins/pace/pace.js"></script>
    <script src="assets/scripts/siminta.js"></script>
    <!-- Page-Level Plugin Scripts-->
    <script src="assets/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="assets/plugins/dataTables/dataTables.bootstrap.js"></script>
    <script>
        $(document).ready(function () {
            $('#dataTables-example').dataTable();
        });
    </script>

</body>

</html>

