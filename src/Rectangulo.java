import java.util.concurrent.ThreadLocalRandom;
public class Rectangulo {
    int x0;
    int y0;
    int x1;
    int y1;
    public Rectangulo(int x0, int y0){
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = ThreadLocalRandom.current().nextInt(x0, 1000);
        this.y1 = ThreadLocalRandom.current().nextInt(y0, 1000);
    }
}
