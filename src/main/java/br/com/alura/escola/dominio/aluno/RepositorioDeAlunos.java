package br.com.alura.escola.dominio.aluno;

import java.sql.SQLException;
import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno) throws SQLException;

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}