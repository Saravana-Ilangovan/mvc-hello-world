package dailyproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandlesProblem {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int numberofcandles = in.nextInt();
		List<Integer> numberArray= new ArrayList<>();
	    for(long arr_i=0; arr_i < numberofcandles; arr_i++){
	    	numberArray.add(in.nextInt());
	    }
	    birthdayCakeCandles(numberArray);
	}

	private static void birthdayCakeCandles(List<Integer> numberArray) {
		int max = numberArray.stream().max(Integer::compare).get();
		System.out.println(Collections.frequency(numberArray, max));
	}

}
