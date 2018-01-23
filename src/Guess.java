import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int guess = 150;
        int n = 0;

        while(n != guess){
            System.out.println("Podaj liczbę: ");
            n = sc.nextInt();
            if (n > 200){
                System.out.println("Podana liczba jest powyżej górnego limitu: 200");
            } else if(n < 100){
                System.out.println("Podana liczba jest poniżej dolnego limitu: 100");
            } else if(n%3 != 0){
                System.out.println("Podana liczba jest niepodzielna przez 3.");
            } else if(n > guess) {
                System.out.println("Podana liczba jest za duża.");
            } else if (n < guess){
                System.out.println("Podana liczba jest za mała.");
            } else {
                System.out.println("Twoja liczba jest OK");
            }
        }
    }
}
