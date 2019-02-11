package com.moraorviz.app.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface IBuscadorWS {

	@WebMethod
	public double search(String tipo, String nombre);
	
}
