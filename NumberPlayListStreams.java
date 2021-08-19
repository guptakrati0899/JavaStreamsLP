package streamsjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
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
		
		
		Integer first = myNumberList.stream().filter(isEvenFunction).peek(n -> System.out.println("Peak Even Number : " +n)).findFirst().orElse(null);
		System.out.println("First Even : " + first);
	}

}
