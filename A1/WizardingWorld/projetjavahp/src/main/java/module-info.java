module com.isep.hpah.core {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    exports com.isep.hpah.core.views.JAVAFXexample;
    exports com.isep.hpah.core.views.Introduction;

    opens com.isep.hpah.core.views.JAVAFXexample to javafx.fxml;
    opens com.isep.hpah.core.views.Introduction to javafx.fxml;
    opens com.isep.hpah.core.views.controllers to javafx.fxml;
}
