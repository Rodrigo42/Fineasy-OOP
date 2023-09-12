package fineasy;

public class Gasto extends Conta {

	//Atributos	
	private int id;
	private int saldoDeGasto;


	public Gasto() {
		super();
	}
	
	
	/*Insere um novo gasto atrelado a categoria.
	Verifica se a categoria existe no sistema.
	Verifica se a conta chegou no negativo.
	*/
	public void setGasto(int valor, String categoria) {
		boolean i = false;
		for (String element : this.categoriaDeGasto) {
			if(categoria == element){
				i = true;
			}
		}

		if(i == true){

			this.saldoDeGasto -= valor;
			gasto -= valor;
			saldo = saldo - valor;
			System.out.println("Gasto de " + valor + " registrado na categoria " + categoria + ".");

			if(saldo < 0) {
				System.out.println("Seu saldo está negativo.");

				
			}
			return;
		}
			else{
				System.out.println("A categoria digitada não existe.");
			}



	}



	//Getters e Settes
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSaldoDeGasto() {
		return saldoDeGasto;
	}



}
