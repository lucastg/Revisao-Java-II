package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unicesumar.model.Categoria;
import br.edu.unicesumar.model.Equipamento;


public class EquipamentoDAO extends DAO {
	private String INSERIR_SQL = "INSERT INTO tb_equipamento(nSerie, descricao, status, idCategoria, idFabricante) vallues (?,?,?,?,?)";
	private String ALTERAR_SQL = "UPDATE tb_equipamento set descricao = ?, status =?, idCategoria =?, idFabricante =?";
	private String EXCLUIR_SQL = "DELETE FROM tb_equipamento where nSerie =?";
	private String EXCLUIR_SQL = "DELETE FROM 

}
