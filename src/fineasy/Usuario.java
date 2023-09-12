package fineasy;



public class Usuario extends Categoria{
	//Atributos

	private int id;
	private String nome;
	private String dataDeNascimento;
	private int telefone;
	private String email;
	private String senha;
	
	//Construtores
	public Usuario() {
		super();
	}
	
	
	public Usuario(int id, String nome, String dataDeNascimento, int telefone, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}
	
	
	//Getters e Settes
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//Cadastra uma conta
	public void cadastrarConta(int id, String nomeDaConta, int saldo) {
		this.setId(id);
		this.nomeDaConta = nomeDaConta;
		this.saldo = saldo;
		
			
	}
	
	public void excluirConta() {
		this.setId(0);
		this.nomeDaConta = null;
		this.saldo = 0;
	}
}
	
	
	

