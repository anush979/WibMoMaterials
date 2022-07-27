import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class TestStream03 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(12, 15, 19, 25, 26, 52, 55, 76, 81, 99, 92, 91, 100); 
		System.out.println(numList);

//		List<Integer> processedNumList = numList.stream().map(new IncrimentNumberBy10Function()).collect(Collectors.toList());
		List<Integer> processedNumList = numList.stream().map((n) -> {
																		return n + 10;
																	}).collect(Collectors.toList());

//		List<Integer> processedNumList = numList.stream().map(n -> n + 10).collect(Collectors.toList());
		System.out.println(processedNumList);
		
	}
}

class IncrimentNumberBy10Function implements Function<Integer, Integer>{
	@Override
	public Integer apply(Integer t) {
		return t + 10;
	}	
}