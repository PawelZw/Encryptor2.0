package application;

import ciphers.*;

import java.util.List;
import java.util.Scanner;

public class CipherMenu {

    private List<Cipher> ciphers = List.of(new Atbash(), new Bacon(), new Caesar(), new Polybius());

    private void printMenu() {
        System.out.println("Select cipher");
        for ( int i =0 ; i < ciphers.size() ; i ++) {
            System.out.println((i+1) + ". " + ciphers.get(i).getName());
        }
    }

    public Cipher getCipherFromUser() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if( option > 0 && option <= ciphers.size()) {
            return ciphers.get(option -1 );
        } else {
            return null;
        }
    }
}
