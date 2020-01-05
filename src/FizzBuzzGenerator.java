import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {
	public boolean divisibleBy(int numerator, int Denominator) {
		return numerator % Denominator == 0;
	}

	public List<String> FizzBuzz(int startNumber, int endNumber) {
		List<String> fizzBuzzList = new ArrayList<String>();

		if (startNumber > endNumber) {
			fizzBuzzList.add("Error: Start number must be larger than end number");
			return fizzBuzzList;
		}

		for (int i = startNumber; i <= endNumber ; i++) {
			if(divisibleBy(i, 3) && divisibleBy(i, 5)) fizzBuzzList.add("FizzBuzz");
			else if (divisibleBy(i, 3)) fizzBuzzList.add("Fizz");
			else if (divisibleBy(i, 5)) fizzBuzzList.add("Buzz");
			else fizzBuzzList.add(Integer.toString(i));
		}
		return fizzBuzzList;
	}
}
