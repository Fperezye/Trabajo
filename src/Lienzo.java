import java.util.ArrayList;
import java.util.List;
public class Lienzo {
    List<Figura> figuras = new ArrayList<Figura>();
    String selected;
    public void clearSelected(){
        this.selected = "";
        System.out.println("Se ha eliminado la selección anterior");
    }
    public String select(int x, int y){
        for (Figura figura : figuras) {
            if(x > figura.rectangulo.x0 && x< figura.rectangulo.x1 && y > figura.rectangulo.y0 && y < figura.rectangulo.y1){
                this.selected = figura.toString();
                System.out.println("Se ha seleccionado la figura: " + figura);
                return selected;
            }
        }
        return selected;
    }
    public List<Figura> addFigura(Figura figura){
        figuras.add(figura);
        System.out.println("Se ha añadido una nueva figura: " + figura);
        return this.figuras;
    }
    public String getFiguras(){
        return figuras.toString();
    }
}
