package ModoJuego;

import entrada.Teclado;
import objetos.PalabraSecreta;

public class PartidaRapida implements ModoJuego{
	PalabraSecreta palabraSecreta;
	int cantidadVida;
	
	public PartidaRapida(String palabra) {
		palabraSecreta= new PalabraSecreta(palabra);
	}

	@Override
	public void iniciar() {
		cantidadVida=3;
		char letra;
		while(!juegoTerminado()) {	///condicion de fin del juego
			//mostrar el juego
			System.out.println("cantidad de vidas restantes: "+cantidadVida);
			System.out.println("PALABRA:  "+palabraSecreta.obtenerPalabraConMascara());
			System.out.print("ingrese una letra:");
			letra=Teclado.obtenerCaracter();
			if(palabraSecreta.esLetraUtil(letra))
				palabraSecreta.habilitarPosicion(letra);
			else
				cantidadVida--;
		}
		
		if(palabraSecreta.estaCompleta())
			System.out.println("!!! juego ganado !!!");
		else
			System.out.println("!!! juego perdido !!!");
			
	}
	
	private boolean juegoTerminado() {
		return cantidadVida<=0 || palabraSecreta.estaCompleta();
	}

}
