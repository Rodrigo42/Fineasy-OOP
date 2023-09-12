package fineasy;



public class Teste {
	public static void main (String[] args) {
		//Inicia a conta principal chamada Usuario
		Usuario x = new Usuario(01, "Maria", "24/01/1992", 965465487, "maria@maria.com", "123456");
		System.out.println("Informações do usuario: \nNome: " + x.getNome() +"\nEmail: " + x.getEmail() + "\nData de nascimento: " + x.getDataDeNascimento()+ "\n");
		
		//Metodo da classe Ususario cadastra uma Conta/carteira onde acontecem as movimentações
		x.cadastrarConta(1, "geral", 2000);
		System.out.println("Informações do conta: \nNome da conta: " + x.getNomeDaConta() +"\nSaldo: " + x.getSaldo()+ "\n");
		
		Conta c2 = new Conta(02, "secundaria", 3000);
		System.out.println("\nInformações do conta: \nId da conta: " + c2.getId() + "\nNome da conta: " + c2.getNomeDaConta() +"\nSaldo: " + c2.getSaldo()+ "\n");
		
		
		//Definindo categorias dos gastos e entradas
		x.setCategoriaDeGasto("Alimentação");
		x.setCategoriaDeGasto("Casa");
		x.setCategoriaDeGasto("Carro");
		x.setCategoriaDeEntrada("Salario");
		x.setCategoriaDeEntrada("Dividendos");
		x.setCategoriaDeGasto("Lazer");
		
		System.out.println("Categorias de Entradas: ");
		x.getCategoriaDeEntrada();
		System.out.println();
		
		System.out.println("Categorias de Gastos: ");
		x.getCategoriaDeGasto();
		System.out.println();
				
		
		//Inserindo gasto
		x.setGasto(40, "Carro");
		
		//Inserindo entrada
		x.setEntrada(200, "Salario");
	}
}
