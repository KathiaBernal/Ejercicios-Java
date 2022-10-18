import java.util.Scanner; //import scanner
import java.lang.Math;

public class PracticasDatos {

	public static void main(String[] args) {
		/*
		 * 1. Escribir un programa que pregunte al usuario por el número de horas trabajadas y el coste por hora. Después debe mostrar por la pantalla la paga total que le corresponde al usuario.
		 */
		Scanner sc = new Scanner(System.in); //Objeto scanner
		float horasTrabajo;
		float costeHora;
		
		System.out.println("¿Cuántas horas trabajas?");
		horasTrabajo = sc.nextInt();
		System.out.println("¿Cuánto es el coste por hora?");
		costeHora = sc.nextFloat();
		float pagaTotal = horasTrabajo * costeHora;
		System.out.println("La paga total que te corresponde es: "+pagaTotal);
		
		/*
		 * 2. Escribir un programa que muestre por pantalla el resultado de la siguiente operación aritmética 
		 */
		double operacion = ((3.0+2.0) /(2.0*5.0));
		double operacion2 = Math.pow(operacion, 2.0);
		System.out.println(operacion2);
		
		/*
		 * 3. Escribir un programa que realice la siguiente operación aritmética:
		 * 
		 */
	double operacionDos = (3.9 + (5.5 * 2.1));
	double operacionTres = Math.pow(operacionDos, 5);
	double resultado = Math.sqrt(operacionTres);
	System.out.println(resultado);
	}

}
