package br.com.heroesofoop.main;

import java.util.Random;
import java.util.Scanner;

import br.com.heroesofoop.model.Arqueiro;
import br.com.heroesofoop.model.Dragao;
import br.com.heroesofoop.model.Guerreiro;
import br.com.heroesofoop.model.Mago;
import br.com.heroesofoop.model.Personagem;


public class Menu {

	private int qtdPersonagens = 0;	
	
	Personagem[] personagens = new Personagem[3];
	
	
	public static void main(String[] args) {

		Menu menu = new Menu();

		menu.exibirMenu();

		
		
		
		
		
		
		
		
		
	
		
	}

	public void exibirMenu(){

		Scanner s = new Scanner(System.in);

			

		System.out.println("Olá viajante, Bem vindo ao mundo de heroes of OOP, por favor, selecione uma opção: \n");
		System.out.println("1: Criação de personagem\n"
				+ "2: Iniciar Partida\n"	
				+ "3: Sair do jogo\n");
		
		int selecao = s.nextInt();
		while(selecao != 1 && selecao != 2 && selecao != 3) {
			System.out.println("É necessário inserir uma opção válida para prosseguir: ");
			selecao = s.nextInt();
		}
		switch(selecao){
			case 1: 

			if(qtdPersonagens == 3){
				System.out.println("Não é permitido criar mais do que 3 personagens!");
				exibirMenu();
			}else {
				System.out.println("Por favor, selecione um personagem: \n");
				System.out.println("1: Guerreiro - 30Atk | 20Def | 180Pvd\n"
				+  "2: Mago - 20Atk | 10Def | 200Pvd\n"
				+ "3: Arqueiro - 20Atk | 30Def | 160Pvd\n"
				);

				int selecao_personagem = s.nextInt();
				while(selecao_personagem != 1 & selecao_personagem != 2 & selecao_personagem !=3){
					System.out.println("Erro! selecione uma opção válida: ");
					selecao_personagem = s.nextInt();
				}
				switch(selecao_personagem){

					case 1:

					System.out.println("Selecione uma Arma: \n"
					+ "1: Espada - +10Atk | +15Def \n"
					+ "2: Machado - +17Atk | +8Def \n"
					);
					int selecao_arma = s.nextInt();
					while(selecao_arma != 1 & selecao_arma != 2){
						System.out.println("Erro! selecione uma opção válida: ");
						selecao_arma = s.nextInt();
					}

					System.out.println("Digite o nome do personagem: ");
					String nome_personagem = s.next();

					Personagem guerreiro = new Guerreiro(nome_personagem, 30, 20, 180);
					
					personagens[qtdPersonagens] = guerreiro;
					qtdPersonagens++;
					
					 
					guerreiro.escolher_arma(selecao_arma);
					System.out.println("Personagem criado!\n\n");
					
					
					System.out.println("Quantidade de personagens criados: " + qtdPersonagens);
					exibirMenu();
					break;

					case 2: 
					System.out.println("Selecione uma Arma: \n"
					+ "1: Varinha - +16Atk | +9Def \n"
					+ "2: Cajado - +13Atk | +12Def \n"
					);
					selecao_arma = s.nextInt();
					while(selecao_arma != 1 & selecao_arma != 2){
						System.out.println("Erro! selecione uma opção válida: ");
						selecao_arma = s.nextInt();
					}


					System.out.println("Digite o nome do personagem: ");
					nome_personagem = s.next();

					Personagem mago = new Mago(nome_personagem, 20, 10, 200);
					mago.escolher_arma(selecao_arma);

					System.out.println("Personagem criado!\n\n");
					
					
					personagens[qtdPersonagens] = mago;
					qtdPersonagens++;
					
					System.out.println("Quantidade de personagens criados: " + qtdPersonagens);
					exibirMenu();
					break;

					case 3:
					System.out.println("Selecione uma Arma: \n"
					+ "1: Arco Longo - +12Atk | +13Def \n"
					+ "2: Balestra - +15Atk | +10Def \n"
					);

					selecao_arma = s.nextInt();
					while(selecao_arma != 1 & selecao_arma != 2){
						System.out.println("Erro! selecione uma opção válida: ");
						selecao_arma = s.nextInt();
					}

					System.out.println("Digite o nome do personagem: ");
					nome_personagem = s.next();

					Personagem arqueiro = new Arqueiro(nome_personagem, 30, 20, 180); 
					arqueiro.escolher_arma(selecao_arma);
					System.out.println("Personagem criado!\n\n");
					
					
					personagens[qtdPersonagens] = arqueiro;
					qtdPersonagens++;
					
					System.out.println("Quantidade de personagens criados: " + qtdPersonagens);
					exibirMenu();
					break;
				}
			}
			break;

			

			case 2:
			if(qtdPersonagens == 0){
				System.out.println("Você precisa criar ao menos 1 personagem para jogar o jogo!(são Permitidos apenas 3 personagens por partida)\n");
				exibirMenu();
			}else {
				InicioPartida();
				
			}
			case 3: 
				System.exit(0);
				break;
			

		}
	}
	
public void InicioPartida() {
	
		System.out.println(personagens.length + " personagens");
	
		
		Dragao dragao = new Dragao("LazyProg", 60, 30, 300);
		
		Scanner s = new Scanner(System.in);
		
		Random random = new Random();
		
		int rodada = 0;
		
		while(dragao.getPvd()>=0 && (personagens.length!=0)){
			rodada++;
			for(int i = 0; i < qtdPersonagens; i++) {
					if(personagens[i].getPvd() > 0) {
						System.out.println("1-atacar");
						System.out.println("2-defender\n\n");
						System.out.println(" Selecione uma opção para " + personagens[i].getNome() + ": " );
						int selecao = s.nextInt();
						while (selecao != 1 && selecao !=2) {
							System.out.println("É necessário inserir uma opção válida para prosseguir: ");
							selecao = s.nextInt();
						}
						if(selecao == 1) {
							dragao.setPvd(dragao.getPvd()-(personagens[i].atacar()-dragao.getDefesa()));
							System.out.println(personagens[i].getNome() + " Atacou! \nVida do Dragão após ataque é: "  + dragao.getPvd());
						}else {
							System.out.println("Não implementado!");
							dragao.setPvd(dragao.getPvd()-(personagens[i].atacar()-dragao.getDefesa()));
							System.out.println(personagens[i].getNome() + "Atacou! \nVida do Dragão após ataque é: "  + dragao.getPvd());
						}
					}
				}
				
			 		int personagemAtacado = random.nextInt(personagens.length);
				if(dragao.getPvd()>0 && personagens[personagemAtacado].getPvd() > 0) {
					
						personagens[personagemAtacado].setPvd(personagens[personagemAtacado].getPvd() - (dragao.getAtaque())- personagens[personagemAtacado].getDefesa()); 
						
						System.out.println(personagens[personagemAtacado].getNome() + " foi atacado, vida restante: " + personagens[personagemAtacado].getPvd());
						
					}
				if(dragao.getPvd() <= 0) {
					System.out.println("VOCÊ MATOU O DRAGÃO!");
					exibirMenu();
				}else if(personagens[personagemAtacado].getPvd() <= 0) {
					System.out.println("VOCÊ PERDEU!");
					exibirMenu();
				}			
			}
		}
}



				
				

