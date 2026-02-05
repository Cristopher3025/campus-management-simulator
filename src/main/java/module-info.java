module edu.una.datastructures.campus {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.una.datastructures.campus to javafx.fxml;
    exports edu.una.datastructures.campus;
}
