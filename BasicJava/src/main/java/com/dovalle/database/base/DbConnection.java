package com.dovalle.database.base;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DbConnection {
    protected String dbURLconnection = "";
    protected String dbUserName = "";
    protected String dbPassword = "";
    protected Connection dbConnection;
    protected String dbDriverType = "";

    public void openConnection(){
        try {
            this.dbConnection = DriverManager.getConnection(this.dbURLconnection, this.dbUserName, this.dbPassword);
            System.out.println(String.format("\nSUCESS to open the connection into: %s", this.dbDriverType));
        }
        catch (Exception e){
            System.out.println(String.format("\nERROR to open the connection into: %s", this.dbDriverType));
        }
    }

    public void closeConnection(){
        try {
            if (this.dbConnection !=null && !this.dbConnection.isClosed()){
                this.dbConnection.close();
                System.out.println(String.format("\nSUCESS to close the connection into: %s", this.dbDriverType));
            }
        }
        catch (Exception e){
            System.out.println(String.format("\nERROR to close the connection into: %s", this.dbDriverType));

        }
    }

    public void testConnection(){
        openConnection();
        closeConnection();
    }
}
