/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_sistema_academico.DAO;

import br.com.bossini._usjt_psc_segunda_sistema_academico.ConexaoBD;
import br.com.bossini._usjt_psc_segunda_sistema_academico.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author pedro
 */
//DAO: Data Access Object
public class CursoDAO {
    
    public void inserirCurso (Curso curso) throws Exception{
        //1. Especificar o comando SQL
        String sql = "INSERT INTO tb_curso (nome, tipo) VALUES (?, ?)";
        //2. Abrir uma conexão (usando try-with-resources)
        //3. Preparar o comando (usando try-with-resources)
        try(
            Connection conexao = ConexaoBD.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
        ){
            //4. Substituir os placeholders
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getTipo());
            //5. Executar o comando
            ps.execute();        
        }
        
    }

    public List <Curso> obterCursos() throws Exception{
        List <Curso> cursos = new ArrayList<>();
        //cláusula catch or declare
        //desde a versão 7 do Java: try-with-resources
        //recursos fecháveis(closeable) podem ser abertos aqui
        //1. Abrir uma conexão
        //2. Especificar o comando SQL
        //3. Preparar o comando
        //4. Substituir eventuais placeholders
        //5. Executar o comando
        //6. Tratar o eventual resultado
        try(
            Connection conexao = ConexaoBD.obterConexao();
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM tb_curso");
            ResultSet rs = ps.executeQuery();
        ){
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String tipo = rs.getString("tipo");
                Curso curso = new Curso (id, nome, tipo);
                cursos.add(curso);
            }
        }
        return cursos;
//        Connection conexao = ConexaoBD.obterConexao();
//        conexao.close();        
    }
    
    
    
    public boolean update(Curso curso) {
        return false;
    }

    public boolean create(Curso curso) {
        return false;
    }

    public boolean delete(Curso curso) {
        return false;
    }

    public Curso read(int id) {
        return null;
    }
}
