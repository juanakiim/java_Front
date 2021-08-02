package DTO;

public class member {
	
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private String zipcode;
	private String address;
	
	
	public member() {
		// TODO Auto-generated constructor stub
	}


	public member(int no, String id, String password, String name, String email, String zipcode, String address) {
	
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.zipcode = zipcode;
		this.address = address;
	}


	public member(String id, String password, String name, String email, String zipcode, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.zipcode = zipcode;
		this.address = address;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	

}
