module team_spitfire.lab_tom_hannes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens team_spitfire.lab_tom_hannes to javafx.fxml;
    exports team_spitfire.lab_tom_hannes;
}
