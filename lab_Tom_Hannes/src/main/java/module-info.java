module team_spitfire.lab_tom_hannes {
    requires javafx.controls;
    requires javafx.fxml;

    opens team_spitfire.lab_tom_hannes to javafx.fxml;
    exports team_spitfire.lab_tom_hannes;
}
