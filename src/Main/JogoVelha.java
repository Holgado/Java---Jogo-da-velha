package Main;

import Grade.GradeJogo;
import Grade.Posicao;
import Jogador.Jogador;

import java.util.Scanner;

public class JogoVelha {

	public static void main(String arg[]) {
		Jogador p1 = new Jogador();
		Jogador p2 = new Jogador();
		char ty = ' ';
		int x = 0, y = 0;
		
		GradeJogo gr = new GradeJogo();
		Posicao pos = new Posicao();
		Scanner tipo = new Scanner(System.in);;
		
		System.out.println ("******************************************");
		System.out.println ("******* Bem-vindo ao jogo da velha *******");
		System.out.println ("******************************************");
		
		System.out.print ("Escolha o jogador 1 (x) ou (o): ");
		ty = tipo.next().charAt(0);
		
		if (ty == 'x') {
			p1.setTipo('x');
			p2.setTipo('o');
		}
		else {
			p1.setTipo('o');
			p2.setTipo('x');
		}
		gr.printGrade();
		while (true) {
			System.out.println ("Vez do jogador 1");
			System.out.print ("Escolha a posicao x: ");
			x = tipo.nextInt();
			System.out.print ("Escolha a posicao y: ");
			y = tipo.nextInt();
			pos.setX(x);
			pos.setY(y);
			p1.fazJogada(pos);
			gr.recebeJogada(pos, p1);
			if (gr.verificaVencedor()) {
				break;
			}
			System.out.println ("...");
			System.out.println ("...");
			System.out.println ("...");
			System.out.println ("...");
			gr.printGrade();
			
			System.out.println ("Vez do jogador 2");
			System.out.print ("Escolha a posicao x: ");
			x = tipo.nextInt();
			System.out.print ("Escolha a posicao y: ");
			y = tipo.nextInt();
			pos.setX(x);
			pos.setY(y);
			p2.fazJogada(pos);
			gr.recebeJogada(pos, p2);
			gr.printGrade();
			if (gr.verificaVencedor()) {
				break;
			}
		}	
		gr.printGrade();
	}
}
