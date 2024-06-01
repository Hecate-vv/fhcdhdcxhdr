module app.pplab7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.pplab7 to javafx.fxml;
    exports app.pplab7;
}