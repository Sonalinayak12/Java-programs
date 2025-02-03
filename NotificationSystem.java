interface Notification {
void sendNotification();
class EmailNotification implements Notification {

private String emailAddress;
public EmailNotification(String emailAddress) {
this.emailAddress = emailAddress;
}
@Override
public void sendNotification() {
System.out.println("Email notification sent to: " + emailAddress);
}
}
class SMSNotification implements Notification {
private String phoneNumber;
public SMSNotification(String phoneNumber) {
this.phoneNumber = phoneNumber;
}
@Override
public void sendNotification() {
System.out.println("SMS notification sent to: " + phoneNumber);
}
}
class PushNotification implements Notification {
private String deviceId;
public PushNotification(String deviceId) {
    this.deviceId = deviceId;

}
@Override
public void sendNotification() {
System.out.println("Push notification sent to device ID: " + deviceId);
}
}
public class NotificationSystem {
public static void main(String[] args) {
Notification emailNotification = new EmailNotification("gripsy@psgrkcw.ac.in");
Notification smsNotification = new SMSNotification("+123456789");
Notification pushNotification = new PushNotification("device123");
emailNotification.sendNotification();
smsNotification.sendNotification();
pushNotification.sendNotification();
}
}