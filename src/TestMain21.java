public class TestMain21 {
	public static void main(String[] args) {
		String s1 = "WibMo";
		String s2 = "WibMo";
		String s3 = "WibMo";
		String s4 = "WibMo";
		String s5 = new String("WibMo");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
		//s1 = s1 + " Bangalore";
		String s6 = s1 + " Bangalore";
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
		StringBuilder sb = new StringBuilder();
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.length()   : " + sb.length());
		sb.append("WibMo");
		sb.append(" Bangalore");
		sb.append(" KARNATAKA");
		sb.append(" 560010");
		sb.append(" INDIA");
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.length()   : " + sb.length());
		sb.ensureCapacity(200);
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.length()   : " + sb.length());
	}
}
