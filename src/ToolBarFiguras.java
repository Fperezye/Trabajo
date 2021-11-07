public class ToolBarFiguras implements IToolBarFiguras{
    //public Figura createFigura(FiguraDTO dto){
        //Figura figura = this.toolBarFiguras.map(dto, Figura.class);
    //}
    public void createFigura(Lienzo lienzo, String formaFigura, Rectangulo rectangulo){
        if(formaFigura.equalsIgnoreCase("Rayo")){
            Figura figura = new Rayo("Rayo", rectangulo);
            System.out.println(figura);
            lienzo.addFigura(figura);
        } else if(formaFigura.equalsIgnoreCase("Corazon")){
            Figura figura = new Corazon("Corazon", rectangulo);
            lienzo.addFigura(figura);
        } else if(formaFigura.equalsIgnoreCase("Estrella")){
            Figura figura = new Estrella("Estrella", rectangulo);
            lienzo.addFigura(figura);
        }
    }
}
