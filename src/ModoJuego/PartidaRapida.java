package ModoJuego;

import entrada.Teclado;
import objetos.Mostrador;

public class PartidaRapida implements ModoJuego{
	Mostrador mostrador;
	int cantidadVida;
	
	public PartidaRapida(String palabra) {
		mostrador= new Mostrador(palabra);
	}

	@Override
	public void iniciar() {
		cantidadVida=3;
		char letra;
		while(!juegoTerminado()) {	///condicion de fin del juego
			//mostrar el juego
			System.out.println("cantidad de vidas restantes: "+cantidadVida);
			System.out.println("PALABRA:  "+mostrador.obtenerPalabraConMascara());
			System.out.print("ingrese una letra:");
			letra=Teclado.obtenerCaracter();
			if(mostrador.esLetraUtil(letra))
				mostrador.habilitarPosicion(letra);
			else
				cantidadVida--;
		}
		
		if(mostrador.estaPalabraCompleta())
			System.out.println("!!! juego ganado !!!");
		else
			System.out.println("!!! juego perdido !!!");
			
	}
	
	private boolean juegoTerminado() {
		return cantidadVida<=0 || mostrador.estaPalabraCompleta();
	}

}
