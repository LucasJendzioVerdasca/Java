module com.isep.hpah.core {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.isep.hpah.core to javafx.fxml;
    exports com.isep.hpah.core;
}
