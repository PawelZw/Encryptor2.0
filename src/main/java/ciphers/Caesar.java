package ciphers;

import java.util.Scanner;

public class Caesar {

    public void caesarCoder() {
        System.out.println("Szyfrowanie tekstu za pomocą Szyfru cezara");
        System.out.println("Podaj tekst do zaszyfrowania: ");
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine().toUpperCase();
        System.out.println("Podaj klucz szyfrowania (ilość przesunięć): ");
        int n = scanner.nextInt();
        String encrypted = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = (char) (txt.charAt(i) + n);
            if (c > 'Z')
                c -= 26;
            encrypted += c;
        }
        System.out.println("Tekst po zaszyfrowaniu Cezar: " + encrypted);
        System.out.println();

        // scanner.close();
    }
    public void caesarDecoder() {
        System.out.println("Program deszyfrujący wiadomość zakodowana szyfrem Cezara");
        System.out.println("Podaj tekst do odszyfrowania: ");
        Scanner scanner = new Scanner(System.in);
        String opo = scanner.nextLine().toUpperCase();
        System.out.println("Podaj klucz szyfrowania (ilość przesunięć): ");
        int m = scanner.nextInt();
        String decryption = "";
        for (int i = 0; i < opo.length(); i++) {
            char c = (char) (opo.charAt(i) - m);
            if (c < 'A')
                c += 26;
            decryption += c;
        }
        System.out.println("Tekst po odszyfrowaniu Cezar to: " + decryption);
    }
}
