package de.neuefische.checkPassword;

public class CheckPassword {

    public static void main(String[] args) {

        String[] passwords = {"Ab123456789", "A123456789", "AA123456789"};
        System.out.println(validate( passwords));
    }


    public static String validate(String[] choosedPasswords) {

        boolean validPassword = false;
        String output ="";

        for (int i = 0; i < choosedPasswords.length; i++) {

            boolean passwordLength = false;

            if (choosedPasswords[i].length() >= 11) {

                passwordLength = true;
                boolean checkNumbers = choosedPasswords[i].matches(".*[0-9].*");
                boolean checkUpper = choosedPasswords[i].matches(".*[A-Z].*");
                boolean checkLower = choosedPasswords[i].matches(".*[a-z].*");

                if (checkNumbers && checkUpper && checkLower) {
                    validPassword = true;
                    output = "Dein Passwort ist sicher!";
                } else {
                    output = "Dein Passwort muss Großbuchstaben, Kleinbuchstaben und Ziffern enthalten!";
                }
            } else {
                output = "Dein Passwort ist zu kurz!";
            }
        }
        return output;
    }
}
