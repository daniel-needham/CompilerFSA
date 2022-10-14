import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            FiniteStateAutomata.binaryIsDivisbileByThree(scanner.next());
        }
    }
}