package ovning;

import java.util.Scanner;

public class forString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int y = 1; y <=10; y++) {
            System.out.println("skriv ett ord sen se vad som händer om man skriver ägg\n" +
                    "om du vill stopa skriv stop");
            String myText = (scan.nextLine());

            if(myText.equals("stop")){
                System.out.println("oke :C");
                break;
            }

            for (int i = 0; i < myText.length(); i++) {

                if (myText.equals("ägg")) {
                    System.out.println("ägg är knasigt");
                    break;
                }
                System.out.println(myText.charAt(i));

            }
        }
    }
}
