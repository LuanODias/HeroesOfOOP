package br.com.heroesofoop.model;

public class Arqueiro extends Personagem {

	public Arqueiro(String nome, int ataque, double defesa, int pvd) {
		super(nome, ataque, defesa, pvd);
	}

	@Override
	public int atacar() {
		int resultado = super.getAtaque() + arma.getAtaque();
		return resultado;
	}
	
	@Override
	public double defender() {
		double resultado = super.getDefesa() + arma.getDefesa();
		return resultado;
	}

	@Override
	public int escolher_arma(int arma){
		if(arma == 1) {
			this.arma = new Arma(12, 13);
			return arma;
		}else if(arma == 2) {
			this.arma = new Arma(15, 10);
			return arma;
		}else{
			System.out.println("Favor selecionar uma opção válida!");
			return arma;
		}
	}
	
}
