package Assignments.InterfaceOct17.Problem2.Classes;

import Assignments.InterfaceOct17.Problem2.Interfaces.SMSNotification;

public class SMSNotificationSender implements SMSNotification {
    @Override
    public void setPhoneNumber(String phoneNumber) {
        System.out.println("Send SMS to: " + phoneNumber);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS message: " + message);
    }
}
