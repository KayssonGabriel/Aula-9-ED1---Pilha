package pilha;

import java.util.Arrays;

public class PilhaChar {
	private char[] pilha = new char[200];
	private int tamanho;

	void push(char letra) {
		if (tamanho == pilha.length) {
			pilha = Arrays.copyOf(pilha, pilha.length * 2);
		}
		pilha[tamanho++] = letra;
	}

	boolean isEmpty() {
		return tamanho == 0;
	}

	char pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Pilha vazia");
		}
		return pilha[--tamanho];
	}
}
