module com.example.exerciciosloops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciosloops to javafx.fxml;
    exports com.example.exerciciosloops;
}