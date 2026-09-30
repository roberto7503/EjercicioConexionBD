module org.example.ejercicioconexionbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.ejercicioconexionbd to javafx.fxml;
    opens org.example.ejercicioconexionbd.model to javafx.base;
    exports org.example.ejercicioconexionbd;
    exports org.example.ejercicioconexionbd.controller to javafx.fxml;
    opens org.example.ejercicioconexionbd.controller to javafx.fxml;
}