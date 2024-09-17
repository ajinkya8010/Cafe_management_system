/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Ajinkya
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(name,email,mobileNumber,address,password,securityQuetion,answer,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuetion()+"','"+user.getAnswer()+"','false')";
        DbOperations.setDataOrDelete(query, "Registered Sucessfully! Wait for admin approval");
    }
    
    public static User login(String email, String password){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog( null,e);
        }
        return user;
    }
    
    public static User getSecurityQuetion(String email){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select * from user where email='"+email+"'");
            while(rs.next()){
                user = new User();
                user.setSecurityQuetion(rs.getString("securityQuetion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static void update(String email, String newPassword){
        String query = "update user set password = '"+newPassword+"'where email='"+email+"'";
        DbOperations.setDataOrDelete(query, "Password changes Successfully");
    }
    
    public static ArrayList<User> getAllRecords(String email){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from user where email like '%"+email+"%'");
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuetion(rs.getString("securityQuetion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void changeStatus(String email,String status){
        String query = "update user set status='"+status+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query, "Status changed successfully");
    }
    public static void changePassword(String email, String oldPasswrod,String newPassword){
        try{
            ResultSet rs = DbOperations.getData("select * from user where email='"+email+"' and password='"+oldPasswrod+"'");
            if(rs.next()){
                update(email, newPassword);
            }else{
                JOptionPane.showMessageDialog(null, "Old password is wrong");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    public static void changeSecurityQuetion(String email,String password,String securtiyQuetion,String Answer){
        try{
            ResultSet rs = DbOperations.getData("select * from user where email='"+email+"' and password='"+password+"'");
            if(rs.next()){
                update(email, securtiyQuetion, Answer);
            }else{
                JOptionPane.showMessageDialog(null, "Password is wrong");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void update(String email, String securityQuetion, String answer){
        String query = "update user set securityQuetion='"+securityQuetion+"',answer='"+answer+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query, "Security Quetion Changed succesfully");
    }
    
}
