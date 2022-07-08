package lk.ijse.hostel.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.hostel.bo.BOFactory;
import lk.ijse.hostel.bo.BOType;
import lk.ijse.hostel.bo.custom.LoginBO;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;

public class LoginFormController {

    public AnchorPane loginContext;
    public TextField txtUserName;
    public Button btnLogin;
    public Button btnCancel;
    public PasswordField pwdPassword;
    public Label lblWrongLogin;

    private final LoginBO loginBO = (LoginBO) BOFactory.getInstance().getBO(BOType.LOGIN);

    public void LoginOnAction(ActionEvent actionEvent) throws IOException, SQLException, ClassNotFoundException {

        if (pwdPassword.getText().equals(loginBO.search(txtUserName.getText()).getPassword())){
            Stage stage=(Stage) loginContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(LoginFormController.class.getResource("../view/DashboardForm.fxml"))));
            stage.centerOnScreen();
            stage.centerOnScreen();
            stage.show();

        }else {

            btnLogin.setDisable(true);
        }
        txtUserName.clear();
        pwdPassword.clear();

    }

    public void cancelOnAction(ActionEvent actionEvent) throws IOException {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you Sure", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> buttonType = alert.showAndWait();

        if (buttonType.get().equals(ButtonType.YES)) {
            Stage stage = (Stage) loginContext.getScene().getWindow();
            stage.close();

            URL resource = getClass().getResource("../sample/HostelManagementSystem.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage1 = new Stage();
            stage1.setScene(scene);


            stage1.centerOnScreen();

            stage1.show();
        }
    }
}
