package com.springcore.standole.collection;


import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String, Integer> friendsCount;

    public void setFriendsCount(Map<String, Integer> friendsCount) {
        this.friendsCount = friendsCount;
    }

    public Map<String, Integer> getFriendsCount() {
        return this.friendsCount;
    }
    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
    public List<String> getFriends() {
        return friends;
    }
    public Person() {
        super();
    }
    @Override
    public String toString() {
        return "Person [friends=" + friends + "] and friendsCount=" + friendsCount;
    }
}

