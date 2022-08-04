package demos;

import java.util.*;
import java.util.function.Consumer;

public class Test03StreamForEach {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(12, 15, 19, 25, 26, 52, 55, 76, 81, 99, 92, 91, 100); 
		
		numList.stream().forEach(new TestConsumer());
		System.out.println("******************************************************************");

		numList.stream().forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

		System.out.println("******************************************************************");
		
		numList.stream().forEach((n)-> {
							System.out.println(n);
		});

		System.out.println("******************************************************************");

		numList.stream().forEach((n)-> System.out.println(n));
		
		
		System.out.println("***********************System.out::println*******************************************");
		numList.stream().forEach(System.out::println);
		System.out.println("***********************System.out::println*******************************************");

		numList.forEach(System.out::println);
	}
}


class TestConsumer implements Consumer<Integer>{
	public void accept(Integer t) {
		System.out.println(t);
	}
}