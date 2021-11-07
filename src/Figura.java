public abstract class Figura {
    String nombre;
    String colorBorde;
    String colorFondo;
    Rectangulo rectangulo;
    public Figura(String nombre, Rectangulo rectangulo) {
        this.nombre = nombre;
        this.rectangulo = rectangulo;
        this.colorBorde = "Negro";
        this.colorFondo = "Blanco";
    }
    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }
    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }
    public String toString() {
        return this.nombre + ", dimensiones:" + rectangulo.x0 + "-" + rectangulo.y0 + ", " + rectangulo.x1 + "-" + rectangulo.y1 + ", color de borde: " + this.colorBorde + ", color de fondo: " + this.colorFondo;
    }
}
