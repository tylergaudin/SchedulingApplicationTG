package model;

import java.time.ZoneId;

public class User {

    private int id;
    private String userName;
    private String password;
    private ZoneId timeZone;

    public User(int id, String userName, String password, ZoneId timeZone){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.timeZone = timeZone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ZoneId getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(ZoneId timeZone) {
        this.timeZone = timeZone;
    }
}
