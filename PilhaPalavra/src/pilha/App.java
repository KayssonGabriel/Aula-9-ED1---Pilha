package pilha;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			if (!sc.hasNextLine()) {
				return;
			}
			String[] palavras = sc.nextLine().split(" ", -1);
			PilhaChar pilha = new PilhaChar();
			for (int i = 0; i < palavras.length; i++) {
				if (i > 0) {
					System.out.print(' ');
				}
				for (char letra : palavras[i].toCharArray()) {
					pilha.push(letra);
				}
				while (!pilha.isEmpty()) {
					System.out.print(pilha.pop());
				}
			}
			System.out.println();
		}
	}
}
