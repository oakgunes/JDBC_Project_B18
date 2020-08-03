package com.cybertek.jdbc.day1;

import java.sql.*;

public class IteratingPractice { //52.72.23.155

    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@52.72.23.155:1521:XE";  //52.72.23.155
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        //ResultSet rs   =   stmnt.executeQuery("SELECT * FROM COUNTRIES WHERE REGION_ID = 1") ;
        ResultSet rs = stmnt.executeQuery("SELECT * FROM COUNTRIES");

        // as long as rs.next() return true I know I have next row to print the data
        // we will keep looping as long as rs.next() return true

        while (rs.next() == true) {
            System.out.println("===================");
            // column 1 is the country_id from sql , column2 is the name of the country, column 3 is region_id
            System.out.println(rs.getString(1)+ " "
                    + rs.getString(2) + " "
                    + rs.getInt(3) ); /// this is getting region id as number instead of String

            System.out.println(rs.getString("COUNTRY_ID") + " " + rs.getString("COUNTRY_NAME"));

        }
        //rs.previous(); //if we can use rs.previous dan will check  next iterartion we dont have any info will throw run time exception
        //but if we will not use it while condition will be false if we dont have any info and stop it
    }

}