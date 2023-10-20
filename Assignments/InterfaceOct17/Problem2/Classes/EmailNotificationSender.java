package Assignments.InterfaceOct17.Problem2.Classes;

import Assignments.InterfaceOct17.Problem2.Interfaces.EmailNotification;
import Assignments.InterfaceOct17.Problem2.Interfaces.NotificationSender;

public class EmailNotificationSender implements NotificationSender, EmailNotification {
    @Override
    public void setRecipients(String recipient) {
        System.out.println("Send Email to: " + recipient);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email message: " + message);
    }


}
