package fineasy;

public class Categoria extends Entrada{
	
	//Atributos
	private int id;
	private String nomeDaCategoria;
	private int gastoDaCategoria;
	
	
	public Categoria() {
		
	}
	
	//Cadastra uma nova categoria de entradas
	public void setCategoriaDeEntrada(String nomeDaCategoria) {
		this.nomeDaCategoria = nomeDaCategoria;
		for(int i=0; i < this.categoriaDeEntrada.size(); i++) {
			if(nomeDaCategoria == this.categoriaDeEntrada.get(i)){
				System.out.println("A categoria digitada já existe.");
			}
		}
		categoriaDeEntrada.add(nomeDaCategoria);
		
	}
	
	//Cadastra uma nova categoria de gasto
	public void setCategoriaDeGasto(String nomeDaCategoria) {
		this.nomeDaCategoria = nomeDaCategoria;
		for(int i=0; i < this.categoriaDeGasto.size(); i++) {
			if(nomeDaCategoria == this.categoriaDeGasto.get(i)){
				System.out.println("A categoria digitada já existe.");
			}
		}
		categoriaDeGasto.add(nomeDaCategoria);
		
	}
	
	//Getters e Settes
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDaCategoria() {
		return nomeDaCategoria;
	}

	public void setNomeDaCategoria(String nomeDaCategoria) {
		this.nomeDaCategoria = nomeDaCategoria;
	}

	public int getGastoDaCategoria() {
		return gastoDaCategoria;
	}

	public void setGastoDaCategoria(int gastoDaCategoria) {
		this.gastoDaCategoria = gastoDaCategoria;
	}
	
	public void getCategoriaDeEntrada() {
		System.out.println(categoriaDeEntrada);
	}
	public void getCategoriaDeGasto() {
		System.out.println(categoriaDeGasto);
	}
}
