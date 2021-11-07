public class ToolBarColores implements IToolBarColores {
    public void pintarBorde (Figura figura, String colorBorde){
        if(!colorBorde.equals("")){
            figura.setColorFondo(colorBorde);
            System.out.println("Se ha cambiado el color de fondo: " + figura.toString());
        }
    }
    public void pintarFondo (Figura figura, String colorFondo){
        if(!colorFondo.equals("")){
            figura.setColorFondo(colorFondo);
            System.out.println("Se ha cambiado el color de fondo: " + figura.toString());
        }
    }
}

