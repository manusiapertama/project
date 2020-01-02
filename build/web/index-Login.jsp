<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header-Login.jsp" %>

<head>
    <script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.cycle.js"></script>
	<script type="text/javascript">
	$(document).ready(function() 
	{
	   $('#content-slider').cycle({
	      fx: 'fade'
	   });
	});
	</script>
        <title>Al-Sav Coffee</title>
</head>

<body>
<div class="content">
		<div class="text-content1">Fresh Coffee To Drink</div> 
			<div id="content-slider" class="imghome1">
			   <img src="images/intro.jpg" alt="Slideshow 1" />
			   <img src="images/intro2.jpg" alt="Slideshow 2" />
			   <img src="images/intro3.jpg" alt="Slideshow 3" />
			</div>
		<p class="text-content2">Every cup of our quality artisan coffee starts with locally sourced, hand picked ingredients. Once you try it, our coffee will be a blissful addition to your everyday morning routine - we guarantee it!</p>
		</div>

	<div class="quotes">
            <marquee scrollamount=16>
                <p>
                    "Adventure in life is good; consistency in coffee even better" (Justina Chen). "Just coffee. Black—like my soul" (Cassandra Clare). "Coffee and chocolate—the inventor of mocha should be sainted" (Cherise Sinclair).
                </p>
            </marquee>
        </div>
</body>
<%@include file="Footer.jsp" %>