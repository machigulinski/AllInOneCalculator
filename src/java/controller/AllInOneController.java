/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AllInOneCalculatorService;
import model.GeometricShape;

/**
 *
 * @author Machi
 */
public class AllInOneController extends HttpServlet {
    private static final String RESULT_PAGE = "calculatorpage.jsp";
    private static final String CALC_TYPE = "calcType";
    private static final String RECTANGLE = "rectangle";
    private static final String TRIANGLE = "triangle";
    private static final String CIRCLE = "circle";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	
	String calcType = request.getParameter(CALC_TYPE);
	
	AllInOneCalculatorService service = new AllInOneCalculatorService();
	
	if (calcType.equalsIgnoreCase(RECTANGLE)) {	    
	    request = service.calculateAreaByShape(request, GeometricShape.RECTANGLE);  
	    request.setAttribute("area1", request.getAttribute("answer"));
	    
	} else if (calcType.equalsIgnoreCase(TRIANGLE)) {	    
	    request = service.calculateAreaByShape(request, GeometricShape.TRIANGLE);
	     request.setAttribute("area2", request.getAttribute("answer"));
	
	} else if (calcType.equalsIgnoreCase(CIRCLE)) {
	    request = service.calculateAreaByShape(request, GeometricShape.CIRCLE);
	     request.setAttribute("area3", request.getAttribute("answer"));
	}	
	
	
	
	RequestDispatcher view = request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
	return "Short description";
    }// </editor-fold>

}
