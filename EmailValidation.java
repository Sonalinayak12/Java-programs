import java.util.Scanner;
public class EmailValidation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an email address: ");
String email = scanner.nextLine();
if (isValidEmail(email)) {
    System.out.println("Valid email address.");

} else {

System.out.println("Invalid email address.");
}
scanner.close();
}
// Function to check if email contains "@" symbol
private static boolean containsAtSymbol(String email) {
return email.contains("@");
}
// Function to check if email has at least one "." after the "@"
private static boolean hasDotAfterAt(String email) {
int indexOfAt = email.indexOf("@");
return email.indexOf(".", indexOfAt) != -1;
}
// Function to check if "@" is the first or last character in the email
private static boolean isAtFirstOrLast(String email) {
int indexOfAt = email.indexOf("@");
return indexOfAt == 0 || indexOfAt == email.length() - 1;
}
// Function to check if there is at least one character before and after the "@"
private static boolean hasCharsBeforeAndAfterAt(String email) {
int indexOfAt = email.indexOf("@");
return indexOfAt > 0 && indexOfAt < email.length() - 1;
}
// Main function for email validation
private static boolean isValidEmail(String email) {
// Check all conditions using helper functions
if (containsAtSymbol(email) && hasDotAfterAt(email) && !isAtFirstOrLast(email) &&
hasCharsBeforeAndAfterAt(email)) {
    return true;
}

return false;

}
}
