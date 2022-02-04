package de.neuefische.checkPassword;

public class CheckPassword {

    public static void main(String[] args) {
        System.out.println(validate( "Ab1123456789"));
    }


    public static boolean validate(String choosedPassword) {

        boolean validPassword = false;
        boolean passwordLength = false;

        if(choosedPassword.length() >= 11) {
            passwordLength = true;
        } else {
            System.out.println("Dein Passwort ist zu kurz!");
        }

        boolean checkNumbers = choosedPassword.matches(".*[0-9].*");
        if(!checkNumbers) {
            System.out.println("Dein Passwort muss Zahlen enthalten!");
        }

        boolean checkUpper = choosedPassword.matches(".*[A-Z].*");
        if (!checkUpper) {
            System.out.println("Dein Passwort muss Großbuchstaben enthalten!");
        }

        boolean checkLower = choosedPassword.matches(".*[a-z].*");
        if (!checkLower) {
            System.out.println("Dein Passwort muss Kleinbuchstaben enthalten!");
        }

        if (passwordLength && checkNumbers && checkUpper && checkLower) {
            validPassword = true;
            System.out.println("Dein Passwort ist sicher!");
        }

        return validPassword;
    }
}
