/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tanmai
 */
public class ProductDao {
   
    public static ArrayList<Product> getAllRecordsByCategory(String category)
    {
     ArrayList<Product>arrayList+new ArrayList<>();
     try{
     ResultSet rs=Dboperations.getData("select * from product where category='"+category+"'");
     while(rs.next()){
         Product product=new Product();
         product.setName(rs.getString("name"));
         arrayList.add(product);
     }
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
     return arrayList;
    }
    
     public static ArrayList<Product> filterProductByName(String name,String category)
    {
     ArrayList<Product>arrayList+new ArrayList<>();
     try{
     ResultSet rs=Dboperations.getData("select * from product where name like'%"+name+"%' and category ='"+category+"'");
     while(rs.next()){
         Product product=new Product();
         product.setName(rs.getString("name"));
         arrayList.add(product);
     }
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
     return arrayList;
    }
     
     public static Product getProductByname(String name){
         Product product=new Product();
         try{
           ResultSet rs=Dboperations.getData("select *from product where name='"+name+"'");
           while(rs.next()){
               product.setNmae(rs.getString(2));
               product.setPrice(rs.getString(4));
               product.setCategory(rs.getString(3));
           }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
         return product;
     }
}

