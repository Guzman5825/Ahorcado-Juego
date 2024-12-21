package objetos;

public class PalabraSecreta {
	//el mostrador sirve para mostrar
	String palabraSecreta;
	boolean [] mascara;
	
	public PalabraSecreta(String palabraSecreta) {
		this.palabraSecreta=palabraSecreta;
		this.mascara = new boolean[palabraSecreta.length()];
	}
	
	public void ingresarNuevaPalabra(String palabraSecreta){
		this.palabraSecreta=palabraSecreta;
		this.mascara = new boolean[palabraSecreta.length()];
	}
	
	public void limpiar(){
		for (int i = 0; i < mascara.length; i++) 
			mascara[i]=false;
	}
	
	public String obtenerPalabraConMascara(){
		String palabra="";
		for (int i = 0; i < mascara.length; i++)  {
			if(mascara[i]==true)
				palabra+=palabraSecreta.charAt(i);
			else
				palabra+="-";
		}
		
		return palabra;

	}
	
	public void habilitarPosicion(char letra) {
		for (int i = 0; i < palabraSecreta.length(); i++) 
			if(palabraSecreta.charAt(i)==letra)
				mascara[i]=true;
	}
	
	public boolean esLetraUtil(char letra) {
		for (int i = 0; i < palabraSecreta.length(); i++) 
			if(palabraSecreta.charAt(i)==letra)
				if(mascara[i]==false)
					return true;
		return false;
	}
	

	public boolean estaCompleta() {
		for (int i = 0; i < palabraSecreta.length(); i++) 
			if(mascara[i]==false)
				return false;
		return true;
	}

		
}
