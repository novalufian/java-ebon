package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class LoginController {

    @FXML
    private TextField password;

    @FXML
    private AnchorPane rootAnchorPane;

    @FXML
    private TextField username;

    @FXML
    private Button btnLogin;

    public void loginAction(ActionEvent actionEvent) {
        String pass = password.getText();
        String uname = username.getText();
        System.out.println(uname + " dan "+ pass);

    }

    @FXML
    public void enterHover() {
//        System.out.println("hover in");
//        btnLogin.setStyle("-fx-background-color: #FFFFFF;");
    }

    @FXML
    public void exitHover() {
//        System.out.println("hover ooouuuutt");
//        btnLogin.setStyle("-fx-background-color: #FFFFFF;");
    }

}
