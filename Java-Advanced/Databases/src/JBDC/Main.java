package JBDC;

import java.sql.*; //all java.sql packages

public class Main {
    public static void main(String args[]) throws Exception {
        String dbName="jdbc:mysql://localhost:3306/final_project";//url for the db
                String user="root";//db logins
                String pass="lafamilia";
                String query=" select * from houses where house_size=\"one bedroom\"";


       Class.forName("com.mysql.cj.jdbc.Driver");// load and register driver NB: make sure connector jar file path is set
        Connection con=DriverManager.getConnection(dbName,user,pass);//initialize connection

        Statement st= con.createStatement();
        ResultSet rt=st.executeQuery(query);

        while (rt.next()){
            //store 1-5 column data in the variable
            String data= rt.getString(1) +" : "+rt.getString(2)
                    +" : "+rt.getString(3)+" : "+rt.getString(4)+" : "+rt.getString(5);
            System.out.println(data);
        }
        con.close();
        st.close();

    }

}
