package com.micka.borscha;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main  {

    public static void main(String ... args){
        /*JFrame frame = new JFrame();

        JButton button = new JButton("click");
        button.setBounds(new Rectangle(130,100,100, 40));
        frame.add(button);

        frame.setSize(400,500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible*/
        JDBCConnection connection = new JDBCConnection();
        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("select * from employees");

            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            connection.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
