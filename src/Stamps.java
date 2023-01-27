import java.util.Scanner;

public class Stamps {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many stickers does susan have? ");
        int susanSticker = input.nextInt();
        System.out.println("How many stickers does Jean have? ");
        int jeanSticker = input.nextInt();
        int difference = jeanSticker - susanSticker;
        System.out.println("There is a difference of " + difference + " stickers.");

    }
}
