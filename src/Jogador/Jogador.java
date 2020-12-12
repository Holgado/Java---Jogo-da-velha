package Jogador;

import Grade.Posicao;

public class Jogador {
	private char tipo;
	private int numJogadas = 0;
	private Posicao jogadas [] = new Posicao[3];
	
	
	public Jogador() {}
	
	public Jogador(char tipo, int numJogadas, Posicao[] jogadas) {
		super();
		this.tipo = tipo;
		this.numJogadas = numJogadas;
		this.jogadas = jogadas;
	}

	// recebe uma posicao do jogador e coloca na grade
	public void fazJogada (Posicao pos) {
		jogadas [numJogadas++] = pos;
	}
	public Posicao[] getJogadas() {
		return jogadas;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
}
