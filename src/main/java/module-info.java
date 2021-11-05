module com.mycompany.tareaprog_peliculas_grupo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.mycompany.tareaprog_peliculas_grupo1 to javafx.fxml;
    exports com.mycompany.tareaprog_peliculas_grupo1;
}
