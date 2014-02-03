/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Machi
 */
public class AllInOneCalculatorService {
    
    private String answer;
    private double area;
    public static final double PI = 3.14;
    private static final String ERR_MSG = "Please provide numeric values!";
    public AllInOneCalculatorService() {}
    
    
    public HttpServletRequest calculateAreaByShape(HttpServletRequest request, GeometricShape shape) {
	
	switch(shape) {
	    
	    case RECTANGLE:
		String stLen = request.getParameter("length");
		String stHgh = request.getParameter("height");
		double length;
		double height;
		
		try {
		    length = Double.valueOf(stLen);
		    height = Double.valueOf(stHgh);
		    
		    area = length * height;
		    answer = String.valueOf(area);
		    
		
		} catch (NumberFormatException nfe) {
		    answer = ERR_MSG;
		}
		
		request.setAttribute("answer", answer);
		break;
		
	    case TRIANGLE:
		String stSideA = request.getParameter("sideA");
		String stSideB = request.getParameter("sideB");
		String stSideC = request.getParameter("sideC");
		
		/*
		    area is calcuated with Heron's formula		
		*/
		try {
		    double a = Double.valueOf(stSideA);
		    double b = Double.valueOf(stSideB);
		    double c = Double.valueOf(stSideC);
		    
		    double s = 0.5*(a + b + c);		    
		    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		    
		    answer = String.valueOf(area);
		    
		} catch (NumberFormatException nfe) {
		    answer = ERR_MSG;		
		}
		
		request.setAttribute("answer", answer);	    
		break;
		
	
	
	    case CIRCLE:
		String stRad = request.getParameter("radius");
		
		try {
		    double radius = Double.valueOf(stRad);
		    
		    area = PI * radius*radius;		    
		    answer = String.valueOf(area);		
		
		} catch(NumberFormatException nfe) {
		
		    answer = ERR_MSG;
		}	

		request.setAttribute("answer", answer);	    
		break;
	}	
	return request;		
    }
    
}
