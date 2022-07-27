import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class TestStream01 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(12, 15, 19, 25, 26, 52, 55, 76, 81, 99, 92, 91, 100); 
		System.out.println(numList);
		
		
		List<Integer> evenList = new ArrayList<Integer>();
		for(int n : numList) {
			if(n % 2 == 0) {
				evenList.add(n);
			}
		}
		System.out.println(evenList);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Stream<Integer> stream1 = numList.stream();
		Stream<Integer> stream2 = stream1.filter(new FindOddNumberPridicate());
		List<Integer> oddList = stream2.collect(Collectors.toList());
		System.out.println(oddList);

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<Integer> div5NumList = numList.stream().filter(n -> (n % 5) == 0 ).collect(Collectors.toList());
		System.out.println(div5NumList);
		
		Long evenCount = numList.stream().filter(n -> (n % 2) == 0).count();
		System.out.println("evenCount : " + evenCount);

		Long oddCount = numList.stream().filter(n -> (n % 2) != 0).count();
		System.out.println("evenCount : " + oddCount);

	}
}
class FindOddNumberPridicate implements Predicate<Integer>{
	public boolean test(Integer t) {
		return (t % 2) != 0;
	}
}
