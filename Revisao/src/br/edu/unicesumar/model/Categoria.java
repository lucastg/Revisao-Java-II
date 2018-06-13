package br.edu.unicesumar.model;

public class Categoria {
	private Long idCat;
	private String descricao;
	
	public Categoria(Long idCat, String descricao){
		super();
		this.idCat = idCat;
		this.descricao = descricao;
	}

	public Long getIdCat() {
		return idCat;
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
