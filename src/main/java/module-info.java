module eu.hansolo.colors {
    // Java
    requires java.base;

    // Java-FX
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;

    exports eu.hansolo.colors;
}