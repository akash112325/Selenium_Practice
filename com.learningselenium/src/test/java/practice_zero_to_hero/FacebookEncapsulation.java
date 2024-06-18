package practice_zero_to_hero;

public class FacebookEncapsulation {

	private String user_name;
	private int userid;
	private String password;
	
	public FacebookEncapsulation(String user_name, int userid, String password) {
		this.user_name = user_name;
		this.userid = userid;
		this.password = password;
	}
	


	public String getUser_name() {
		return user_name;
	}



	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}



	public int getUserid() {
		return userid;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public static void main(String[] args) {
		

	}

}
