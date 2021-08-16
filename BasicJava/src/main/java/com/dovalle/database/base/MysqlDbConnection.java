package com.dovalle.database.base;

public class MysqlDbConnection extends DbConnection{
    public static final String DRIVER_TYPE = "mysql";
    public MysqlDbConnection(){
        this.dbURLconnection = "jdbc:mysql://localhost:3306/santander";
        this.dbUserName = "root";
        this.dbPassword = "passord";
        this.dbDriverType = this.DRIVER_TYPE;
    }

    public MysqlDbConnection(String urlMysqlConnection, String userName, String password){
        this.dbURLconnection = urlMysqlConnection;
        this.dbUserName = userName;
        this.dbPassword = password;
        this.dbDriverType = this.DRIVER_TYPE;
    }
}

