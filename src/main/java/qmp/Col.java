package qmp;

public class Col {
    private int red;
    private int green;
    private int blue;

    public Col(int red, int green, int blue) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public static Col rojo = new Col(255, 0, 0);
    // definir otros colores particulares.
}
