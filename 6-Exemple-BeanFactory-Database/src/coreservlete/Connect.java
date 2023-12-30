package coreservlete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    private static Connect instance =  null;
    private String DbName;
    private String User;
    private String Password ;
    private static Connection con;

    private Connect (){
        try {
            con = DriverManager.getConnection(DbName, User, Password);
            System.out.println("Connection Done");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static Connect GetInstance(){
        if (instance == null) {
            return new Connect();
        }
        return instance;
    }

    public void setDbName(String dbName) {
        DbName = dbName;
    }

    public void setUser(String user) {
        User = user;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public static Connection getCon() {
        return con;
    }
}
