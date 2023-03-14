module com.example.exerciciosarrays {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciosarrays to javafx.fxml;
    exports com.example.exerciciosarrays;
}