public class TestGenerics01 {
	public static void main(String[] args) {
		TestNormalClassG01 normalClass01 = new TestNormalClassG01();
		normalClass01.t = "TestData";
		normalClass01.t = 1234;
		normalClass01.t = new Emp();
		
		TestGenericClassG01<String> genericClass01 = new TestGenericClassG01<String>();
		genericClass01.t = "StringData";
		genericClass01.t = 1234;
		genericClass01.t =  new Emp();
	}
}
class Emp{}
class TestNormalClassG01{
	Object t;
}

class TestGenericClassG01<T>{
	T t;
}
