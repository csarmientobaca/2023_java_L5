package PlayerFiles;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Scanner;

public class Player {
//	String title;

	
	public static Scanner scan = new Scanner(System.in);

    private static ArrayList<Doc> docArr = new ArrayList<Doc>();

	
	
	public static void main(String[] args) {
		System.out.println("Cosa vuoi fare?...");
		playing();
	
	}
	private static void playing() {
		System.out.println("1 = img");
		System.out.println("2 = audio");
		System.out.println("3 = vid");
		String title;
		int light;
		int volume;
		int lenght;
		 switch (scan.nextInt()) {
         case 0:
             System.out.println("stop playing");
         case 1:
             System.out.println("img ");
             title = titleAdd();
             System.out.println("set brightness? y/n");
             String answer = scan.next();
             if (Objects.equals(answer, "y")) {
                 light = setBright();
                 System.out.println("ok!");

                 Image i = new Image(title, light);
                 docArr.add(i);
             } else {
                 System.out.println("nope");
                 Image i = new Image(title);
                 docArr.add(i);
             }
             break;
//         case 2:
//             System.out.println("| Perfect, let's add a new Audio:   |");
//             title = titleAdd();
//             System.out.println("| Would you like to set a personal volume to the audio? y/n |");
//             answer = scan.next();
//             if (Objects.equals(answer, "y")) {
//                 volume = askForVolume();
//                 length = askForLength();
//                 System.out.println("| Perfect!                      |");
//                 Audio a = new Audio(title, length, volume);
//                 fileArray.add(a);
//             } else {
//                 System.out.println("Okay then.");
//                 length = askForLength();
//                 Audio a = new Audio(title, length);
//                 fileArray.add(a);
//             }
//             break;
//         case 3:
//             System.out.println("| Perfect, let's add a new Video:   |");
//             title = titleAdd();
//             length = askForLength();
//             System.out.println("| Perfect!                      |");
//             Video v = new Video(title, length);
//             fileArray.add(v);
//             break;
         default:
             System.out.println("not a correct number");
             break;

     }
		
	}

	private static String titleAdd() {
        System.out.println("add title: ");
        return scan.next();
    }
	
	private static int setBright() {
		
	        System.out.println("set bright 1 to 10: ");
	        int bright = 0;
	        boolean okay = true;
	        while (okay) {
	            if (scan.hasNextInt()) {
	                bright = scan.nextInt();
	            } else {
	                System.out.println("| Unfit type of input, please insert an integer |");
	                scan.next();
	                continue;
	            }
	            okay = false;
	        }
	        return bright;
	}
}
