package Assignments.InterfaceOct17.Problem2.Classes;

import Assignments.InterfaceOct17.Problem2.Interfaces.PushNotification;

public class PushNotificationSender implements PushNotification {

    @Override
    public void sendPushNotification() {
        System.out.println("New Notification...");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification Message: " + message);
    }
}
