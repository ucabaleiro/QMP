package qmp.prenda;
public class Borrador {
    String nombre;
    TipoPrenda tipo;
    Material material;
    Trama trama;
    Col colorPrimario;
    Col colorSecundario;
    Integer tempMaxima;
    public Borrador() {
        this.trama = Trama.LISA;
    }

    public Borrador setColorPrimario(Col colorPrimario) {
        this.colorPrimario = colorPrimario;
        return this;
    }

    public Borrador setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public Borrador setColorSecundario(Col colorSecundario) {
        this.colorSecundario = colorSecundario;
        return this;
    }

    public Borrador setTempMaxima(Integer tempMaxima) {
    this.tempMaxima = tempMaxima;
    return this;
    }

    public Borrador setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Borrador setTipo(TipoPrenda tipo) {
        this.tipo = tipo;
        return this;
    }
    public Borrador setTrama(Trama trama) {
        this.trama = trama;
        return this;
    }

    public Prenda construirPrenda() {
        if (this.nombre == null) throw new NullPointerException("La prenda debe tener un nombre.");
        if (this.trama == null) throw new NullPointerException("La prenda debe tener una trama.");
        if (this.colorPrimario == null) throw new NullPointerException("La prenda debe tener un color primario.");
        if (this.material == null) throw new NullPointerException("La prenda debe tener un material.");
        if (this.tipo == null) throw new NullPointerException("La prenda debe tener un tipo.");
        if (this.tempMaxima == null) throw new NullPointerException("La prenda debe tener una temperatura maxima.");

        return new Prenda(this.nombre, this.tipo, this.material, this.colorPrimario, this.trama, this.colorSecundario, this.tempMaxima);
    }
}
