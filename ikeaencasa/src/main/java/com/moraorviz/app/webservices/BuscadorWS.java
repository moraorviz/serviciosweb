package com.moraorviz.app.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.moraorviz.app.webservices.IBuscadorWS")
public class BuscadorWS implements IBuscadorWS {
	
	public static List<Mueble> mockInventario = new ArrayList<>();
	
	// TODO structure better the mock testing data (hard-coded data)
	// TODO resource for a better placement of this kind of data
	public BuscadorWS() {
		mockInventario.add(new Mueble("mueble", "LACK", 59));
		mockInventario.add(new Mueble("mueble", "BYAS", 69));
		mockInventario.add(new Mueble("cambiador", "SNIGLAR", 25));
		mockInventario.add(new Mueble("cuna", "SNIGLAR", 49));
		mockInventario.add(new Mueble("sillon orejero", "STRANDMON", 179));
		mockInventario.add(new Mueble("almohada firmeza media", "ROSENSTJARNA", 10));
		mockInventario.add(new Mueble("almohada viscoelastica", "MANVIVA", 29.99));
		mockInventario.add(new Mueble("foco triple con base", "VITEMOLLA", 49.99));
		mockInventario.add(new Mueble("lampara de pared", "LILLHOLMEN", 16.99));
	}
	
	public double search(String tipo, String nombre) {
		// TODO Auto-generated method stub
		for (Mueble m: mockInventario) {
			if (m.tipo.contentEquals(tipo) && m.nombre.contentEquals(nombre)) {
				return m.precio;
			}
		}
		return 0;
	}
}
