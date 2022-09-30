package cipherscontrol;

import ciphers.Caesar;

import java.util.Scanner;

public class CipherControlCaesar {


    private static final int SELECT_CAESAR_ENCRYPTION = 0;
    private static final int SELECT_CAESAR_DECRYPTION = 1;
    private static final int EXIT = 2;


    public void controlLoopCaesar() {
        int option;
        Scanner scanner = new Scanner(System.in);


        do {
            printOptions();
            option = scanner.nextInt();
            switch (option) {
                case SELECT_CAESAR_ENCRYPTION:
                    caesarCoder();
                    break;
                case SELECT_CAESAR_DECRYPTION:
                    caesarDecoder();
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
        System.out.println(SELECT_CAESAR_ENCRYPTION + "  wybierz szyfrowanie cezar");
        System.out.println(SELECT_CAESAR_DECRYPTION + "  wybierz deszyfrowanie cezar");
        System.out.println(EXIT + " - Powrót do menu głównego");
    }
    public void caesarCoder() {
        Caesar caesar = new Caesar();
        caesar.caesarCoder();

    }

    public void caesarDecoder() {
        Caesar caesar1 = new Caesar();
        caesar1.caesarDecoder();

    }

    private void exit() {
        System.out.println("Menu główne ");


    }
}
