package DTO;

public class Board {
	
	private int board_no;
	private String title;
	private String contents;
	private String writer;
	private String board_date;
	
	
	public Board() {
		// TODO Auto-generated constructor stub
	}


	public Board(int board_no, String title, String contents, String writer, String board_date) {
		this.board_no = board_no;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.board_date = board_date;
	}


	public Board(String title, String contents, String writer, String board_date) {
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.board_date = board_date;
	}


	public Board(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}


	public int getBoard_no() {
		return board_no;
	}


	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getBoard_date() {
		return board_date;
	}


	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	
	
	

}

