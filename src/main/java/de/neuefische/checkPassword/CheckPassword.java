package de.neuefische.checkPassword;

public class CheckPassword {

    public static void main(String[] args) {
        System.out.println(validate( "asdfW"));
    }

    public static String validate(String choosedPassword) {

        String containNumers;
        String containUpperCases;
        String containLowerCases;

        String passwordLength = "Passwortlänge: " + Integer.toString(choosedPassword.length());

        boolean checkNumbers = choosedPassword.matches(".*[0-9].*");

        if(checkNumbers) {
            containNumers = "Dein Passwort enthält Zahlen!";
        } else {
            containNumers = "Dein Passwort enthält keine Zahlen!";
        }

        boolean checkUpper = choosedPassword.matches(".*[A-Z].*");

        if (checkUpper) {
            containUpperCases = "Dein Passwort enthält Großbuchstaben!";
        } else {
            containUpperCases = "Dein Passwort enthält keine Großbuchstaben!";
        }

        boolean checkLower = choosedPassword.matches(".*[a-z].*");

        if (checkLower) {
            containLowerCases = "Dein Passwort enthält Kleinbuchstaben!";
        } else {
            containLowerCases = "Dein Passwort enthält keine kleinbuchstaben!";
        }


        //String output = passwordLength + "\n" + containNumers + "\n" + containUpperCases + "\n" + containLowerCases;
        String output = passwordLength + "\n" + containNumers;

        return output;
    }
}
