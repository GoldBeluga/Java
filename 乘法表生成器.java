import java.math.BigInteger;
import java.util.Scanner;

public class test {
    private static int i = 1;
    private static String time;
    private static String howMany;
    private static int d;
    private static boolean goTo = true;
    private static Scanner sc = new Scanner(System.in);

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
                        // 如果没有任何错误将会运转Try语句，如果有“NumberFormatException”的错误，将会运行Catch的语句
                        BigInteger howMany1 = BigInteger.valueOf(Integer.parseInt(howMany));
                        BigInteger time1 = BigInteger.valueOf(Integer.parseInt(time));
                        if ((howMany1.longValue() < 1 || time1.longValue() < 1)
                                || (howMany1.longValue() < 1 && time1.longValue() < 1)) {
                            System.out.println("-------------------------------------" + "\n" + "请输入大于\"0\"的数字" + "\n"
                                    + "-------------------------------------");
                        } else if (!((howMany1.longValue() < 1 || time1.longValue() < 1)
                                || (howMany1.longValue() < 1 && time1.longValue() < 1))) {

                            long box = 1l;
                            System.out.println("\n" + "   (1到" + time + ")乘" + howMany + "的乘法表" + "\n"
                                    + "-------------------------------------");
                            do {

                                System.out.println("     " + box + " 乘 " + howMany + " = " + box * howMany1.longValue()
                                        + "\n" + "-------------------------------------");
                                box++;

                            } while (box < time1.longValue() + 1);
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
                            System.out.println("\"" + howMany + "\"" + " 不是数字");
                            System.out.println("");
                            d += 1;
                        }
                        try {
                            int insideTime = Integer.parseInt(time);
                            System.out.println(
                                    "\"" + insideTime + "\"" + "是个数字" + "\n" + "-------------------------------------");
                        } catch (NumberFormatException c) {
                            System.out.println(
                                    "\"" + time + "\"" + "不是个数字" + "\n" + "-------------------------------------");
                            d += 1;
                        }
                        System.out.println("此内容有 " + d + " 个不是字母" + "\n" + "-------------------------------------");
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
                    // 如果没有任何错误将会运转Try语句，如果有“NumberFormatException”的错误，将会运行Catch的语句
                    BigInteger howMany1 = BigInteger.valueOf(Integer.parseInt(howMany));
                    BigInteger time1 = BigInteger.valueOf(Integer.parseInt(time));
                    if ((howMany1.longValue() < 1 || time1.longValue() < 1)
                            || (howMany1.longValue() < 1 && time1.longValue() < 1)) {
                        System.out.println("-------------------------------------" + "\n" + "请输入大于\"0\"的数字" + "\n"
                                + "-------------------------------------");
                    } else if (!((howMany1.longValue() < 1 || time1.longValue() < 1)
                            || (howMany1.longValue() < 1 && time1.longValue() < 1))) {

                        long box = 1l;
                        System.out.println("\n" + "   (1到" + time + ")乘" + howMany + "的乘法表" + "\n"
                                + "-------------------------------------");
                        do {

                            System.out.println("     " + box + " 乘 " + howMany + " = " + box * howMany1.longValue()
                                    + "\n" + "-------------------------------------");
                            box++;

                        } while (box < time1.longValue() + 1);
                        System.out.println("");

                    }
                } catch (NumberFormatException a) {
                    try {
                        int insideHowMany = Integer.parseInt(howMany);
                        System.out.println("");
                        System.out.println("\"" + insideHowMany + "\"" + " 是数字");
                    } catch (NumberFormatException b) {
                        System.out.println("");
                        System.out.println("\"" + howMany + "\"" + " 不是数字");
                        d += 1;
                    }
                    try {
                        int insideTime = Integer.parseInt(time);
                        System.out.println(
                                "\"" + insideTime + "\"" + "是数字" + "\n" + "-------------------------------------");
                    } catch (NumberFormatException c) {
                        System.out
                                .println("\"" + time + "\"" + "不是数字" + "\n" + "-------------------------------------");
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
