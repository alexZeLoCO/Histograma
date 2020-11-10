import java.util.Scanner;		//IMPORTA SCANNER
public class Histograma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int n =0;		//INICIALIZA N (VOTOS)
		int a =0;		//INICIALIZA A (NÚMERO PARTIDO)
		System.out.print("Introduzca los votos a los partidos separados por espacios: ");		//SOLICITA VALOR
		do {		//HACER
			a++;		//ACTUALIZAR A
			n = teclado.nextInt();		//SOLICITA VALOR
			System.out.printf("Partido %d: ",a);		//IMPRIME PARTIDO
			for (int i=0;i<n/5000;i++) {		//PARA TANTAS VECES COMO N/5000
				System.out.print("*");		//IMPRIMIR *
			}
			System.out.println();		//SEPARADOR
			
		} while (n>=0);		//CONDICIÓN
			
	}

}
