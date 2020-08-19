package com.cybertek.jdbc.day4;

import com.cybertek.jdbc.utility.DB_Utility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Practice1_Mysql {

    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:mysql://18.233.97.71:3306/library1";
        String username = "library1_client" ;
        String password = "WVF4NdGXCKHeE6VQ" ;
        DB_Utility.createConnection(connectionStr,username,password);
        //DB_Utility.destroy();

        ResultSet rs = DB_Utility.runQuery("Select * from books");
        DB_Utility.displayAllData();




    }
}
