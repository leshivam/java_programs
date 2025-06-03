package selenium_projects;

public class rightangletriangle {
    public static void main(String[] args) {
        int rows = 5;

        // 1. Right-angled triangle
        System.out.println("1. Right-angled triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
