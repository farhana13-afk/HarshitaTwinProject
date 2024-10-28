import java.util.Scanner;
public class HarshitaCodes
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner (System.in);
		int num = reader.nextInt();
	}

	public void createArray (int num) {
		int [][] numbers = new int [num][num];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				int rand = (int) (Math.random()*10) + 1;
				numbers[i][j] = rand;
			}
		}
	}
}