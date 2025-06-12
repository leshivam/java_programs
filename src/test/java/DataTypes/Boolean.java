package DataTypes;

public class Boolean {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean hasFunds = false;

        if (isLoggedIn) {
            System.out.println("User is logged in.");
        } else {
            System.out.println("User is not logged in.");
        }

        // Check account balance logic
        if (!hasFunds) {
            System.out.println("Insufficient balance.");
        }

        // Boolean from a comparison
        int age = 25;
        boolean isAdult = age >= 18;
        System.out.println("Is Adult? " + isAdult);
    }
}
}
