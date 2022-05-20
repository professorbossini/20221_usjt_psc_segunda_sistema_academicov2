/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_sistema_academico.DAO;

import br.com.bossini._usjt_psc_segunda_sistema_academico.ConexaoBD;
import br.com.bossini._usjt_psc_segunda_sistema_academico.Curso;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import jdk.jshell.spi.ExecutionControl;

/**
 *
 * @author pedro
 */
public class DAO_CURSO {

    public ArrayList<Curso> readList() throws Exception {

        Connection conexao = ConexaoBD.obterConexao();
        String sql = "SELECT * FROM TB_CURSO";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        ArrayList<Curso> listCursos = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt(0);
            String nome = rs.getString("nome");
            String tipo = rs.getString("tipo");

            Curso curso = new Curso(id, nome, tipo);
            listCursos.add(curso);
        }
        
        return listCursos;
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
