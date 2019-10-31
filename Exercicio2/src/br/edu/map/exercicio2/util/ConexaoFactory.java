/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.map.exercicio2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public class ConexaoFactory {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/exercicio2";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "admin";
    
    public static Connection getConexao(){
        try{
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
