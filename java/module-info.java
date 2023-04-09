module com.example.mdattempt2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.mdattempt2 to javafx.fxml;
    exports com.example.mdattempt2;
}