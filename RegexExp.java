package smallProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexExp {

	private static int left = 5;
	static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			if (left > 0) {

				System.out.println("Enter word you want to check. time left : " + left);
				String youWantToCheckWord = sc.nextLine();
				if (youWantToCheckWord.length() > 0)

					System.out.println("Which word do you want to match. time left : " + left);
				String rp = sc.nextLine();
				Matcher mathcer = Pattern.compile(rp).matcher(youWantToCheckWord);
				if (rp.length() > 0) {
					if (mathcer.find()) {
						System.out.println("Yes, it is same");
						left--;
					} else if (mathcer.find() != true) {
						System.out.println("No, it isn't same");
						left--;
					}
				}
			} else if (left == 0) {
				System.out.println(
						"Sorry, you had already used 5 time of the Regex, to avoid your conputer is crashed please run again");
				break;
			}
		}
	}
}