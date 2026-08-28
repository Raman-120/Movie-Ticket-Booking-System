package model;

import java.io.Serializable;

public abstract class User implements Serializable {

    private int userId;
    private String userName;
    private String userPassword;
    private String userEmail;

    User(int userId, String userName, String userPassword, String userEmail){
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public int getUserId(){
        return this.userId;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getUserPassword(){
        return this.userPassword;
    }

    public String getUserEmail(){
        return this.userEmail;
    }

    public abstract void showMenu();

}
