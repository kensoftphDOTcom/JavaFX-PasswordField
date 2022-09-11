module com.kensoftph.passwordfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.passwordfield to javafx.fxml;
    exports com.kensoftph.passwordfield;
}