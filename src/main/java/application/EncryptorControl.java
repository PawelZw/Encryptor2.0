package application;

import cipherscontrol.CipherControlAtbash;
import cipherscontrol.CipherControlCaesar;
import cipherscontrol.CipherControlPolybius;

import java.util.Scanner;

public class EncryptorControl {

    CipherControlAtbash cipherControlAtbash = new CipherControlAtbash();
    CipherControlCaesar cipherControlCaesar = new CipherControlCaesar();
    CipherControlPolybius cipherControlPolybius = new CipherControlPolybius();


    private static final int SELECT_POLYBIUS_ENCRYPTOR = 0;
    private static final int SELECT_CAESAR_ENCRYPTOR = 1;
    private static final int SELECT_ATBASH_ENCRYPTOR = 2;
    private static final int EXIT = 3;

    public void controlLoopEncryptor() {
        int option;
        Scanner scanner = new Scanner(System.in);

        do {
            printOptions();
            option = scanner.nextInt();
            switch (option) {
                case SELECT_POLYBIUS_ENCRYPTOR:
                    controlLoopPolybius();
                    break;
                case SELECT_CAESAR_ENCRYPTOR:
                    controlLoopCezar();
                    break;
                case SELECT_ATBASH_ENCRYPTOR:
                    controlLoopAtbash();
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
        System.out.println("Program szyfrujący za pomocą wybranych szyfrów");
        System.out.println("Wybierz jedną z poniższych opcji: ");
        System.out.println(SELECT_POLYBIUS_ENCRYPTOR + "  wybierz szyfr Polibiusz");
        System.out.println(SELECT_CAESAR_ENCRYPTOR + "  wybierz szyfr Cezar");
        System.out.println(SELECT_ATBASH_ENCRYPTOR + "  wybierz szyfr Atbash");
        System.out.println(EXIT + "  wyjście z programu");
    }
    public void controlLoopPolybius() {
        CipherControlPolybius cipherControlPolybius1 = new CipherControlPolybius();
        cipherControlPolybius1.controlLoopPolybius();
    }

    public void controlLoopCezar() {
        CipherControlCaesar cipherControlCaesar1 = new CipherControlCaesar();
        cipherControlCaesar1.controlLoopCaesar();
    }

    public void controlLoopAtbash() {
        CipherControlAtbash cipherControlAtbash1 = new CipherControlAtbash();
        cipherControlAtbash1.controlLoopAtbash();

    }

    private void exit() {
        System.out.println("Koniec programu");


    }
}
