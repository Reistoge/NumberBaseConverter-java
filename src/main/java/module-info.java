module com.example.numberbaseconverterjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.numberbaseconverterjava to javafx.fxml;
    exports com.example.numberbaseconverterjava;
}