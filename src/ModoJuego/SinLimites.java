package ModoJuego;

import entrada.Teclado;
import objetos.CajaPalabras;
import objetos.PalabraSecreta;

public class SinLimites implements ModoJuego{

	private CajaPalabras cajaPalabras;
	private int cantidadVida;
	
	public SinLimites(CajaPalabras cajaPalabras) {
		this.cajaPalabras=cajaPalabras;
		cantidadVida=5;
	}
	
	@Override
	public void iniciar() {
		int cantidadPalabrasSuperadas=0;
		char letra;
		PalabraSecreta palabraSecreta=new PalabraSecreta(cajaPalabras.obtenerPalabraRamdon());
		
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
			
			if(palabraSecreta.estaCompleta()){
				System.out.println("palabra superada , ingresando nueva palabra...");
				palabraSecreta.ingresarNuevaPalabra(cajaPalabras.obtenerPalabraRamdon());
				cantidadPalabrasSuperadas++;
			}
			
		}
		
		System.out.println(" juego terminado, cantidad superado :" + cantidadPalabrasSuperadas);
			
	}
	
	private boolean juegoTerminado() {
		return cantidadVida<=0;
	}

}
