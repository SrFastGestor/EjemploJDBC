package com.example.app;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class App {
    // com.example.ConectorMysql conectorMysql = new com.example.ConectorMysql();
    final static Logger logger = LogManager.getLogger("PruebasLog4j");
    public static void main(String[] args) {

        String consulta="SELECT * from empleados;";

        ConectorMysql conectorMysql = new ConectorMysql();

        Connection connection;
        try{
            connection = conectorMysql.conectarMySQL();
            Statement sentencia=connection.createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next()){
                System.out.println (resultado.getString (1) + " ////" + resultado.getString(2));
            }

        }catch (Exception e){

            logger.error("Error en la clase App");
            e.printStackTrace();
        }


        System.out.println("-------------------------------------------------------------------");
       logger.error("Esto es una prueba de error");
       logger.info("Esto es una prueba de info");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////



    }

}
