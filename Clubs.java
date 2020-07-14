import java.util.Random;
public class Clubs extends Golf{
			//arrays contain name, mean, standard deviation for clubs
			String[] clubName= {"Driver", "3-Wood", "3-Iron", "4-Iron", "5-Iron", "6-Iron", "7-Iron", "8-Iron", "9-Iron", "Wedge"};
			int[] clubMean= {230,215,180,170,155,145,135,125,110,50};
			int[] clubSD= {30,20,20,17,15,15,15,15,10,10};
			
			//arrays contain number, mean, standard deviation for putter
			int[] puttnumber= {1,2,3,4,5,6,7,8,9,10};
			int[] puttmean= {1,2,4,8,12,16,20,25,30,40};
			int[] puttstddev= {1,1,2,2,3,3,4,4,5,5};
		
			//Calculates the distance the ball moves, depending on user input for club and power. Uses the nextGaussian() method to compute a distance.
		public static int nextDistance(int mean, int stddev, int power) {
			Random rand=new Random();
			double mean_adj = mean * power / 10.0;
			double stddev_adj = stddev * power / 10.0;
			double val = Math.abs(rand.nextGaussian() * stddev_adj + mean_adj);
			return (int)val;
			}
}


