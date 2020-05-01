package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	
	final String DRIVER = "com.mysql.jdbc.Driver";	
	final String URL = "jdbc:mysql://localhost:3306/book_ex?useSSL=false&serverTimezone=Asia/Seoul";
	final String USER = "root";
	final String PW = "root";
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
			
	

}
