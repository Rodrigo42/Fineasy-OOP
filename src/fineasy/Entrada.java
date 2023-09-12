package fineasy;

public class Entrada extends Gasto{
	
	//Atributos
	private int id;
	private int saldoDeEntrada;


	public Entrada() {
		super();
	}
	
	//Insere nova entrada atrelada a categoria.
	//Verifica se a categoria existe no sistema.
	public void setEntrada(int valor, String categoria) {
		boolean i = false;
		for (String element : this.categoriaDeEntrada) {
			if(categoria == element){
				i = true;
			}
		}
		if(i == true) {
			this.saldoDeEntrada += valor;
			entrada += valor;
			saldo = saldo + valor;
			System.out.println("Entrada de " + valor + " registrada na categoria " + categoria + ".");
			return;
		}
		else {
			System.out.println("A categoria digitada não existe.");
			return;
		}

	}
	
	//Getters e Settes
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSaldoDeEntrada() {
		return saldoDeEntrada;
	}

	public void setSaldoDeEntrada(int saldoDeEntrada) {
		this.saldoDeEntrada = saldoDeEntrada;
	}

	
}
