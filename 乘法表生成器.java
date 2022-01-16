import java.util.Scanner;

public class Main {
	private static int i = 1;
	private static String time;
	private static String howMany;
	private static int d;
	private static boolean goTo = true;
	private static Scanner sc = new Scanner(System.in);
	private static long howMany1;
	private static long time1;

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		while (goTo) {
			d = 0;
			System.out.println("请问你要多少的乘法表");
			howMany = sc.nextLine();
			if (howMany.length() > 0) {
				System.out.println("多少次");
				time = sc.nextLine();
				if (time.length() > 0) {
					try {
						howMany1 = Long.parseLong(howMany);
						time1 = Long.parseLong(time);
						if ((howMany1 < 1 || time1 < 1) || (howMany1 < 1 && time1 < 1)) {
							System.out.println("-------------------------------------" + "\n" + "请输入大于\"0\"的数字" + "\n"
									+ "-------------------------------------");
						} else if (!((howMany1 < 1 || time1 < 1) || (howMany1 < 1 && time1 < 1))) {

							long box = 1l;
							System.out.println("\n" + "   (1到" + time + ")乘" + howMany + "的乘法表" + "\n"
									+ "-------------------------------------");
							do {

								System.out.println("     " + box + " 乘 " + howMany + " = " + box * howMany1 + "\n"
										+ "-------------------------------------");
								box++;

							} while (box < time1 + 1);
							System.out.println("");
						}
					} catch (NumberFormatException a) {
						try {
							System.out.println("");
							int insideHowMany = Integer.parseInt(howMany);
							System.out.println("\"" + insideHowMany + "\"" + " 是个数字");
							System.out.println("");
						} catch (NumberFormatException b) {
							System.out.println("");
							System.out.println("\"" + howMany + "\"" + " 不是数字或太大了，最大的数目是 : " + Long.MAX_VALUE);
							System.out.println("");
							d += 1;
						}
						try {
							int insideTime = Integer.parseInt(time);
							System.out.println(
									"\"" + insideTime + "\"" + "是个数字" + "\n" + "-------------------------------------");
						} catch (NumberFormatException c) {
							System.out.println("\"" + time + "\"" + " 不是数字或太大了，最大的数目是 : " + Long.MAX_VALUE);
							d += 1;
						}
						System.out.println("此内容有 " + d + " 不符合要求" + "\n" + "-------------------------------------");

					} finally {
						System.out.println("你用此程序 " + i++ + " 次" + "\n" + "-------------------------------------");
					}
				} else if (time.length() == 0) {
					System.out.println("请输入数字");
					goTo = false;
					continue;
				}

			} else if (howMany.length() == 0) {
				System.out.println("请输入数字");
			}
		}

		while (!goTo) {
			d = 0;
			System.out.println("多少次");
			time = sc.nextLine();
			if (time.length() > 0) {
				try {
					howMany1 = Long.parseLong(howMany);
					time1 = Long.parseLong(time);
					if ((howMany1 < 1 || time1 < 1) || (howMany1 < 1 && time1 < 1)) {
						System.out.println("-------------------------------------" + "\n" + "请输入大于\"0\"的数字" + "\n"
								+ "-------------------------------------");
					} else if (!((howMany1 < 1 || time1 < 1) || (howMany1 < 1 && time1 < 1))) {

						long box = 1l;
						System.out.println("\n" + "   (1到" + time + ")乘" + howMany + "的乘法表" + "\n"
								+ "-------------------------------------");
						do {

							System.out.println("     " + box + " 乘 " + howMany + " = " + box * howMany1 + "\n"
									+ "-------------------------------------");
							box++;

						} while (box < time1 + 1);
						System.out.println("");

					}
				} catch (NumberFormatException a) {
					try {
						int insideHowMany = Integer.parseInt(howMany);
						System.out.println("");
						System.out.println("\"" + insideHowMany + "\"" + " 是数字");
					} catch (NumberFormatException b) {
						System.out.println("");
						System.out.println("\"" + howMany + "\"" + " 不是数字或太大了，最大的数目是 : " + Long.MAX_VALUE);
						d += 1;
					}
					try {
						int insideTime = Integer.parseInt(time);
						System.out.println(
								"\"" + insideTime + "\"" + "是数字" + "\n" + "-------------------------------------");
					} catch (NumberFormatException c) {
						System.out.println("\"" + time + "\"" + " 不是数字或太大了，最大的数目是 : " + Long.MAX_VALUE);
						d += 1;
					}
					System.out.println("此内容有 " + d + " 个字母" + "\n" + "-------------------------------------");
				} finally {

					System.out.println("你用了此程序 " + i++ + " 次" + "\n" + "-------------------------------------");
					goTo = true;
					main(null);
					break;

				}
			} else if (time.length() == 0) {
				System.out.println("请输入数字");
			}
		}
	}
}
