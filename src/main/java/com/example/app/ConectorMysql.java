package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConectorMysql {



    // Librería de MySQL
    public String driver = "com.mysql.cj.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "empleados_departamentos";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    // jdbc:mysql://localhost:3306/empleados_departamentos?useSSL=false

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "perico21";

    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
