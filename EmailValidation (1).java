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
private static boolean containsAtSymbol(String email) {
return email.contains("@");
}
private static boolean hasDotAfterAt(String email) {
int indexOfAt = email.indexOf("@");
return email.indexOf(".", indexOfAt) != -1;
}
private static boolean isAtFirstOrLast(String email) {
int indexOfAt = email.indexOf("@");
return indexOfAt == 0 || indexOfAt == email.length() - 1;
}
private static boolean hasCharsBeforeAndAfterAt(String email) {
int indexOfAt = email.indexOf("@");
return indexOfAt > 0 && indexOfAt < email.length() - 1;
}
private static boolean isValidEmail(String email) {
if (containsAtSymbol(email) && hasDotAfterAt(email) && !isAtFirstOrLast(email) &&
hasCharsBeforeAndAfterAt(email)) {
    return true;
}

return false;

}
}

    