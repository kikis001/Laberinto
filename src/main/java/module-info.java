module com.example.laberinto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laberinto to javafx.fxml;
    exports com.example.laberinto;
}