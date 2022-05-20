/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.bossini._usjt_psc_segunda_sistema_academico;

/**
 *
 * @author rodri
 */
import java.sql.Connection;
public class App {

    //1 tratar com try catch
    //2 declarar com throws
    public static void main(String[] args) throws Exception{
        Connection conexao = ConexaoBD.obterConexao();
        if (conexao != null)
            System.out.println("Conexão aberta com sucesso");
        else
            System.out.println("Conexão falhou");
    }
}
