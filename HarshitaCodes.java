import java.util.Scanner;
public class HarshitaCodes
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner (System.in);
		System.out.print("give in a dimension: ");
		int num = reader.nextInt();
		int [][] array = createArray(num);
		printArray(array);
	}

	public static int[][] createArray (int num) {
		int [][] numbers = new int [num][num];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				int rand = (int) (Math.random()*10) + 1;
				numbers[i][j] = rand;
			}
		}
		return numbers;
	}

	public static void printArray (int [][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.print(" " + numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}