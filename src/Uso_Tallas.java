import java.util.*;
public class Uso_Tallas {

//		enum Talla {Mini, Mediano, Grande,Muy_Grande};
		

	enum Talla{		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");		
		private Talla (String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String dameAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
	}
	

	
	public static void main(String[] args) {
			//Tipos enumerados
/*			 String Talla;
			 
			 Talla = "Pequeña";
			 Talla = "Mediana";
			 
			 Talla = "Azul";
			 
			 //El asignar un valor distinto a la variable es posible, pero no es lógico.
*/			 
/*			Talla s = Talla.Mini;
			Talla m = Talla.Mediano;
			Talla l = Talla.Grande;
			Talla xl = Talla.Muy_Grande;
*/			
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
			
		System.out.println("Talla = " + la_talla);
		
		System.out.println("Abreviatura = " + la_talla.abreviatura);
		}
}
