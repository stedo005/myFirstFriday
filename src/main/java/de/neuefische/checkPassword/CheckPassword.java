package de.neuefische.checkPassword;

public class CheckPassword {

    public static void main(String[] args) {

        String[] passwords = {"Ab123456789", "A123456789", "Ab23456789"};
        System.out.println(validate( passwords));
    }


    public static boolean validate(String[] choosedPasswords) {

        boolean validPassword = false;

        for (int i = 0; i < choosedPasswords.length; i++) {

            boolean passwordLength = false;

            if (choosedPasswords[i].length() >= 11) {

                passwordLength = true;
            } else {
                System.out.println("Dein Passwort ist zu kurz!");
            }

            boolean checkNumbers = choosedPasswords[i].matches(".*[0-9].*");
            if (!checkNumbers) {
                System.out.println("Dein Passwort muss Zahlen enthalten!");
            }

            boolean checkUpper = choosedPasswords[i].matches(".*[A-Z].*");
            if (!checkUpper) {
                System.out.println("Dein Passwort muss Großbuchstaben enthalten!");
            }

            boolean checkLower = choosedPasswords[i].matches(".*[a-z].*");
            if (!checkLower) {
                System.out.println("Dein Passwort muss Kleinbuchstaben enthalten!");
            }

            if (passwordLength && checkNumbers && checkUpper && checkLower) {
                validPassword = true;
                System.out.println("Dein Passwort ist sicher!");
            }

        }

        return validPassword;
    }
}
