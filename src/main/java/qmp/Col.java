package qmp;
public class Col {
    Integer red;
    Integer green;
    Integer blue;
    public Col(Integer red, Integer green, Integer blue) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }
    public static Col ROJO = new Col(255, 0, 0);
    public static Col VERDE = new Col(0, 255, 0);
    // definir otros colores particulares.
}
