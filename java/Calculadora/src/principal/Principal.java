package principal;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int opcion=0;
		double resul=0.0, num1=0.0, num2=0.0;
		
		
		
		do {
			System.out.println("Bienvenido a la calculadora");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			
			
			opcion=Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el primer valor);
				resul=num1+num2;
				System.out.println(resul);
				break;
			case 2:
				resul=num1-num2;
				System.out.println(resul);
				break;
			case 3:
				resul=num1*num2;
				System.out.println(resul);
				break;
			case 4:
				resul=num1/num2;
				System.out.println(resul);
				break;
			default:
				System.out.println("Error");
				break;
			case 0:
				break;
			}
			
		} while (opcion!=0);

	}

}
