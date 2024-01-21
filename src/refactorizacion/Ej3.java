package refactorizacion;

import java.util.Scanner;

public class Ej3 {
	
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Introduzca el primer número: ");
		int n1 = scanner.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int n2 = scanner.nextInt();

		if (n1 != n2) {
			if (n1 > n2) {
				System.out.println("El numero" + n1 + "es mayor");
			}else{
				System.out.println("El numero" + n2 + "es mayor");
			}
		} else if (n1 == n2) {
			System.out.println("Son iguales");
		}
	}
}
