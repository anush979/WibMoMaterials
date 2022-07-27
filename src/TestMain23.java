import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TestMain23 {
	public static void main(String[] args) {
		
	}
}

class TestDemoClass{
	@Override
	public String toString() {
		return super.toString();
	}
	
	@MyAnnotation
	public void testMethod() {}
}


@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation{
	
}