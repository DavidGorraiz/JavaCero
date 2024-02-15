import java.util.Scanner;
public class Switch{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Menu");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: multiplicacion");
		System.out.println("4: divicion");
		int parametro = sc.nextInt();

		
		System.out.println("Digita dos numeros para la operacion");
		int num_uno = sc.nextInt(), 
		num_dos = sc.nextInt(), 
		resultado = 0;
		
		switch(parametro){

			case 1:
				resultado = num_uno + num_dos;
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case 2:
				resultado = num_uno - num_dos;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case 3:
				resultado = num_uno * num_dos;
				System.out.println("El resultado de la multiplicacion es: " + resultado);
				break;
			case 4:
				resultado = num_uno / num_dos;
				System.out.println("El resultado de la divicion es: " + resultado);
				break;
			default:
				System.out.println("Error!, la opcion no existe.");
				break;
		}
	}
}