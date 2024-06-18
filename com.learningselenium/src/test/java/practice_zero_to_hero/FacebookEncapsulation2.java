package practice_zero_to_hero;

public class FacebookEncapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookEncapsulation f1 = new FacebookEncapsulation("dev", 5, "abc@123");
		System.out.println(f1.getUser_name());
		f1.setUser_name("devi");
		System.out.println(f1.getUser_name());
	}

}
