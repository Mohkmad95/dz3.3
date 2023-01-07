import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double number[] = {1.2, 3.6, 2.0, 3.3, 5.1, 7.2, 4.1, 3.6, 8.2, -10.9, -11.7, -2.4, -4.1, 55.2};
        double summa = 0;
        int col = 0;
        boolean prover = false;
        for (double forEach : number) {
            if (forEach < 0) {
                prover = true;
            } else if (forEach > 0 && prover) {
                summa += forEach;
                col++;
                System.out.println(forEach);

            }
        }
        System.out.println("Арефметическое число" + summa / col);

    }


}










