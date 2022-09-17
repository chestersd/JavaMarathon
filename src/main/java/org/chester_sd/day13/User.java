package org.chester_sd.day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    List <User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        List <User> subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User currentUser: subscriptions) {
           if (currentUser.getUserName().equals(user.getUserName()))
               return true;
        }

        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public String toString() {
        return userName;
    }
}
