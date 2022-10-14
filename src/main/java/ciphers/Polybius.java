package ciphers;

import java.util.Scanner;

public class Polybius {

    static char[][] table = new char[5][5];

    static void createTable()
    {
        for(int i = 0; i < 2; i++ )
            for(int j = 0; j< 5; j++) {
                if(i*5+j+65!=74)
                    table[i][j]= (char)(i*5+j+65);
            }
        table[1][4]= 'K';
        for(int i = 2; i < 5 ; i++)
            for(int j = 0; j < 5 ; j++)
                table[i][j]=(char)(i*5+j+65+1);
    }

    static String encrypt(String pt) {
        String encpt = "";
        char[] encpt1 = pt.toCharArray();
        for (int i = 0; i < pt.length(); i++) {
            for (int j = 0; j < 5; j++)
                for (int k = 0; k < 5; k++) {
                    if (encpt1[i] == 'J') {
                        encpt = encpt + "24";
                        break;
                    }
                    if (table[j][k] == encpt1[i]) {
                        encpt = encpt + Integer.toString(j + 1) + Integer.toString(k + 1);
                        break;
                    }
                }
        }
        return encpt;
    }
    static String decrypt(String encpt) {
        String decpt = "";
        char[] decpt1 = encpt.toCharArray();
        for(int i = 0; i < encpt.length(); i = i + 2) {
            int row = Integer.parseInt(String.valueOf(decpt1[i]));
            int col = Integer.parseInt(String.valueOf(decpt1[i+1]));
            decpt = decpt + Character.toString(table[row-1][col-1]);
        }
        return decpt;
    }

    public void polybiusCoder() {
        String pt;
        String encpt;
        System.out.println("Funkcja szyfrująca polibiusz");
        System.out.println("Podaj tekst do zaszyfrowania: ");
        Scanner scanner = new Scanner(System.in);
        pt = scanner.nextLine().toUpperCase();
        createTable();
        encpt = encrypt(pt);
        System.out.println("Tekst po zaszyfrowaniu Polibiusz:   " + encpt);
        System.out.println();

    }
    public void polybiusDecoder() {
        System.out.println("Funkcja deszyfrująca Polibiusz");

        String tp;
        String decpt;
        System.out.println("Deszyfrowanie wiadomości zakodowanej szyfrem Polibiusza ");
        System.out.println("Podaj tekst do odszyfrowania:  ");
        Scanner scanner = new Scanner(System.in);
        tp = scanner.nextLine().toUpperCase();
        createTable();
        String decpt1 = decrypt(tp);
        decpt = encrypt(tp);
        System.out.println("Tekst po odszyfrowaniu Polibiusz  " + decpt1.toLowerCase());
        System.out.println();
    }
}
