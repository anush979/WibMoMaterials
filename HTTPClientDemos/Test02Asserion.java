package demos;

public class Test02Asserion {
	public static void main(String[] args) {
		String str = "WibMo";
		str = "SUGNANA";
		assert str.equals("WibMo") : "Wrong Value in str = " + str;
		System.out.println("str : " + str);
	}
}
//java -ea Test02Asserion