module com.dtn.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires lombok;

    opens com.dtn.quizapp to javafx.fxml;
    exports com.dtn.quizapp;
}

