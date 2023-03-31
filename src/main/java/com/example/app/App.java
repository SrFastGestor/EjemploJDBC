package com.example.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;




public class App {
    // com.example.ConectorMysql conectorMysql = new com.example.ConectorMysql();
    final static Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {

        ConectorMysql conectorMysql = new ConectorMysql();

        Connection connection;
        try{
            connection = conectorMysql.conectarMySQL();

        }catch (Exception e){
            logger.error("Problema al conectar");
        }

        logger.info("Conectado con la base de datos..!!");


    }

}
