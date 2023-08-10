/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectjdbc;

import java.sql.*;

/**
 *
 * @author omkar
 */
public class ConnectJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
//            String url = "jdbc:mysql://localhost:3306/demo1?useSSL=false";
            String url = "jdbc:mysql://localhost:3306/demo1";
            String username = "root";
            String password = "startSQL";

            Connection con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) {
                System.out.println("Connection is closed...");
            } else {
                System.out.println("Connected...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
