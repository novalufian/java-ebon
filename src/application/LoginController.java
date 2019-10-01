package application;

import connectifity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginController {

    private Stage curentStage;

    @FXML
    private TextField password;

    @FXML
    private AnchorPane rootAnchorPane;

    @FXML
    private TextField username;

    @FXML
    private Button btnLogin;

    public void loginAction(ActionEvent actionEvent) throws SQLException {
        String pass = password.getText();
        String uname = username.getText();
        System.out.println(uname + " dan "+ pass);

        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        String sql = "INSERT INTO table1 VALUES('"+uname +"')";
        System.out.println(connection);

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        curentStage = Main.getStage();

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        curentStage.setX(bounds.getMinX());
        curentStage.setY(bounds.getMinY());
        curentStage.setWidth(bounds.getWidth());
        curentStage.setHeight(bounds.getHeight());

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
