
public class FizzBuzz {
	
	//commentaire vince 2983498234
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=200; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			System.out.println(i);
		}
	}

}
