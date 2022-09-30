package ciphers;

import java.util.Scanner;

public class Atbash {

    public void atbashCoder() {

        System.out.println("Szyfrowanie wiadomości za pomocą szyfru Atbash");
        System.out.println("Podaj tekst do zaszyfrowania: ");
        Scanner scanner = new Scanner(System.in);
        String abc = scanner.nextLine();
        StringBuilder coder = new StringBuilder();
        for (char c : abc.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar = ('z' - c) + 'a';
                coder.append((char) newChar);
            } else {
                coder.append(c);
            }
        }
        System.out.println("Tekst po zaszyfrowaniu Atbash" + coder);
        System.out.println();
    }

    public void atbashDecoder() {

        System.out.println("Deszyfrowanie wiadomości szyfrowanej szyfrem Atbash");
        System.out.println("Podaj tekst do odszyfrowania: ");
        Scanner scanner = new Scanner(System.in);
        String abc = scanner.nextLine();
        StringBuilder coder = new StringBuilder();
        for (char c : abc.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar = ('a' - c) + 'z';
                coder.append((char) newChar);
            } else {
                coder.append(c);
            }
        }
        System.out.println("Tekst po odszyfrowaniu Atbash: " + coder);
        System.out.println();
    }
}
