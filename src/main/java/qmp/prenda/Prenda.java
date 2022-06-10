package qmp.prenda;

public class Prenda {
    String nombre;
    TipoPrenda tipo;
    Material material;
    Trama trama;
    Col colorPrimario;
    Col colorSecundario;
    Integer tempMaxima;
    public Prenda(String nombre, TipoPrenda tipo, Material material, Col colorPrimario, Trama trama, Col colorSecundario, Integer tempMaxima) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
        this.tempMaxima = tempMaxima;
    }
    public CategoriaPrenda getCategoria() {
        return this.tipo.categoria();
    }

    public Col getColorPrimario() {
        return this.colorPrimario;
    }

    public Material getMaterial() {
        return this.material;
    }

    public TipoPrenda getTipo() {
        return this.tipo;
    }

    public Trama getTrama() {return this.trama; }

    public Boolean esDeCategoria(CategoriaPrenda categoria) {
        return this.getCategoria() == categoria;
    }

    public Boolean esTemperaturaApta(Integer temperatura) {
        return this.tempMaxima > temperatura;
    }

}



