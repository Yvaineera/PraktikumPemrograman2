package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prak6 Rayfha");
        TableView table = new TableView();
        TableColumn<Mahasiswa, String>
                column1 = new TableColumn<>("Nama");
        column1.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );
        TableColumn<Mahasiswa, String>
                column2 = new TableColumn<>("NIM");
        column2.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );
        table.getColumns().add(column1);
        table.getColumns().add(column2);

        table.getItems().add(new Mahasiswa("Rayfha", "2210817220020"));
        table.getItems().add(new Mahasiswa("Zafira", "2210817220021"));
        table.getItems().add(new Mahasiswa("Az-zahra", "2210817220022"));
        table.getItems().add(new Mahasiswa("Yvaineera", "2210817220023"));
        table.getItems().add(new Mahasiswa("Yvaine", "2210817220024"));
        table.getItems().add(new Mahasiswa("Lyra", "2210817220025"));
        table.getItems().add(new Mahasiswa("Duzzi", "2210817220026"));
        table.getItems().add(new Mahasiswa("Seraphine", "2210817220027"));
        table.getItems().add(new Mahasiswa("Jiwoo", "2210817220028"));
        table.getItems().add(new Mahasiswa("Hyeju", "2210817220029"));

        VBox box = new VBox(table);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
