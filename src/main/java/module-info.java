module com.example.pr10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr10 to javafx.fxml;
    exports com.example.pr10;
}