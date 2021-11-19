package br.com.heroesofoop.model;

public class Dragao extends Personagem {

	public Dragao(String nome, int ataque, double defesa, int pvd) {
		super(nome, ataque, defesa, pvd);
	}
	
	@Override
	public int atacar() {
		int resultado = super.getAtaque();
		return resultado;
	}

	
}
