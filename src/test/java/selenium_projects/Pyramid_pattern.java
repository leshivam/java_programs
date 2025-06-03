package selenium_projects;

public class Pyramid_pattern {
    public static void main(String[] args) {
        System.out.println("\n2. Pyramid pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int space = i; space < rows; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
