package qmp;
public class Borrador {
    String nombre;
    TipoPrenda tipo;
    Material material;
    Trama trama;
    Col colorPrimario;
    Col colorSecundario;
    public Borrador() {
        this.trama = Trama.LISA;
    }

    public void setColorPrimario(Col colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setColorSecundario(Col colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(TipoPrenda tipo) {
        this.tipo = tipo;
    }
    public void setTrama(Trama trama) {
        this.trama = trama;
    }

    public Prenda construirPrenda() {
        if (this.nombre == null) throw new NullPointerException("La prenda debe tener un nombre.");
        if (this.trama == null) throw new NullPointerException("La prenda debe tener una trama.");
        if (this.colorPrimario == null) throw new NullPointerException("La prenda debe tener un color primario.");
        if (this.material == null) throw new NullPointerException("La prenda debe tener un material.");
        if (this.tipo == null) throw new NullPointerException("La prenda debe tener un tipo.");

        return new Prenda(this.nombre, this.tipo, this.material, this.colorPrimario, this.trama, this.colorSecundario);
    }
}
