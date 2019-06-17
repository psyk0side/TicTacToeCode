
import java.util.Scanner;

public class ticTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tic[][] = new String[3][3];

		tic[0][0] = "-";
		tic[0][1] = "-";
		tic[0][2] = "-";

		tic[1][0] = "-";
		tic[1][1] = "-";
		tic[1][2] = "-";

		tic[2][0] = "-";
		tic[2][1] = "-";
		tic[2][2] = "-";
		
		boolean userWin = userWinner(tic);

		do {
			tableCode(tic);
			userPlaceX(tic);
			userPlaceO(tic);
			userWinner(tic);
		} while (userWinner(tic) == false);
		
		if (userWinner(tic) == true) {
			System.out.println("Player _ wins!");
		} else {
			System.out.println("No winners!");
		}

	}

	public static void tableCode(String tic[][]) {
		String test = "";
		for (int x = 0; x < tic.length; x++) {
			for (int a = 0; a < tic[x].length; a++) {
				test += "|" + tic[x][a];
			}
			test += "|\n";
		}
		System.out.println(test);
	}

	public static void userPlaceX(String tic[][]) {
		System.out.println("This is for Player X.");
		int num1, num2;
		Scanner userOne = new Scanner(System.in);
		Scanner userTwo = new Scanner(System.in);
		System.out.println("Please enter your row number (0-2).");
		num1 = userOne.nextInt();
		System.out.println("Please enter your column number (0-2).");
		num2 = userTwo.nextInt();

		tic[num1][num2] = "X";
	}

	public static void userPlaceO(String tic[][]) {
		System.out.println("This is for Player O.");
		int num3, num4;
		Scanner userThree = new Scanner(System.in);
		Scanner userFour = new Scanner(System.in);
		System.out.println("Please enter your row number (0-2).");
		num3 = userThree.nextInt();
		System.out.println("Please enter your column number (0-2).");
		num4 = userFour.nextInt();

		tic[num3][num4] = "O";
	}

	public static boolean userWinner(String tic[][]) {
		if (tic[0][0] == "X" && tic[0][1] == "X" && tic[0][2] == "X"
				|| tic[0][0] == "O" && tic[0][1] == "O" && tic[0][2] == "O") {
			return true;
		} else if (tic[1][0] == "X" && tic[1][1] == "X" && tic[1][2] == "X"
				|| tic[1][0] == "O" && tic[1][1] == "O" && tic[1][2] == "O") {
			return true;
		} else if (tic[2][0] == "X" && tic[2][1] == "X" && tic[2][2] == "X"
				|| tic[2][0] == "O" && tic[2][1] == "O" && tic[2][2] == "O") {
			return true;
		} else if (tic[0][0] == "X" && tic[1][0] == "X" && tic[2][0] == "X"
				|| tic[0][0] == "O" && tic[1][0] == "O" && tic[2][0] == "O") {
			return true;
		} else if (tic[0][1] == "X" && tic[1][1] == "X" && tic[2][1] == "X"
				|| tic[0][1] == "O" && tic[1][1] == "O" && tic[2][1] == "O") {
			return true;
		} else if (tic[0][2] == "X" && tic[1][2] == "X" && tic[2][2] == "X"
				|| tic[0][2] == "O" && tic[1][2] == "O" && tic[2][2] == "O") {
			return true;
		} else if (tic[0][0] == "X" && tic[1][1] == "X" && tic[2][2] == "X"
				|| tic[0][0] == "O" && tic[1][1] == "O" && tic[2][2] == "O") {
			return true;
		} else if (tic[0][2] == "X" && tic[1][1] == "X" && tic[2][0] == "X"
				|| tic[0][2] == "O" && tic[1][1] == "O" && tic[2][0] == "O") {
			return true;
		} else {
			return false;
		}
	}

}
