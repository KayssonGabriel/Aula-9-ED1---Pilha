package pilha;

public class PilhaChar {
	char[] pilha = new char[200];
	char[] palavra = new char[200];
	int topopilha = -1;

	void esvaziePilha() {
		this.topopilha = -1;
	}

	int tamanho() {
		return (this.topopilha + 1);
	}

	void imprimir(int topo) {
		for (int i = topo; i > 0; i--) {
			System.out.print(this.pilha[i]);
		}
	}

	int push(int topo, char letras) {
		this.topopilha = topo;
		this.topopilha++;

		if (this.topopilha < 0) {
			this.topopilha = 0;
		}

		if (this.topopilha > 199) {
			System.out.println("Estouro de pilha, Erro: -999");
			return (this.topopilha--);
		} else {
			this.pilha[this.topopilha] = letras;
			// System.out.print(letras);
			return (this.topopilha);
		}
	}

	char pop(int topo) {
		this.topopilha = topo;
		this.topopilha--;

		if (this.topopilha < -1) {
			System.out.println("Pilha vazia!!! Erro..: -997");
			return ('b');
		} else {
			System.out.println("Retirando o valor ..: " + this.pilha[this.topopilha + 1]);
			return (this.pilha[this.topopilha + 1]);
		}

	}

	char top(int topo) {
		this.topopilha = topo;

		if (this.topopilha < 0) {
			System.out.println("Pilha Vazia! Erro: -998");
			return ('e');
		} else {
			return (this.pilha[this.topopilha]);
		}
	}

}
