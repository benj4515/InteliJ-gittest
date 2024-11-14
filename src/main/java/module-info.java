module dk.easv.demoprojectgittest {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demoprojectgittest to javafx.fxml;
    exports dk.easv.demoprojectgittest;
}