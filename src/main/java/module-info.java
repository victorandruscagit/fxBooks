module md.vitalie.fxbooks {
    requires javafx.controls;
    requires javafx.fxml;


    opens md.vitalie.fxbooks to javafx.fxml;
    exports md.vitalie.fxbooks;
}