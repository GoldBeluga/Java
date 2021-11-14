import java.util.Scanner;

public class test {
    private static int i = 1;
    private static String time;
    private static String howMany;
    private static int d;
    private static boolean goTo = true;
    private static Scanner sc = new Scanner(System.in);

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
                        long howMany1 = Integer.parseInt(howMany);
                        long time1 = Integer.parseInt(time);
                        if ((howMany1 < 1 || time1 < 1) || (howMany1 < 1 && time1 < 1)) {
                            System.out.println("请输入大于\"0\"的数字" + "\n" + "-------------------------------------");
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
                            System.out.println("\"" + insideHowMany + "\"" + " is a number");
                        } catch (NumberFormatException b) {
                            System.out.println("\"" + howMany + "\"" + " is not a number");
                            d += 1;
                        }
                        try {
                            int insideTime = Integer.parseInt(time);
                            System.out.println("\"" + insideTime + "\"" + "is a number" + "\n"
                                    + "-------------------------------------");
                        } catch (NumberFormatException c) {
                            System.out.println("\"" + time + "\"" + "is not a number" + "\n"
                                    + "-------------------------------------");
                            d += 1;
                        }
                        if (d == 1) {
                            System.out.println("The content inside has " + d + " letter" + "\n"
                                    + "-------------------------------------");
                        } else if (d > 1) {
                            System.out.println("The content inside has " + d + " letters" + "\n"
                                    + "-------------------------------------");
                        }
                    } finally {
                        if (i > 1) {
                            System.out.println("You use this function " + i++ + " times" + "\n"
                                    + "-------------------------------------");
                        } else if (i == 1) {
                            System.out.println(
                                    "You use this function 1 time" + "\n" + "-------------------------------------");
                            i++;
                        }
                    }
                } else if (time.length() == 0) {
                    System.out.println("Plese enter a number");
                    goTo = false;
                    continue;
                }

            } else if (howMany.length() == 0) {
                System.out.println("Plese enter a number");
            }
        }

        while (!goTo) {
            d = 0;
            System.out.println("多少次");
            time = sc.nextLine();
            if (time.length() > 0) {
                try {
                    // 如果没有任何错误将会运转Try语句，如果有“NumberFormatException”的错误，将会运行Catch的语句
                    long howMany1 = Integer.parseInt(howMany);
                    long time1 = Integer.parseInt(time);
                    if ((howMany1 < 1 || time1 < 1) || (howMany1 < 1 && time1 < 1)) {
                        System.out.println("请输入大于\"0\"的数字" + "\n" + "-------------------------------------");
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
                        System.out.println("\"" + insideHowMany + "\"" + " is a number");
                    } catch (NumberFormatException b) {
                        System.out.println("\"" + howMany + "\"" + " is not a number");
                        d += 1;
                    }
                    try {
                        int insideTime = Integer.parseInt(time);
                        System.out.println("\"" + insideTime + "\"" + "is a number" + "\n"
                                + "-------------------------------------");
                    } catch (NumberFormatException c) {
                        System.out.println("\"" + time + "\"" + "is not a number" + "\n"
                                + "-------------------------------------");
                        d += 1;
                    }
                    if (d == 1) {
                        System.out.println("The content inside has " + d + " letter" + "\n"
                                + "-------------------------------------");
                    } else if (d > 1) {
                        System.out.println("The content inside has " + d + " letters" + "\n"
                                + "-------------------------------------");
                    }
                } finally {
                    if (i > 1) {
                        System.out.println("You use this function " + i++ + " times" + "\n"
                                + "-------------------------------------");
                        goTo = true;
                        main(null);
                        break;
                    } else if (i == 1) {
                        System.out.println(
                                "You use this function 1 time" + "\n" + "-------------------------------------");
                        i++;
                        goTo = true;
                        main(null);
                        break;
                    }
                }
            } else if (time.length() == 0) {
                System.out.println("Plese enter a number");
            }
        }
    }
}
