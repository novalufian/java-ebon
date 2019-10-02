package application.model;

import javafx.scene.control.Button;

public class user_login {

    String id, username, password;
    Button update;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Button getUpdate() {
        return update;
    }

    public void setUpdate(Button update) {
        this.update = update;
    }

    public user_login(String id, String username, String password, Button update) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.update = update;
    }





}
