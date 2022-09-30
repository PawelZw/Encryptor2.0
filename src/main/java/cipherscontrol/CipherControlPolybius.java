package cipherscontrol;

import ciphers.Polybius;

import java.util.Scanner;

public class CipherControlPolybius {


    private static final int SELECT_POLYBIUS_ENCRYPTION = 0;
    private static final int SELECT_POLYBIUS_DECRYPTION = 1;
    private static final int EXIT = 2;


    public void controlLoopPolybius() {
        int option;
        Scanner scanner = new Scanner(System.in);


        do {
            printOptions();
            option = scanner.nextInt();
            switch (option) {
                case SELECT_POLYBIUS_ENCRYPTION:
                    polybiusCoder();
                    break;
                case SELECT_POLYBIUS_DECRYPTION:
                    polybiusDecoder();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while (option != EXIT);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(SELECT_POLYBIUS_ENCRYPTION + "  wybierz szyfrowanie polibiusz");
        System.out.println(SELECT_POLYBIUS_DECRYPTION + "  wybierz deszyfrowanie polibiusz");
        System.out.println(EXIT + " powrót do menu głównego");
    }
    public void polybiusCoder() {
        Polybius polybius = new Polybius();
        polybius.polybiusCoder();
    }

    public void polybiusDecoder() {
        Polybius polybius1 = new Polybius();
        polybius1.polybiusDecoder();
    }

    private void exit() {
        System.out.println("Menu główne");

    }
}
