module org.example.simplegui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.simplegui to javafx.fxml;
    exports org.example.simplegui;
}