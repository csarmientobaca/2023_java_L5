package PlayerFiles;


public class Image extends Doc implements Bright, Show{
    private int brightness = 2;

    public Image(String docTitle) {
        super();
        System.out.println("img");
    }
    public Image(String docTitle, int preferredBrightness) {
        this(docTitle);
        brightness = preferredBrightness;
    }
    @Override
    public void show() {
        Doc.convert(title, brightness, "*");
        System.out.println("\n");
    }
    @Override
    public void plusBright() {
        ++brightness;
    }
    @Override
    public void lessBright() {
        --brightness;
    }
    @Override
    public String toString() {
        return  "title: " + title +"bright= " + brightness;
    }
}
