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
    // definir otros colores particulares.
}
