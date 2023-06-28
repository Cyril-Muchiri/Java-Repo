package com.DB;

import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:mysql://localhost:3306/final_project";
        String usr="root";
        String pass="lafamilia";
        String query="select * from houses";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection=DriverManager.getConnection(url,usr,pass);
        Statement st=connection.createStatement();
        ResultSet rt=st.executeQuery(query);


        while (rt.next()){
            String data= rt.getString(1)+" "+rt.getString(2);
            System.out.println(data);
        }
        connection.close();
        st.close();





    }
}