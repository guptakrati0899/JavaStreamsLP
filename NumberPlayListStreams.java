package streamsjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberPlayListStreams {
	
	public static void main(String[] args) {

		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i = 0; i < 5 ; i++) myNumberList.add(i);
		
		// Processing Stream 
		myNumberList.stream().forEach(n ->{
			System.out.println(" Stream For Each Value ::" +n);
		});
			
			
		//Process Stream, Apply Operation and Store Result
		
		Function<Integer,Double> toDoubleFunction = Integer::doubleValue;
		Predicate<Integer> isEvenFunction = n -> n>0 && n%2 ==0;
		List<Double> doubleList = myNumberList.stream().filter(isEvenFunction).peek(n -> System.out.println("Peak Even Number : " +n)).map(toDoubleFunction).collect(Collectors.toList());
		System.out.println("Printing Double List : " + doubleList);
		
		//first find
		Integer first = myNumberList.stream().filter(isEvenFunction).peek(n -> System.out.println("Peak Even Number : " +n)).findFirst().orElse(null);
		System.out.println("First Even : " + first);
		
		
		// MIN AND MAX
		
		Integer max = myNumberList.stream().filter(isEvenFunction).max(Comparator.comparing(Integer::intValue)).orElse(null);
		System.out.println("Max Even : " +max);
		
		Integer min = myNumberList.stream().filter(isEvenFunction).min(Comparator.comparing(Integer::intValue)).orElse(null);
		System.out.println("Min Even : " +min);
		
		//Sum , count and average
		
		Integer sum = myNumberList.stream().reduce(0, Integer::sum);
		long count = myNumberList.stream().count();
		System.out.println("Average of " + sum +"/"+ count+ "= " + sum/count);
		
		
		
	}

}
