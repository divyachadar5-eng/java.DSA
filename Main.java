import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] entry = new int[T];
        int[] exit = new int[T];

        for (int i = 0; i < T; i++) {
            entry[i] = sc.nextInt();
        }

        for (int i = 0; i < T; i++) {
            exit[i] = sc.nextInt();
        }

        int guests = 0;
        int maxGuests = 0;

        for (int i = 0; i < T; i++) {
            guests = guests + entry[i] - exit[i];
            if (guests > maxGuests) {
                maxGuests = guests;
            }
        }

        System.out.println(maxGuests);
    }
}