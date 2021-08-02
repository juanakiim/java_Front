package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.Board;

public class boarddao {
	
	private Connection conn; 
	private ResultSet resultSet;


	public void setConn(Connection conn) {
		this.conn = conn;
	}



	public boarddao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspproject?serverTimezone=UTC", "root" , "5885245" );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int write ( Board board ) {
		
		String SQL = "insert into board(title, contents, wirter, board_date)"+"values(?,?,?,?)";
		try { 
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, board.getTitle());
			statement.setString(2, board.getContents());
			statement.setString(3, board.getWriter());
			statement.setString(4, board.getBoard_date());
			
			statement.executeUpdate();
			return 1;
		} catch (Exception e) {} 
		return 0;}
		
		
		
		public ArrayList<Board> list() {
			
			ArrayList<Board> boards = new ArrayList<Board>();
			String SQL = "select * from board";
			
			try {
				PreparedStatement statement = conn.prepareStatement(SQL);
				resultSet = statement.executeQuery();
				
				while(resultSet.next()) {
					
					Board board2 = new Board(resultSet.getInt(1),
							resultSet.getString(2),
							resultSet.getString(3),
							resultSet.getString(4),
							resultSet.getString(5));
					
					boards.add(board2);
				} return boards;
			} catch (Exception e) {	}
			return null;
	}
	
	
	
	
	
	
	
	
	
}
