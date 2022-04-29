package qmp;

import java.util.Optional;
import java.util.Objects;

public class Prenda {
    String nombre;
    TipoPrenda tipo;
    Material material;
    Trama trama;
    Col colorPrimario;
    Col colorSecundario;
    public Prenda(String nombre, TipoPrenda tipo, Material material, Col colorPrimario, Trama trama, Col colorSecundario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
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

}



