package pilha;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int topo = 0;

		String[] text = sc.nextLine().split(" ");

		PilhaChar p1 = new PilhaChar();

		for (int i = 0; i < text.length; i++) {
			char[] letras = text[i].toCharArray();
			for (int j = 0; j < letras.length; j++) {
				topo = p1.push(topo, letras[j]);
				if (j == text[i].length() - 1) {
					p1.imprimir(topo);

					topo = 0;
					System.out.print(" ");

				}
			}

		}
		sc.close();
	}
}
