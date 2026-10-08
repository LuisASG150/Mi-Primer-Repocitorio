module org.ejemlpos.pryectojvafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.ejemlpos.pryectojvafx to javafx.fxml;
    exports org.ejemlpos.pryectojvafx;
}