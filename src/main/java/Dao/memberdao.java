package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.member;

public class memberdao {
	
	private Connection conn; //DB와 연결 
	private ResultSet resultSet; // DB값 불러오기 ? 
	
	private static memberdao instance = new memberdao();
	
	
	public static memberdao getInstance() {
		return instance;
	}



	public memberdao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspproject?serverTimezone=UTC", "root" , "5885245" );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // public memberdao end 
	
	
	// 회원가입 메소드 //
	
	public int signup (member member) {
		String SQL = "insert into member(id,password,name,email,zipcode,address)"+"ValueSet(?,?,?,?,?,?)";
		
		
		try {
			PreparedStatement statement = conn.prepareStatement(SQL); // DB에 값넘기기 ? 
			statement.setString(1, member.getId());
			statement.setString(2, member.getPassword());
			statement.setString(3, member.getName());
			statement.setString(4, member.getEmail());
			statement.setString(4, member.getZipcode());
			statement.setString(4, member.getAddress());
			
			statement.executeUpdate();
			return 1;
			
		} catch (Exception e) {}
		return 0;
	}
	
	// login method
	

	public int login(String id,String password) { 
		
		String SQL = "select * from member where id = ? and password =?";
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1,id);
			statement.setString(2, password);
			
			resultSet = statement.executeQuery();
			if(resultSet.next()) { return 1;}
			

		} catch (Exception e) {
			// TODO: handle exception
		}
			return 0;
			
		}
	}

