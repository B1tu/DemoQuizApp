module com.dtn.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.dtn.quizapp to javafx.fxml;
    exports com.dtn.quizapp;
}
