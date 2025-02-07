import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in =  new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		word = 5 + word;
		System.out.println(Integer.parseInt(word) + 5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String word = in.nextLine();
		word = 4 + word + 3;
		System.out.println(Double.parseDouble(word) + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String word = in.nextLine();
		System.out.println(!(Boolean.parseBoolean(word)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		word = word + 3;
		System.out.println((char)(Integer.parseInt(word) + 2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		word = word + 1;
		System.out.println((double)(Integer.parseInt(word)/2));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String word = in.nextLine();
		word = 1 + word;
		System.out.println((int)(Double.parseDouble(word)));

	}

}
