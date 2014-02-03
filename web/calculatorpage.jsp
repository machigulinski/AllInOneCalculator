<%-- 
    Document   : calculatorpage
    Created on : Feb 2, 2014, 12:13:17 AM
    Author     : Machi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>area calculator</title>
	
	<style>
	    
	    body {
		font-family: Helvetica, Verdana, sans-serif;
		padding: 0; 
		margin: 0;
		
	    }
		
	    #container {
		border: 1px solid darkslategray;
		margin: 3em;
		padding: 2em 4em;
		width: 60%;
		background: gainsboro;
		}
		  
	    #container h1 {
		text-transform: uppercase;	    
		    
		}
	    form {float: left;}
	    
	    img {float: left; width: 20em; height: auto; margin: 2em 2em 2em 4em;}
	    
	    .result {color: darkgreen;}
	    
	    
	</style>
	
    </head>
    <body>
	
	<div id="container">
	    <h1>All - in - one  calculator</h1>

	    <form id="rectangleForm" name="rectangleForm" method="post" action="area?calcType=rectangle">

		<h2>Rectangle area calculator</h2>
		    <p class="form_fields">
		       <label for="length" class="input_label">ENTER LENGTH:</label>
		       <input type="text" name="length" id="length" value="" />
		    </p>  

		    <p class="form_fields">
		       <label for="name" class="input_label">ENTER WIDTH:</label>
		       <input type="text" name="width" id="width" value="" />
		    </p>

		    <p>
			<label for=unit1" class="input_label">Select Unit: </label>
			<select id="unit1" name="unit1" size ="1">
			    <option value="inches"> inches </option>
			    <option value="feet"> feet </option>
			    <option value="yards"> yards </option>
			    <option value="centimeters">centimeters</option>
			    <option value="meters">meters</option>
			</select>

		    </p> 
		    <p>
			<input type="submit" name="calc_btn" id="calc_btn" value="CALCULATE" />
		    </p>
	     </form>

		<%
		    String result = "";		
		    Object calculation = request.getAttribute("area1");
		    result = calculation == null ? result : calculation.toString();   

		%>
		
		<img id="rectimg" src="Images/area-rectangle.png" alt="rectangle"/>
		
		<div style="clear: both;"></div>

		<h2 class="result"><%= result %></h2>
		
		 <br>

		<form id="triangleForm" name="triangleForm" method="post" action="area?calcType=triangle">

		<h2>Triangle area calculator</h2>
		    <p class="form_fields">
		       <label for="width" class="input_label">SIDE A: </label>
		       <input type="text" name="sideA" id="sideA" value="" />
		    </p>  

		    <p class="form_fields">
		       <label for="name" class="input_label">SIDE B: </label>
		       <input type="text" name="sideB" id="sideB" value="" />

		    </p> 

		    <p class="form_fields">
		       <label for="name" class="input_label">SIDE C: </label>
		       <input type="text" name="sideC" id="sideC" value="" />

		    </p> 
		    <p>
			<label for="unit2" class="input_label">Select Unit: </label>
			<select id="unit2" name="unit2" size ="1">
			    <option value="inches"> inches </option>
			    <option value="feet"> feet </option>
			    <option value="yards"> yards </option>
			    <option value="centimeters">centimeters</option>
			    <option value="meters">meters</option>
			</select>

		    </p> 
		    <p>
			<input type="submit" name="calc_btn" id="calc_btn" value="CALCULATE" />
		    </p>
	     </form>

		<%
		    result = "";		
		    calculation = request.getAttribute("area2");
		    result = calculation == null ? result : calculation.toString();
		%>
		
		<img id="triangleimg" src="Images/herons-formula-icon.png" alt="triangle"/>
		<div style="clear: both;"></div>

		<h2 class="result"><%= result %></h2>
		
		 <br>

		 <form id="circleForm" name="circleForm" method="post" action="area?calcType=circle">

		<h2>Circle area calculator</h2>
		    <p class="form_fields">
		       <label for="width" class="input_label">ENTER RADIUS: </label>
		       <input type="text" name="radius" id="radius" value="" />
		    </p>  

		    <p>
			<label for="unit3" class="input_label">Select Unit: </label>
			<select id="unit3" name="unit3" size ="1">
			    <option value="inches"> inches </option>
			    <option value="feet"> feet </option>
			    <option value="yards"> yards </option>
			    <option value="centimeters">centimeters</option>
			    <option value="meters">meters</option>
			</select>

		    </p> 
		    <p>
			<input type="submit" name="calc_btn" id="calc_btn" value="CALCULATE" />
		    </p>
	     </form>

		<%
		    result = "";		
		    calculation = request.getAttribute("area3");
		    result = calculation == null ? result : calculation.toString();   

		%>
		<img id="circimg" src="Images/area-circle.png" alt="circle"/>
		
		<div style="clear: both;"></div>
		<h2 class="result"><%= result %></h2>
		
				
	</div> <!-- end of #container-->

	
    </body>
</html>
