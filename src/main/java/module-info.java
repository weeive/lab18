module com.aip.lab18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aip.lab18 to javafx.fxml;
    exports com.aip.lab18;
}