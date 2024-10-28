import java.util.Scanner;
public class HarshitaCodes
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner (System.in);
		int num = reader.nextInt();
	}

	public int[][] createArray (int num) {
		int [][] numbers = new int [num][num];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				int rand = (int) (Math.random()*10) + 1;
				numbers[i][j] = rand;
			}
		}
		return numbers;
	}

	public void printArray (int [][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.println(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}