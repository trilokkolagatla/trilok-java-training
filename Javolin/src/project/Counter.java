package project;

public class Counter {
	public static void main(String args[]) {
		int lower = 10, upper=20, counter=0, result;
		if (counter >= 10 && counter <= 20) {
			if (counter == 20) {
				result = lower;
				System.out.println(result);

			} else {
				result = counter + 1;

				System.out.println(result);
			}
		} else {
			System.out.println("not in range");
		}

	}
}
