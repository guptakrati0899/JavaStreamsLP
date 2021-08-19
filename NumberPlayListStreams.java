package streamsjava;

import java.util.ArrayList;
import java.util.List;

public class NumberPlayListStreams {
	
	public static void main(String[] args) {

		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i = 0; i < 5 ; i++) myNumberList.add(i);
		
		// Processing Stream 
		myNumberList.stream().forEach(n ->{
			System.out.println(" Stream For Each Value ::" +n);
		});
	}

}
