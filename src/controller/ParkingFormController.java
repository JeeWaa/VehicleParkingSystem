package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ParkingFormController {
    public JFXComboBox parkingComboBox;
    public TableView tableView;
    public TableColumn vehicleNumberColumn;
    public TableColumn vehicleTypeColumn;
    public TableColumn parkingSlotColumn;
    public TableColumn parkedTimeColumn;
    public JFXButton logOutButton;
    public JFXButton addVehicleButton;
    public JFXButton addDriverButton;

    public void initialize() {
        loadComboBox();
    }

    private void loadComboBox() {
        parkingComboBox.getItems().addAll("In Parking", "On Delivery");
    }

    public void addVehicle(MouseEvent mouseEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../views/VehicleForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void addDriver(MouseEvent mouseEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../views/DriverForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void logOut(MouseEvent mouseEvent) {
        final Node node = (Node) mouseEvent.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }
}
