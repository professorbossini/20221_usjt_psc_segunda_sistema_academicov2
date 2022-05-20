/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_sistema_academico;

/**
 *
 * @author rodri
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class ConexaoBD {    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "20221_usjt_psc_segunda_sistema_academico";
    private static String usuario = "root";
    private static String senha = "25154417";
    
    //1 tratamos a exceção (try/catch)
    //2 declarar a exceção (throws)
    public static Connection obterConexao() throws Exception {
        //string de conexão
        //jdbc:mysql://localhost:3306/20221_usjt_psc_segunda_sistema_academico
        String url = String.format(
            "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
            host, porta, db
        );
        return DriverManager.getConnection(
            url,
            usuario,
            senha
        );
    }
    
}
