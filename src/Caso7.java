import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre.....: ");
		String nombre = sc.nextLine();
		
		System.out.println("Forma ascendente");
		
		for (int x = 1; x <=10; x++)
			System.out.println(x + ".- Bievenido(a)" + nombre + " al curso.");
		
		System.out.println("Forma descendente");
		for (int i = 10; i > 0; i -=2)
			System.out.println(i);

	}

}
