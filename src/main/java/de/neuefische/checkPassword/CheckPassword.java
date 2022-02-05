package de.neuefische.checkPassword;

import java.util.Arrays;

public class CheckPassword {

    public static void main(String[] args) {

        String[] passwords = {"Ab123456789", "A123a", "AA123456789"};
        System.out.println(validate(passwords));
    }


    public static String validate(String[] choosedPasswords) {

        boolean validPassword = false;
        String output ="";

        if (choosedPasswords.length == 0) {
            return output;
        }

        boolean passwordLength = false;

        if (choosedPasswords[choosedPasswords.length - 1].length() >= 11) {

            passwordLength = true;
            boolean checkNumbers = choosedPasswords[choosedPasswords.length - 1].matches(".*[0-9].*");
            boolean checkUpper = choosedPasswords[choosedPasswords.length - 1].matches(".*[A-Z].*");
            boolean checkLower = choosedPasswords[choosedPasswords.length - 1].matches(".*[a-z].*");

            if (checkNumbers && checkUpper && checkLower) {
                validPassword = true;
                output = "Dein Passwort ist sicher!";
            } else {
                output = "Dein Passwort muss Großbuchstaben, Kleinbuchstaben und Ziffern enthalten!";
            }
        } else {
            output = "Dein Passwort ist zu kurz!";
        }

        return validate(Arrays.copyOf(choosedPasswords, choosedPasswords.length -1)) + output;
    }
}
