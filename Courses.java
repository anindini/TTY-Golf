import java. util.Scanner;
import java.util.Random ;
public class Courses{
	static Golf a = new Golf();
	public static void main (String[]args){
		//introduces and welcomes user to TTY Golf
		System.out.println("Welcome to TTY Golf! \nIn TTY Golf, a course is represented as a set of 18 holes, each of which has a yardage \n(number of yards from tee to hole) and a par for the hole.\n You must play each hole of the course in turn to complete a round.\n For each stroke (shot) other than putting, you can select a club (a number 1–10) and the power with which to hit the ball (also a number 1–10). The program will compute the\n distance of the shot (details below) and inform you of the result.\n You may continue to take shots like this until ball is within 20 yards (60 feet) of the hole,\n at which point it is on the green.\n Once the ball is on the green, you may putt by specifying the power with which to hit the\n ball (1–10). The program will compute the distance of the putt and whether it goes in the\n hole (details below). You may continue to putt until the ball is in the hole. The program will keep track of the number of strokes (shots) and your score relative\n to the total par of the holes you have played so far.\n When the game is over, the program will offer to play a new round or quit. ");
		System.out.println();
		System.out.println("Please select a course: "
        		+ "\nEnter 1 for Genesee Valley Park North Course "
        		+ "\nEnter 2 for The Old Course at St. Andrews ");
		
		//scans for users' input
		Scanner scan = new Scanner(System.in);
		int course = scan.nextInt();
				
		if (course==1){
			System.out.println("You have chosen Genesee Valley Park North Course");
			a.GenValley();
					
			
		}

		else if (course==2){
			System.out.println("You have chosen The Old Course at St. Andrews");
			a.SA();
		}
		
  }
}             

