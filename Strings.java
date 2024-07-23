import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String name = "Rajat";
        // String fullname = "Rajat Kumar";
        // String Sentence = "My name is Rajat Kumar";
        // System.out.println(name);
        // System.out.println(fullname);
        // System.out.println(Sentence);

        Scanner sc = new Scanner(System.in);
        // String Name = sc.nextLine();
        // System.out.println(Name);

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName; // concatenation
        System.out.println(fullName);
        System.out.println(fullName.length());
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        String fName = "Raj";
        String lName = "Raj";

        if (fName.compareTo(lName) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        String ab = fullName.substring(3, 8);
        System.out.println(ab);
    }
}
