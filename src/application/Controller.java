package application;

import application.model.user_login;
import connectifity.ConnectionClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Font;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Font x1;

    @FXML
    private TableView<user_login> table_user_login;

    @FXML
    private TableColumn<user_login, String> cell_username;

    @FXML
    private TableColumn<user_login, Button> cell_action;

    @FXML
    private TableColumn<user_login, String> cell_no;

    @FXML
    private TableColumn<user_login, String> cell_password;


    @FXML
    void hoverMenu(ActionEvent event) {

    }

    @FXML
    void exitHoverMenu(ActionEvent event) {

    }


    private void initTable(){
        initCols();
    }

    private void initCols(){
        cell_no.setCellValueFactory( new PropertyValueFactory<>("id"));
        cell_username.setCellValueFactory( new PropertyValueFactory<>("username"));
        cell_password.setCellValueFactory( new PropertyValueFactory<>("password"));
        cell_action.setCellValueFactory( new PropertyValueFactory<>("getUpdate"));
        editButton();
    }

    private void editButton(){

    }

    private void createTable(){
        ObservableList<user_login> table_data_user = FXCollections.observableArrayList();

        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        try{
            String selectData = "SELECT * FROM login";
            PreparedStatement preparedStatement = connection.prepareStatement(selectData);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                table_data_user.add(new user_login(
                    rs.getString("username"),
                    rs.getString("username"),
                    rs.getString("password"),
                    new Button("update")
                ));
            }
//            if (rs.next()){
//                System.out.println();
//                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
//                    table_data_user.add(new user_login(
//                            String.,
//                            rs.getString("username"),
//                            rs.getString("password"),
//                            new Button("update")
//                    ));
//                }
//            }
        }catch (Exception e){}

        table_user_login.setItems(table_data_user);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTable();
        createTable();


    }
}
