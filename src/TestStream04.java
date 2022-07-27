import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class TestStream04 {
	public static void main(String[] args) {
		List<String> charList = Arrays.asList("W", "i", "b", "M", "o");
		System.out.println(charList);

		String name = "";
		
		for(String s : charList) {
			name = name + s;
		}
		System.out.println(name);
		
		Optional<String> nameResult = charList.stream().reduce(new ConsolidateStringFunction());
		
		//Optional<String> nameResult = charList.stream().reduce((c, namee) -> c + namee);
		System.out.println(nameResult.get());
		
		
		List<Integer> numList = Arrays.asList(12, 15, 19, 25, 26, 52, 55, 76, 81, 99, 92, 91, 100); 
		
		Integer sumTotal = numList.stream().reduce(100, (n, sum) -> n + sum);
		//System.out.println(sumTotal.get());

	}
}

class ConsolidateStringFunction implements BinaryOperator<String>{
	@Override
	public String apply(String str, String strAcc) {
		return str + strAcc;
	}
	
}