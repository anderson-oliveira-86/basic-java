package basic.java.util;

public class Util {

    public static void printTitle(String title) {
        String line = "####";
        for (int i = 0; i < title.length(); i++) {
            line = line + "#";
        }
        System.out.println(line + "\n# " + title + " #\n" + line + "\n");
    }
}
