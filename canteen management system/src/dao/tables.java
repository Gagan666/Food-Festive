/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tanmai
 */
public class tables {
    public static void main(String[] args)
    {
        try{
          String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(200),UNIQUE (email)";
          String adminDetails="insert into user (name,email,mobilNumber,address,password,securityQuestion,answer,status)values('Admin','admin@gmail.com','1234567890','India','What primary school did you attend?','ABC','true')";
          String billTable="create table bill(id int primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),date varchr(50),total varchar(200),createdBy varchar(200))";
          Dboperations.setDataOrDelete(userTable,"User Table Created Successfully");
          Dboperations.setDataOrDelete(adminDetails,"Admin Details Added Successfully");
          Dboperations.setDataOrDelete(billTable,"Bill Table Created Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
