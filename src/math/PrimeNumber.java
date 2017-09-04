package math;

public class PrimeNumber {

	public static void main(String[] args) {

		int i = 0;
		int number = 0;
		String PrimeNumbers = "";
			for (i = 2; i <= 1000000; i++) {
				int counter = 0;
				for (number = i; number >=2; number--) {
					if (i % number == 0) {
						counter = counter + 2;
					}
					if (counter ==2) {
						PrimeNumbers = PrimeNumbers + i + " ";

					}
				}
				System.out.println("Prime numbers 2 to 1000000 are: ");
				System.out.println(PrimeNumbers);
			}

	}

}