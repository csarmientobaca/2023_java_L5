package PlayerFiles;


public class Image extends Doc implements Bright, Show{
    private int brightness = 2;
//private String title="";
    
    
    public Image(String docTitle) {
        super();
        System.out.println("\n");
        System.out.println("this is an img with :");
    }
    public Image(String docTitle, int preferredBrightness) {
        title=docTitle;
        brightness = preferredBrightness;
    }
    @Override
    public void show() {
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
