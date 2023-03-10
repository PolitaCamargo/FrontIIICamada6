package com.paola;


import java.sql.*;

 public class EntregaParcial {


     public static void main(String[] args) {
         prepararBD();
     }
     private static void prepararBD(){
         Connection connection=null;
         try{
             Class.forName("org.h2.Driver");
             connection= DriverManager.getConnection("jdbc:h2:"+
                     "./Database/test", "root", " ");
         }
         catch (Exception e){
             e.printStackTrace();
         }
         finally {
             try{
                 connection.close();
             }
             catch (Exception ex){
                 ex.printStackTrace();
             }
         }
     }

    public void ejecutar(){


     }
 }
