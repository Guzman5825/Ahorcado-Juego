package Main;

import ModoJuego.*;
import entrada.*;
import objetos.CajaPalabras;

public class Juego {
	private CajaPalabras cajaPalabras=new CajaPalabras();
	private ModoJuego modoJuego;
	
	static private char SALIR='X';
	
	public void cargarDatos() {
		cajaPalabras.cargarDatos();
	}

	public void iniciar() {
		char opcion='\0';
		do {
			System.out.println("Elijir modo Juego");
			System.out.println("1)PARTIDA RAPIDA");
			System.out.println("2)SIN LIMITE");
			System.out.println("X)salir");
			System.out.print("opcion:");
			opcion=Teclado.obtenerCaracter();
			
			switch (opcion) {
            case '1':
            	modoJuego=new PartidaRapida(cajaPalabras.obtenerPalabraRamdon());
            	System.out.println("MODO PARTIDA RAPIDA, enter para continuar");
                break;
            case '2':
            	modoJuego=new SinLimites();	//falta terminar
                System.out.println("MODO SIN LIMITE, enter para continuar");
                break;
            case 'X':
                System.out.println("SALIENDO DEL MENU...");
                break;
            default:
                System.out.println("dato invalido");
			}
			
			if(SALIR!=opcion)
				modoJuego.iniciar();
			
		}while(SALIR!=opcion);
		
		
		
	}

}
