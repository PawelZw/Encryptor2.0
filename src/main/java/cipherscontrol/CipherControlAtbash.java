package cipherscontrol;

import ciphers.Atbash;

import java.util.Scanner;

public class CipherControlAtbash {

    private static final int SELECT_ATBASH_ENCRYPTION = 0;
    private static final int SELECT_ATBASH_DECRYPTION = 1;
    private static final int EXIT = 2;


    public void controlLoopAtbash() {
        int option;
        Scanner scanner = new Scanner(System.in);


        do {
            printOptions();
            option = scanner.nextInt();
            switch (option) {
                case SELECT_ATBASH_ENCRYPTION:
                    atbashCoder();
                    break;
                case SELECT_ATBASH_DECRYPTION:
                    atbashDecoder();
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
        System.out.println(SELECT_ATBASH_ENCRYPTION + "  wybierz szyfrowanie Atbash");
        System.out.println(SELECT_ATBASH_DECRYPTION + "  wybierz deszyfrowanie Atbash");
        System.out.println(EXIT + " - powrót do menu głównego");
    }
    public void atbashCoder() {
        Atbash atbash = new Atbash();
        atbash.atbashCoder();
    }

    public void atbashDecoder() {
        Atbash atbash1 = new Atbash();
        atbash1.atbashDecoder();
    }

    private void exit() {
        System.out.println("Menu główne");

    }
}
