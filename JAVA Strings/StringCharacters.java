import java.util.Scanner;

public class StringCharacters {

    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Characters using user-defined method:");

        for (char c : userArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");

        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nArrays are same: "
                + compareArrays(userArray, builtInArray));
    }
}