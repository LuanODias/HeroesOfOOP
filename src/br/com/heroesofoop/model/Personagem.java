package br.com.heroesofoop.model;

public class Personagem {

	private String nome;
	
	private int ataque;
	private double defesa;
	private double pvd;
	protected Arma arma;
	

	public Personagem(String nome, int ataque, double defesa, double pvd) {
		super();
		this.nome = nome;
		this.ataque = ataque;
		this.defesa = defesa;
		this.pvd = pvd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAtaque() {
		return ataque;
	}
	
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	
	public double getDefesa() {
		return defesa;
	}
	
	public double setDefesa(double defesa) {
		return this.defesa = defesa;
	}
	
	public double getPvd() {
		return pvd;
	}
	
	public void setPvd(double pvd) {
		this.pvd = pvd;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public int atacar() {
		return 0;
	}
	
	public double defender() {
		return 0;
	}

	public int escolher_arma(int arma){
		return 0;
	}
	
	
	

	
	
}
