module com.mycompany.it92.hien {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.it92.hien to javafx.fxml;
    exports com.mycompany.it92.hien;
}
