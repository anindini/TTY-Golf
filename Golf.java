import java.util.Scanner;          

public class Golf {
	static Clubs a = new Clubs();
	static Scanner scan = new Scanner(System.in);
	
	public void GenValley (){ //GVNPC-Genesee Valley Park North Course
		int [] yards = {530, 305, 331, 201, 500, 226, 409, 410, 229, 433, 363,
				174, 545, 419, 512, 410, 320, 170};
		int [] par = {5, 4, 4, 3, 5, 3, 4, 4, 3, 4, 4, 3, 5, 4, 5, 4, 4, 3};
		int [] holes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
		int score=0;
		int club=0;
		int power=0;
		
		System.out.println("Enter yes to continue, or no to quit."); // gives user choice to quit or continue playing game after each round
		String continuePlaying=" ";
		continuePlaying=scan.next();
		if (continuePlaying.equalsIgnoreCase("yes")){
			for(int holesShot=0; holesShot<=18; holesShot++){
				double distanceHole= yards[holesShot];
				int count = 0;
				System.out.println("tee:" + (holesShot+1)); 
				System.out.println("hole: "+ holes[holesShot]+" yardage: "+yards[holesShot]+" par: "+par[holesShot]);
				while ((double) Math.abs(distanceHole)>(1.0/3.0)){
					if (Math.abs(distanceHole)<=20){
						distanceHole=distanceHole*3;
						System.out.println("You are in the green!");
						System.out.println("Choose your putt power:[1-10]");
						power=scan.nextInt();
						
						int val=a.nextDistance(a.puttmean[power-1], a.puttstddev[power-1], power);
					 	count++;
						distanceHole=distanceHole-val;
						System.out.println("You hit the ball "+val+" feet.");
						System.out.println();
						distanceHole=Math.abs(distanceHole);
						System.out.println("Shot "+count+". You are "+distanceHole+" feet from the hole");
						distanceHole=distanceHole/3.0;
					}
					else if(Math.abs(distanceHole)>20){
						System.out.println("You are in the fairway!");
						System.out.println("Enter power [1-10]");
						System.out.println("Enter club [1-10]");
						power=scan.nextInt();
						club=scan.nextInt();
						
						int val=a.nextDistance(a.clubMean[club-1], a.clubSD[club-1], power);
					 	count++;
						distanceHole=distanceHole-val;
						System.out.println("You hit the ball "+val+" yards.");
						System.out.println();
						distanceHole=Math.abs(distanceHole);
						System.out.println("Shot "+count+". You are "+(distanceHole)+" yards from the hole");
					}	
				}
				System.out.println();
				System.out.println("Congratulations! You made it!");
				score = (count-(par[holesShot]));
				System.out.println();
                 }
			if(score<0){
				System.out.println("Your score is " + Math.abs(score)+" under");
			}   
			else{
				System.out.println("Your score is " + Math.abs(score)+" over");
			}
			
			}
		else{
			System.out.println("Thank you for playing!");
		}
	}
		
	public void SA (){ //SA- The Old Course at St. Andrews
		String[] holes= {"Burn", "Dyke", "Carlgate (out)", "Hole O'Cross (out)", "Heathery (out)", "High (out)", "Short", "End", "Bobby Jones", "High (in)", "Heathery (in)", "Hole O'Cross (in)", "Long", "Cartgate (in)", "Corner of the Dyke", "Road", "Tom Morris"};
		int[] yards= {376, 453, 397, 480, 568, 412, 371, 175, 352, 386, 174, 348, 465, 618, 455, 423, 495, 357};
		int [] par = {4, 4, 4, 4, 5, 4, 4, 3, 4, 4, 3, 4, 4, 5, 4, 4, 4, 4};
		int score=0;
		int club=0;
		int power=0;
		
		System.out.println("Enter yes to continue, or no to quit."); // gives user choice to quit or continue playing game after each round
		String continuePlaying=" ";
		continuePlaying=scan.next();
		if (continuePlaying.equalsIgnoreCase("yes")){
			for(int holesShot=0; holesShot<=18; holesShot++){
				double distanceHole= yards[holesShot];
				int count = 0;
				System.out.println("tee:" + (holesShot+1)); 
				System.out.println("hole: "+ holes[holesShot]+" yardage: "+yards[holesShot]+" par: "+par[holesShot]);
				while ((double) Math.abs(distanceHole)>(1.0/3.0)){
					if (Math.abs(distanceHole)<=20){
						distanceHole=distanceHole*3;
						System.out.println("You are in the green!");
						System.out.println("Choose your putt power:[1-10]");
						power=scan.nextInt();
						
						int val=a.nextDistance(a.puttmean[power-1], a.puttstddev[power-1], power);
					 	count++;
						distanceHole=distanceHole-val;
						System.out.println("You hit the ball "+val+" feet.");
						System.out.println();
						distanceHole=Math.abs(distanceHole);
						System.out.println("Shot "+count+". You are "+distanceHole+" feet from the hole");
						distanceHole=distanceHole/3.0;
					}
					else if(Math.abs(distanceHole)>20){
						System.out.println("You are in the fairway!");
						System.out.println("Enter power [1-10]");
						System.out.println("Enter club [1-10]");
						power=scan.nextInt();
						club=scan.nextInt();
						
						int val=a.nextDistance(a.clubMean[club-1], a.clubSD[club-1], power);
					 	count++;
						distanceHole=distanceHole-val;
						System.out.println("You hit the ball "+val+" yards.");
						System.out.println();
						distanceHole=Math.abs(distanceHole);
						System.out.println("Shot "+count+". You are "+(distanceHole)+" yards from the hole");
					}	
				}
				System.out.println();
				System.out.println("Congratulations! You made it!");
				score = (count-(par[holesShot]));
				System.out.println();
                 }
			if(score<0){
				System.out.println("Your score is " + Math.abs(score)+" under");
			}
			else{
				System.out.println("Your score is " + Math.abs(score)+" over");
			}
			
			}
		else{
			System.out.println("Thank you for playing!");
		}
	}
}

