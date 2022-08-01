/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author Tanmai
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name,email,mobileNumber,address,passward,securityQuestion,answer,status)values('" + user.getName() + "','" + user.getEmail() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";
        Dboperations.setDataOrDelete(query, "Registered Successfully ! wait for admin approval!");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = Dboperations.getData("select * from user where email='" + email + "'and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = Dboperations.getData("select *from user email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password = '" + newPassword + "'where email='" + email + "'";
        Dboperations.setDataOrDelete(query,"Password changes successfully");
    }
}
