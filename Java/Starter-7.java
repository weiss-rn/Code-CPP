public class Main {
    /* Java program to demonstrate the use of instance variables
    and how to access them within the main method.*/
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Main obj = new Main();
        int sum = obj.a + obj.b;
        System.out.println("The sum of a and b is: " + sum);
    }
}
