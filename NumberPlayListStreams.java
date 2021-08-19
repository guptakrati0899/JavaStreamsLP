package streamsjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
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
		List<Double> doubleList = myNumberList.stream().map(toDoubleFunction).collect(Collectors.toList());
		System.out.println("Printing Double List : " + doubleList);
	}

}
