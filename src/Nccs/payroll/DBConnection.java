/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Palistha
 */
public class DBConnection {
    static Connection connection;
    final static String subProtocol = "mysql";
    final static String host = "//localhost";
    final static String port = "3306";
    final static String database = "pms";
    final static String username = "palistha";
    final static String password = "ROOT";

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection("jdbc:" + subProtocol + ":" + host + ":" + port + "/" + database, username, password);

        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
