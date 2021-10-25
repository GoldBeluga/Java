package smallProject;

import java.util.Scanner;

public class NineNine {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("请问你要到多少的乘法表");
			int howMany = sc.nextInt();
			System.out.println("请问你要多少次");
			int time = sc.nextInt();

			if ((howMany < 1 || time < 1) || (howMany < 1 && time < 1)) {
				System.out.println("请输入大于0的数字" + "\n" + "-------------------------------------");
			} else if (!((howMany < 1 || time < 1) || (howMany < 1 && time < 1))) {

				int box = 1;
				System.out.println("\n" + "   (1到" + time + ")乘" + howMany + "的乘法表口诀" + "\n"
						+ "-------------------------------------");
				do {

					System.out.println("     " + box + " 乘 " + howMany + " = " + box * howMany + "\n"
							+ "-------------------------------------");
					box++;

				} while (box < time + 1);
				System.out.println("");

			}
		}
	}

}
