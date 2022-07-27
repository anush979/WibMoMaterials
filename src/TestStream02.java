import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class TestStream02 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(12, 15, 19, 25, 26, 52, 55, 76, 81, 99, 92, 91, 100); 
		System.out.println(numList);

		numList.stream().filter(n -> n % 2 == 0).forEach(new PrintNumbersConsumer());
		numList.stream().filter(n -> n % 2 == 0).forEach((n) -> {
																	System.out.println(n);
																});

//		numList.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
	}
}

class PrintNumbersConsumer implements Consumer<Integer>{
	public void accept(Integer t) {
		System.out.println(t);
	}	
}