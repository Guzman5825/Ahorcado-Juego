package ElEdy.Clases;

import ElEdy.Clases.ModoJuego;

import java.util.Scanner;

public class Juego {
    private ModoJuego mj;
    private CajaPalabra cp;

    public Juego(){
        System.out.println("Ingrese el modo de juego:");
        Scanner scan=new Scanner(System.in);
        int op=scan.nextInt();
        if(op==1){
            PartidaRapida.start;
        } else if(!op) {
            SinLimite.start;
        }else
            System.out.println("Nos vemos mañana");


    }
    public void cargar(){

    }
    public void iniciar(){

    }
}