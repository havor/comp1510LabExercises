package lab10;

public class Foo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No argument offered!");
        } else {
            int x = 0;
            System.out.println("The numbers offered: ");
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
                x += Integer.parseInt(args[i]);
                }
            int average = x / args.length;
            System.out.println();
            System.out.println("Average: " + average);
            }
        }
}
