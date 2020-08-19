package com.cybertek.jdbc.day2;

public class DB_Practice5 {
    public static void main(String[] args) {
        DB_Utility.createConnection(); //CONNECTION SUCCESSFUL

        DB_Utility.runQuery("Select * from Regions");

        DB_Utility.getColumnCNT();
        System.out.println(" Let see how many column are there "
                + DB_Utility.getColumnCNT() ); //Let see how many column are there 2

        DB_Utility.displayAllData();
        /*
        1	Europe
        2	Americas
        3	Asia
        4	Middle East and Africa
         */
        System.out.println(DB_Utility.getColumnDataAtRow(2,2)); // Americas

        System.out.println("=======================");

        System.out.println(DB_Utility.getColumnDataAsList(2)); //[Europe, Americas, Asia, Middle East and Africa]
        System.out.println("===================");

        System.out.println(DB_Utility.getColumnDataAsList("Region_name")); //[Europe, Americas, Asia, Middle East and Africa]
        System.out.println("==========================");

        System.out.println(DB_Utility.getColumnDataAsList("Region_id")); // [1, 2, 3, 4]

        System.out.println("======================");

        System.out.println(DB_Utility.getColumnDataAtRow(1,"Region_id")); //1
        System.out.println("===================================");

        System.out.println(DB_Utility.getRowCount() + " rows are here."); //4 rows are here.
        System.out.println("===========================");

        System.out.println(DB_Utility.getRowDataAsList(2)); //[2, Americas]
        System.out.println("==========");

        System.out.println(DB_Utility.getAllDataAsListOfMap());
        //[{REGION_ID=1, REGION_NAME=Europe}, {REGION_ID=2, REGION_NAME=Americas},
        // {REGION_ID=3, REGION_NAME=Asia}, {REGION_ID=4, REGION_NAME=Middle East and Africa}]

        System.out.println("=====================");

        System.out.println(DB_Utility.getRowMap(1)); //{REGION_ID=1, REGION_NAME=Europe}

        System.out.println("==========");

        DB_Utility.destroy();
    }

}
