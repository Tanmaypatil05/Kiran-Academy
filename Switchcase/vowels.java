package Switchcase;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args){

        Scanner t =new Scanner(System.in);
        System.out.print("Enter the Alphabet:- ");
        char vowel = t.next().charAt(0);

        switch (vowel) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(vowel + " is a vowel");
                break;

            default:
                System.out.println(vowel + " is not a vowel");

        }
    }
}
