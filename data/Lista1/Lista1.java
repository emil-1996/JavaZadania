import java.util.HashMap;

/**
 * Lista 1 Emil Dworniczak
 */
public class Lista1 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        zadanie1();
        System.out.println("Zadanie 2");
        zadanie2();
        System.out.println("Zadanie 3");
        zadanie3("123abc");
    }

    /**
     * Zad 1. FizzBuzz
     */
    public static void zadanie1() {
        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Zad 2. Wyświetlenie na konsoli tabliczki mnożenia
     */
    public static void zadanie2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    /**
     * Zad 3. Korzystanie z metod klasy String i StringBuffer
     *
     * @param text the text
     */
    public static void zadanie3(String text) {

        HashMap<String, String> replaceMap = new HashMap<String, String>();
        replaceMap.put("a", "1");
        replaceMap.put("b", "2");
        replaceMap.put("z", "4");
        replaceMap.put("y", "5");

        String message = "Zaszyfrowany tekst to: ";
        for (String key : replaceMap.keySet()) {
            text = text.replaceAll(key, replaceMap.get(key));
        }
        System.out.println(message + text);
    }
}
