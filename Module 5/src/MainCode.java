import java.util.Random;
public class MainCode {
	public static void main(String[] args) {
		
		System.out.println("Hello, welcome to th DMV!");
		Random random = new Random();
		int randomNumber = random.nextInt(201);
		int counter = 1 + randomNumber;
		
		System.out.println("Here is your number " + randomNumber + ". Please wait until your number is called.");
		
		while(counter != randomNumber) {
			if(counter == 200) {
				counter = 0;
				counter += 1;
				System.out.println("Now calling " + counter +  "!");
			}
			else {
				counter += 1;
				System.out.println("Now calling " + counter +  "!");
			}
		}
		
		System.out.println("You do not have the required documents, please leave!");
		
	}
}
