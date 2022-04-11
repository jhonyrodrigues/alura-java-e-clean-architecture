package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

import java.sql.SQLException;

public class MatricularAlunoApplication {
    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        try {
            matricular.executa(
                    new MatricularAlunoDto(nome,
                            cpf,
                            email));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}