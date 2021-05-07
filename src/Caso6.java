import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre = "", rpta = "S", estado = "";
		int edad = 0, num_reg = 0, n_aptos = 0;
		
		while(rpta.equals("S") || rpta.equals("s")) {
			num_reg++;
			System.out.println("Registro");
			
			System.out.print("Nombre.....: ");
			nombre = sc.nextLine();
			System.out.print("Edad.......: ");
			edad = sc.nextInt();
			
			if (edad >=18) {
				estado = "Apto para votar";
				n_aptos++;
			}	
			else
				estado = "Menor de edad";
			
			System.out.println("Estado.......: " + estado);
			sc.nextLine();
			
			System.out.print("¿Desea registrar a mas participantes? (S/N): ");
			rpta = sc.nextLine();

		}
		
		System.out.println("R E S U M E N");
		System.out.println("Participantes registrados.....: "+ num_reg);
		System.out.println("Aptos para votar..............: "+ n_aptos);
	}

}
