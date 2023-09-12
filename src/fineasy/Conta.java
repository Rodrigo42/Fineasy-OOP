package fineasy;
import java.util.ArrayList;

public class Conta{
	
	//Atributos
	protected int id;
	protected String nomeDaConta;
	protected int saldo;
	protected int gasto;
	protected int entrada;
	protected ArrayList<String> categoriaDeGasto = new ArrayList<String>();
	protected ArrayList<String> categoriaDeEntrada = new ArrayList<String>();
	
	public Conta() {
		
	}
	
	public Conta(int id, String nomeDaConta, int saldo) {
		
		this.id = id;
		this.nomeDaConta = nomeDaConta;
		this.saldo = saldo;
		
	}
	
	//Getters e Settes
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDaConta() {
		return nomeDaConta;
	}

	public void setNomeDaConta(String nomeDaConta) {
		this.nomeDaConta = nomeDaConta;
	}

	public int getSaldo() {
		return saldo;
	}

	public int getGasto() {
		return gasto;
	}

	public int getEntrada() {
		return entrada;
	}
	
	

	
	
	
	
	
	
}
