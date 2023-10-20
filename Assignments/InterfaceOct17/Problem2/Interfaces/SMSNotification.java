package Assignments.InterfaceOct17.Problem2.Interfaces;

import Assignments.InterfaceOct17.Problem2.Interfaces.NotificationSender;

public interface SMSNotification extends NotificationSender {
    void setPhoneNumber(String phoneNumber);
}
