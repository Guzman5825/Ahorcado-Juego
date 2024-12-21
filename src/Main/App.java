package Main;

import objetos.PalabraSecreta;

public class App {

	public static void main(String[] args) {
		Juego juego= new Juego();
		juego.cargarDatos();
		juego.iniciar();
		System.out.println("SALIENDO DE LA APLICACION...");
	}

}
