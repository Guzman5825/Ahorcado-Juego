package objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CajaPalabras {
	List<String> palabras= new ArrayList<String>();
	
	public void cargarDatos() {
		palabras.add("escoba");
		palabras.add("escribano");
		palabras.add("externo");
		palabras.add("estimacion");
		palabras.add("externalizacion");
	}
	
	public String obtenerPalabraRamdon() {
		Random random = new Random(); 
		int indiceAleatorio = random.nextInt(palabras.size()); 
		return palabras.get(indiceAleatorio);
	}
	
}
