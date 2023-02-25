/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Saksham Tambe
 */
public class tables {
    public static void main(String[] args) {
        try{
           String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
           String adminDetails="insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','sakshamtambe@gmail.com','1234567890','India','admin','What is your Favourite pet?','ABC','true')";
           String CategoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
           String productTable="create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
           String BillTables="create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
          // DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
           //DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
           //DbOperations.setDataOrDelete(CategoryTable, "Category Table Created Successfully");
           //DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully");
           DbOperations.setDataOrDelete(BillTables, "Bills Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
