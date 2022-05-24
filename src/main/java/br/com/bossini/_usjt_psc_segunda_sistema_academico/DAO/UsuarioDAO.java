/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_sistema_academico.DAO;

/**
 *
 * @author rodri
 */

//Data Access Object
//Data Access Object (DAO) é um padrão de projeto (design pattern)
import br.com.bossini._usjt_psc_segunda_sistema_academico.ConexaoBD;
import br.com.bossini._usjt_psc_segunda_sistema_academico.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    
    public boolean existe (Usuario u) throws Exception{
        //1. Definir o comando SQL (SELECT)
        //placeholder: guardião de lugar
        String sql = "SELECT * FROM tb_usuario WHERE login=? AND senha=?";
        //2. Abrir uma conexão com o MySQL Server
        //estamos sujeitos à cláusula catch or declare
        //catch: significa tratar a exceção
        //throws: avisar o código cliente que a exceção pode acontecer
        Connection conexao = ConexaoBD.obterConexao();        
        //3. Prepara (pré-compila) o comando SQL
        PreparedStatement ps = conexao.prepareStatement(sql);        
        //4. Substituir os placeholders
        ps.setString(1, u.getNome());
        ps.setString(2, u.getSenha());
        //5. Executar o comando SQL
        ResultSet rs = ps.executeQuery();
        //6. Tratar o resultado
        //se o usuário existir, devolver true. Senão, devolver false.
        boolean usuarioExiste = rs.next();
        //7. Fechar os recursos
        rs.close();
        ps.close();
        conexao.close();
        return usuarioExiste;
    }
    
}
