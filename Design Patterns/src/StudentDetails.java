import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        String[] phoneNumbers = new String[10];

        // Input names and phone numbers of students
        System.out.println("Enter the names and phone numbers of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Phone Number: ");
            phoneNumbers[i] = sc.nextLine();
        }

        // Input the name to search
        System.out.print("Enter the name to search: ");
        String nameToSearch = sc.nextLine();

        // Binary search to find the index of the name in the names array
        int low = 0;
        int high = names.length - 1;
        int mid;
        int index = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (names[mid].equals(nameToSearch)) {
                index = mid;
                break;
            } else if (names[mid].compareTo(nameToSearch) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Print the name and phone number if found
        if (index != -1) {
            System.out.println("Name: " + names[index]);
            System.out.println("Phone Number: " + phoneNumbers[index]);
        } else {
            System.out.println("Name not found");
        }
    }
}
