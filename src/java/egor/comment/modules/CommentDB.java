/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egor.comment.modules;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author egor
 */
public class CommentDB {
    static class Entry {
        private String text;
        private String time;

        public Entry(String text, String time) {
            this.text = text;
            this.time = time;
        }

        private Entry() {           
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setTime(String time) {
            this.time = time;
        }
        
        public String getText() {
            return text;
        }
        public String getTime() {
            return time;
        }        
    }    
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    private Connection connection;

    public CommentDB() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/home_page?"
                    + "user=root&password=");
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        }                          
    }
    
    public List<Entry> getEntryList() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM comments");        
            List<Entry> list = new LinkedList<>();
            if (resultSet == null) {
                return list;
            }            
            while (resultSet.next()) {
                Entry entry = new Entry();
                entry.setTime(resultSet.getTimestamp("time_of_comment").toString());
                entry.setText("text");
                list.add(entry);
                //TODO fix text adding
                
            }
            return list;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
  
    public void addEntry(String text) {         
        Timestamp time = new Timestamp(new java.util.Date().getTime());  
        try {
            Statement s = connection.createStatement(); 
            System.out.println("an entry was added");             
            s.executeUpdate("insert into comments (time, comment) values (now(), '" + text + "')");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }                
        //TODO
    }
}