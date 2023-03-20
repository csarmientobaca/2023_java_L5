package PlayerFiles;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Scanner;

public class Player {
//	String title;

	
	public static Scanner scan = new Scanner(System.in);

    private static ArrayList<Doc> docArr = new ArrayList<Doc>();

	private static String answer;


	
	
	public static void main(String[] args) {
		System.out.println("Cosa vuoi fare?...");
		for(int i=0;i<2;i++) {
			
			playing();
		}
        System.out.println("this is the final array"+ docArr);

	}
	private static void playing() {
		System.out.println("1 = img");
		System.out.println("2 = audio");
		System.out.println("3 = vid");
		String title;
		int light = 0;
		int volume;
		int lenght;
		 switch (scan.nextInt()) {
         case 0:
             System.out.println("stop playing");
             break;
         case 1:
             System.out.println("selected img ");
             title = titleAdd();
             System.out.println("set brightness? y/n");
             answer = scan.next();
             if (Objects.equals(answer, "y")) {
                 light = setBright();
                 System.out.println("ok!");
                 Image i = new Image(title, light);
                 docArr.add(i);
                 System.out.println("Title: " + title + ", Brightness: " + light);
             } else {
                 System.out.println("nope");
                 Image i = new Image(title);
                 docArr.add(i);
                 System.out.println("Title: " + title + ", Brightness: " + light);
             }
             break;
         default:
             System.out.println("not a correct number");
             break;

     }
		
	}

	private static String titleAdd() {
        System.out.println("add title: ");
        String title = "";
        title= scan.next();
        return title;
    }

	private static int setBright() {
		if(answer=="y") {
	        System.out.println("set bright 1 to 10: ");
	       continue;
		}
		 int bright = 0;
	        bright = scan.nextInt();
	        return bright;
	}
			
}
