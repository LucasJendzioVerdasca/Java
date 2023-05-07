module com.isep.hpah.core {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    exports com.isep.hpah.core.views.JAVAFXexample;

    opens com.isep.hpah.core.views.JAVAFXexample to javafx.fxml;
}
