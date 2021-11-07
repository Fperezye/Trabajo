import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Lienzo lienzo = new Lienzo();
        IToolBarFiguras toolBarFiguras = new ToolBarFiguras();
        IToolBarColores toolBarColores = new ToolBarColores();
        Scanner entradaEscaner = new Scanner (System.in);
        String creaFigura = "Si";
        while(creaFigura.equals("Si")){
            System.out.println("Introduzca por teclado la figura que quiere crear:");
            String figura = "";
            figura = entradaEscaner.nextLine ();
            System.out.println ("Entrada recibida por teclado es: \"" + figura +"\"");
            System.out.println("Introduzca por teclado la posicion 'x' inicial de su figura:");
            String posicionX = "";
            posicionX = entradaEscaner.nextLine ();
            System.out.println ("Entrada recibida por teclado es: \"" + posicionX +"\"");
            System.out.println("Introduzca por teclado la posicion 'y' inicial de su figura:");
            String posicionY = "";
            posicionY = entradaEscaner.nextLine ();
            System.out.println ("Entrada recibida por teclado es: \"" + posicionY +"\"");
            Rectangulo rectangulo = new Rectangulo(Integer.parseInt(posicionX), Integer.parseInt(posicionY));
            toolBarFiguras.createFigura(lienzo, figura, rectangulo);
            System.out.println("Introduzca por teclado el color de borde deseado:");
            String colorBorde = "";
            colorBorde = entradaEscaner.nextLine ();
            System.out.println ("Entrada recibida por teclado es: \"" + colorBorde +"\"");
            toolBarColores.pintarBorde(lienzo.figuras.get(lienzo.figuras.size()-1), colorBorde);
            System.out.println("Introduzca por teclado el color de fondo deseado:");
            String colorFondo = "";
            colorFondo = entradaEscaner.nextLine ();
            System.out.println ("Entrada recibida por teclado es: \"" + colorFondo +"\"");
            toolBarColores.pintarFondo(lienzo.figuras.get(lienzo.figuras.size()-1), colorFondo);
            System.out.println("Quiere crear otra figura?(Si/No)");
            creaFigura = entradaEscaner.nextLine ();
        }
        System.out.println(lienzo.getFiguras());
        System.out.println("Introduzca por teclado la posicion 'x' donde quiere seleccionar:");
        String selectX = "";
        selectX = entradaEscaner.nextLine ();
        System.out.println ("Entrada recibida por teclado es: \"" + selectX +"\"");
        System.out.println("Introduzca por teclado la posicion 'y' donde quiere seleccionar:");
        String selectY = "";
        selectY = entradaEscaner.nextLine ();
        System.out.println ("Entrada recibida por teclado es: \"" + selectY +"\"");
        lienzo.select(Integer.parseInt(selectX), Integer.parseInt(selectY));
        lienzo.clearSelected();
        entradaEscaner.close();
    }
}
