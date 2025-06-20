package vistas; 
// Esta línea indica en qué "paquete" está esta clase.
// Un paquete es una forma de organizar tus archivos Java (como carpetas).

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
// Estas líneas importan las clases necesarias para crear una tabla con scroll (barra de desplazamiento).

public class TablaPanel extends JScrollPane {
    // Aquí estamos creando una clase llamada TablaPanel.
    // Esta clase "hereda" de JScrollPane, lo que significa que se comportará como un JScrollPane (un panel con scroll).

    public TablaPanel() {
        // Este es el constructor de la clase.
        // El constructor es un método especial que se ejecuta automáticamente cuando creamos un nuevo objeto de esta clase.

        String[] columnas = { "ID", "Nombre", "Edad" };
        // Aquí estamos creando un arreglo de String con los nombres de las columnas de la tabla.
        // Estos serán los títulos que se verán en la parte superior de la tabla.

        Object[][] datos = {
            { 1, "Ana", 20 },
            { 2, "Luis", 22 },
            { 3, "María", 19 }
        };
        // Aquí estamos creando una matriz (arreglo de arreglos) con los datos que se mostrarán en la tabla.
        // Cada fila representa una persona con su ID, nombre y edad.

        DefaultTableModel base = new DefaultTableModel(datos, columnas);
        // Aquí estamos creando un "modelo de tabla", que le dice a la tabla qué datos debe mostrar y cómo están organizados.

        JTable tabla = new JTable(base);
        // Creamos una tabla con ese modelo.
        // JTable es el componente que realmente dibuja la tabla en pantalla.

        this.setViewportView(tabla);
        // Aquí usamos `this` para referirnos al objeto actual (la instancia de TablaPanel, que es un JScrollPane).
        // Le decimos que la vista que se mostrará dentro del scroll será la tabla que creamos.
        // Esto permite que la tabla tenga barras de desplazamiento si los datos no caben en pantalla.
    }
}
