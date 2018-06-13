package br.edu.unicesumar.model;

public class Equipamento {
	
	private Long nSerie;
	private String descricao;
	private boolean status;
	private Categoria categoria;
	private Fabricante fabricante;
	
	
	public Equipamento (Long nSerie, String descricao, boolean status){
		super();
		this.nSerie= nSerie;
		this.descricao = descricao;
		this.status = status;
		this.categoria = categoria;
		this.fabricante = fabricante;
	}


	public Long getnSerie() {
		return nSerie;
	}


	public void setnSerie(Long nSerie) {
		this.nSerie = nSerie;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Fabricante getFabricante() {
		return fabricante;
	}


	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
