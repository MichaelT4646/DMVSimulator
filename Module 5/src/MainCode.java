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
		
		System.out.println("Why you- you would dare to come in here and waste your and others time expiring away\n" +
				"in this endless forsaken abyss of a queue, only to not have the necessary papers for us?\n" +
				"You disgust me beyond belief. Get out of my sight, before I sentence you to death for the\n" +
				"treason you have committed against this land today.");
		
	}
}
