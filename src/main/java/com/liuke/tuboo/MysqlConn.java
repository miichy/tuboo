package com.liuke.tuboo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * table player:
 * create table player(
    > id int(4) not null primary key auto_increment,
    > first_name char(20) not null,
    > last_name char(20) not null,
    > middle_name char(20),
    > sex int(4) not null default '0',
    > age INTEGER；
 *
 */
public class MysqlConn 
{
    public static void main( String[] args )
    {
        try{
        	String url = "jdbc:mysql://localhost/iceko";
        	String user = "root";
        	String password = "root";
        	
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
        	
        	Connection conn = DriverManager.getConnection(url, user, password);
        	Statement stmt = conn.createStatement();
        	
        	//ResultSet rs = stmt.executeQuery("show databases;");
        	
        	//Insert statement
        	//stmt.execute("insert into player (first_name,last_name,sex,age) values (\"Michael\",\"Jordan\",1,53);");
        	//stmt.execute("insert into team (name,city,home_center,coach,money_total) values (\"Lakers\",\"Los Angel\",\"Stapes Center\",\"Luke Waton\",100000000)");
       	
        	ResultSet rs = stmt.executeQuery("select * from iceko.player;");
        	
        	while(rs.next()){
        		String name = rs.getString("id");
        		System.out.println(name);
        	}
        	
        }catch (Exception e) {
        	System.out.println("Error : " + e.toString());
		}
    }
}
