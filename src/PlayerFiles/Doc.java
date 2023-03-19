package PlayerFiles;


public class Doc {
    protected String title;

    public Doc() {
        System.out.print("added something");
    }
    public Doc(String docTitle) {
        this();
        title = docTitle;
    }

    public static String convert(int n, String y) {
        String converted = "";
        for (int i = 0; i < n; i++) {
            converted += y;
        }
        return converted;
    }

    public static void convert(String title, int n, String y) {
        String converted = "";
        for (int i = 0; i < n; i++) {
            converted += y;
        }
        System.out.println( title + " " + converted);
    }

}
