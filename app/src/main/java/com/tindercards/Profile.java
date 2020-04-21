package com.tindercards;

public class Profile {
    int id, age, distance;
    String name, profile_pic;

    public Profile() {
    }

    public Profile(int id, int age, int distance, String name, String profile_pic) {
        this.id = id;
        this.age = age;
        this.distance = distance;
        this.name = name;
        this.profile_pic = profile_pic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }
}
