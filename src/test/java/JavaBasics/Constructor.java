package JavaBasics;

public class Constructor {
    private int x;
    private int y;

    // Default constructor
    public Constructor() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Constructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display values
    public void display() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        Constructor defaultConstructor = new Constructor();
        defaultConstructor.display();

        Constructor parameterizedConstructor = new Constructor(5, 10);
        parameterizedConstructor.display();
    }
}
