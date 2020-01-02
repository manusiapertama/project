<%-- 
    Document   : index_admin
    Created on : Jul 1, 2019, 12:53:26 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Admin Dashboad</title>

    <link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
    <link href="assets/css/main-style.css" rel="stylesheet" />
    
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
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>Logout</a>
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
                    <li class="selected">
                        <a href="index_admin.jsp"><i class="fa fa-dashboard fa-fw"></i>Dashboard</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table fa-fw"></i>Tables<span class="fa arrow"></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="tabel_akun.jsp">Account Table</a>
                            </li>
                            <li>
                                <a href="tabel_booking.jsp">Booking Table</a>
                            </li>
                            <li>
                                <a href="tabel_lap.jsp">Field Table</a>
                            </li>
                        </ul>
                    </li>
                    </ul>
            </div>
        </nav>
        <div id="page-wrapper">

            <div class="row">
                <!-- Page Header -->
                <div class="col-lg-12">
                    <h1 class="page-header">Welcome, <%=session.getAttribute("nama")%> :)</h1>
                </div>
            </div>
            
            <div class="row">
                <div class="col-lg-0">
                    <img src="img/user.png" style="width:20%; float: left;">
                    <img src="img/book.png" style="width:20%; float:left;">
                    
                </div>
            </div>
             <div class="row">
                <div class="col-lg-0">
                 <h3>Total Account : </h3>
                 <h3>Total Booking : </h3>
           
                </div>
            </div>
            </div>

    </div>
   
    <script src="assets/plugins/jquery-1.10.2.js"></script>
    <script src="assets/plugins/bootstrap/bootstrap.min.js"></script>
    <script src="assets/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="assets/plugins/pace/pace.js"></script>
    <script src="assets/scripts/siminta.js"></script>
    

</body>

</html>
