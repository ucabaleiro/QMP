package qmp;

import java.util.Optional;
import java.util.Objects;

public class Prenda {
    private String nombre;

    TipoPrenda tipo;

    Material material;

    private Col colorPrimario;
    private Optional<Col> colorSecundario;

    public Prenda(String nombre, TipoPrenda tipo, Material material, Col colorPrimario) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre de la prenda es obligatorio");
        this.tipo = Objects.requireNonNull(tipo, "El tipo de la prenda es obligatorio");
        this.material = Objects.requireNonNull(material, "El material de la prenda es obligatorio");
        this.colorPrimario = Objects.requireNonNull(colorPrimario, "El color de la prenda es obligatorio");
        this.colorSecundario = Optional.ofNullable(null);
    }

    public void anadirColorSecundario(Col colorSecundario) {
        this.colorSecundario = Optional.ofNullable(colorSecundario);
    }

    public CategoriaPrenda getCategoria() {
        return tipo.getCategoria();
    }

    public Col getColorPrimario() {
        return colorPrimario;
    }

    public Material getMaterial() {
        return material;
    }

    public TipoPrenda getTipo() {
        return tipo;
    }

}



