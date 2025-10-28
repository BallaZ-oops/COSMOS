module com.example.cosmos2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cosmos2 to javafx.fxml;
    exports com.example.cosmos2;
}