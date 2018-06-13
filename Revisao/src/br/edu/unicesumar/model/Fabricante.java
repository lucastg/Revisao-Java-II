package br.edu.unicesumar.model;

public class Fabricante {
	
	private Long idFab;
	private String descricao;
	
	
	public Fabricante(Long idFab, String descricao){
		super();
		this.idFab = idFab;
		this.descricao = descricao;
	}


	public Long getIdFab() {
		return idFab;
	}


	public void setIdFab(Long idFab) {
		this.idFab = idFab;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
