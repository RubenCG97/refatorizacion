package refactorizacion;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);

		for (int i = 1; i < 6; i++) {
			if (nota >= 5) {
				alumap++;
				System.out.println("Introduzca la nota del siguiente alumno: ");
				nota = sc.nextInt();
			} else if (nota == 4) {
				alumcon++;
				System.out.println("Introduzca la nota del siguiente alumno: ");
				nota = sc.nextInt();
			} else if (nota < 4) {
				alumsus++;
				System.out.println("Introduzca la nota del siguiente alumno: ");
				nota = sc.nextInt();
			}

		}
		if (alumsus >= 0)
			System.out.println("Hay alumnos " + alumsus + " suspensos.");
		if (alumcon >= 0)
			System.out.println("Hay alumnos " + alumcon + " condicionados.");
		if (alumap >= 0)
			System.out.println("Hay alumnos " + alumap + " aprobados.");
		sc.close();
	}
}
