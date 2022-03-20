package com.tcs.poc.welcomefile.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(Exception.class)
    public void handleException(HttpServletResponse response,HttpServletRequest request, Exception e) throws IOException   {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		if (status != null) {
	        Integer statusCode = Integer.valueOf(status.toString());
	     
	        if(statusCode == HttpStatus.NOT_FOUND.value()) {
	        	response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	            response.getWriter().write("404 error mesage");
	        }
	        else if(statusCode == HttpStatus.UNAUTHORIZED.value()) {
	        	response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	            response.getWriter().write("401 error mesage");
	        }
	        else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
	        	response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	            response.getWriter().write("500 error mesage");
	        }
	        else{
	        	response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	            response.getWriter().write("404 error mesage");
	        }
	    }
		else
		{
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	        response.getWriter().write("404 error mesage");
		}	
		//return new ModelAndView("errorPage","message",jsonObject);
    }
}
