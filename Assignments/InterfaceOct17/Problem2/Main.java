package Assignments.InterfaceOct17.Problem2;

import Assignments.InterfaceOct17.Problem2.Classes.EmailNotificationSender;
import Assignments.InterfaceOct17.Problem2.Classes.PushNotificationSender;
import Assignments.InterfaceOct17.Problem2.Classes.SMSNotificationSender;

public class Main {
    public static void main(String[] args) {
        EmailNotificationSender emailApp = new EmailNotificationSender();
        SMSNotificationSender smsApp = new SMSNotificationSender();
        PushNotificationSender pushApp = new PushNotificationSender();

        System.out.println();

        emailApp.setRecipients("test@gmail.com");
        emailApp.sendNotification("Hi!! How are you?");

        System.out.println("---------------");

        pushApp.sendPushNotification();
        pushApp.sendNotification("Email Delivered");

        System.out.println();

        smsApp.setPhoneNumber("+1 123-456-789");
        smsApp.sendNotification("Hello Dear!!");

        System.out.println("---------------");

        pushApp.sendPushNotification();
        pushApp.sendNotification("SMS Delivered");






    }
}
