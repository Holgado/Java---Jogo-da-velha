package Grade;

import Jogador.Jogador;

public class GradeJogo {
	public char mat[][] = new char[3][3];
	
	public GradeJogo() {
		for (int i = 0; i < 3; i++ ) {
			for (int j = 0; j < 3; j++ ) {
				mat[i][j] = ' ';	// Se tiver um 1 a pos esta sendo usada;
			}
		}
	}
	//recebe jogada
	public void recebeJogada(Posicao pos, Jogador p) {
		if (p.getTipo() == 'x') {
			this.mat[pos.getX()][pos.getY()] = 'x';
		} else {
			this.mat[pos.getX()][pos.getY()] = 'o';
		}
	}
	
	public boolean verificaVencedor() {
		// LINHA
		if (mat[0][0] == 'x' && mat[0][1] == 'x' && mat[0][2] == 'x') {
			System.out.println("Jogador x ganhou na linha 1");
			return true;
		}
		else if (mat[1][0] == 'x' && mat[1][1] == 'x' && mat[1][2] == 'x') {
			System.out.println("Jogador x ganhou na linha 2");
			return true;
		}
		else if (mat[2][0] == 'x' && mat[2][1] == 'x' && mat[2][2] == 'x') {
			System.out.println("Jogador x ganhou na linha 3");
			return true;
		}
		//COLUNA
		else if (mat[0][0] == 'x' && mat[1][0] == 'x' && mat[2][0] == 'x') {
			System.out.println("Jogador x ganhou na coluna 1");
			return true;
		}
		else if (mat[0][1] == 'x' && mat[1][1] == 'x' && mat[2][1] == 'x') {
			System.out.println("Jogador x ganhou na coluna 2");
			return true;
		}
		else if (mat[0][2] == 'x' && mat[1][2] == 'x' && mat[2][2] == 'x') {
			System.out.println("Jogador x ganhou na coluna 3");
			return true;
		}
		else if (mat[0][0] == 'x' && mat[1][1] == 'x' && mat[2][2] == 'x') {
			System.out.println("Jogador x ganhou na diagonal");
			return true;
		}
		else if (mat[0][2] == 'x' && mat[1][1] == 'x' && mat[2][0] == 'x') {
			System.out.println("Jogador x ganhou na diagonal");
			return true;
		}
		// Jogador O
		if (mat[0][0] == 'o' && mat[0][1] == 'o' && mat[0][2] == 'o') {
			System.out.println("Jogador o ganhou na linha 1");
			return true;
		}
		else if (mat[1][0] == 'o' && mat[1][1] == 'o' && mat[1][2] == 'o') {
			System.out.println("Jogador o ganhou na linha 2");
			return true;
		}
		else if (mat[2][0] == 'o' && mat[2][1] == 'o' && mat[2][2] == 'o') {
			System.out.println("Jogador o ganhou na linha 3");
			return true;
		}
		//COLUNA
		else if (mat[0][0] == 'o' && mat[1][0] == 'o' && mat[2][0] == 'o') {
			System.out.println("Jogador o ganhou na coluna 1");
			return true;
		}
		else if (mat[0][1] == 'o' && mat[1][1] == 'o' && mat[2][1] == 'o') {
			System.out.println("Jogador o ganhou na coluna 2");
			return true;
		}
		else if (mat[0][2] == 'o' && mat[1][2] == 'o' && mat[2][2] == 'o') {
			System.out.println("Jogador o ganhou na coluna 3");
			return true;
		}
		else if (mat[0][0] == 'o' && mat[1][1] == 'o' && mat[2][2] == 'o') {
			System.out.println("Jogador o ganhou na diagonal");
			return true;
		}
		else if (mat[0][2] == 'o' && mat[1][1] == 'o' && mat[0][2] == 'o') {
			System.out.println("Jogador o ganhou na diagonal");
			return true;
		}
		else {
			return false;
		}
	}
	public char[][] getMat() {
		return mat;
	}
	public void setMat(char[][] mat) {
		this.mat = mat;
	}
	public void printGrade () {
		for (int i = 0; i < 3; i++ ) {
			for (int j = 0; j < 3; j++ ) {
				if (j < 2) {
					System.out.print(mat[i][j] + "|");
				} else {
					System.out.print(mat[i][j]);
				}
			}
			System.out.println("");
		}
	}
}

