/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Ajinkya
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT PRIMARY KEY, name varchar(200), email varchar(200), mobileNumber varchar(10), address varchar(200), password varchar(200), securityQuetion varchar(200), answer varchar(200), status varchar(20),UNIQUE(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuetion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What primary school did you attend?','ABC','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
             String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200),price varchar(200))";
            String billTable = "create table bill(id int primary key, name varchar(200),mobileNumber varchar(200),email varchar(200), date varchar(50),total varchar(200), createdBy varchar(200))";

            DbOperations.setDataOrDelete(userTable, "User Table Created Succesfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Succesfully");
            DbOperations.setDataOrDelete(categoryTable, "Category table created Succesfully");
            DbOperations.setDataOrDelete(productTable, "Product table created Succesfully");
             DbOperations.setDataOrDelete(billTable, "Bill table created Succesfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
