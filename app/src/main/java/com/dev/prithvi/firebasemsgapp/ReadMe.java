package com.dev.prithvi.firebasemsgapp;

public class ReadMe {
    /**
     *Message Types:
     * > Notification Message :: These are handled by the FCM SDK automatically.
     *      ->messages contain a predefined set of user-visible keys
     *      ->
     * > Data Message :: which are handled by the client app. (Make sure that you do not use any reserved words in your custom key-value pairs.)
     *      ->Data messages, by contrast, contain only your user-defined custom key-value pairs.
     *      ->Notification messages can contain an optional data payload.
     *      ->Custom set of Keys
     *      ->Limited to 4Kb in size.
     *      ->Sent Programmatically.
     *
     *->Maximum payload for both message types is 4000 bytes,
     *
     * NOTE::
     * -->Use notification messages when you want FCM to handle displaying a notification on your
     * -->client app's behalf. Use data messages when you want to process the messages on your client app.
     *
     * --->Notification messages are delivered to the notification tray when the app is in the background
     * --->For apps in the foreground, messages are handled by a callback function.
     *
     * $$->When in the background, apps receive the notification payload in the notification tray,
     * $$->and only handle the data payload when the user taps on the notification.
     * $$->When in the foreground, your app receives a message object with both payloads available.
     */
}
