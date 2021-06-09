import java.util.Random;
import java.util.Scanner;

public class Ejercicio1{

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		System.out.println("\nIngresa la cantidad de ciclos que se haran");
		int n = scanner.nextInt();
		for (int i = 0; i < n;i++){
			int aleatorio = 1+random.nextInt(100);
			if ((aleatorio % 2) == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Se encontraron " + pares + " pares y " + impares + " impares");
	}
}