import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int n, r;
        int t1 = 1, t2 = 1, t3 = 1, result;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Bir Sayı Giriniz: ");
        n = sc.nextInt();

        System.out.print("Faktöriyel Kaça Kadar Açılsın: ");
        r = sc.nextInt();

        // RESULT
        for(int i=1; i <= n; i++){
            t1 *= i;
        }

        for(int j=1; j <= r; j++){
            t2 *= j;
        }

        for (int k = 1; k <= (n - r); k++) {
            t3 *= k;
        }

        result = (t1 / (t2 * t3));
        System.out.println("Kombinasyon: " + result);

    }
}
