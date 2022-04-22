package qmp;

import java.util.ArrayList;
import java.util.Optional;

public class Guardarropas {
    private ArrayList<Prenda> prendasDisponibles = new ArrayList();

    public void cargarPrenda(String nombre, TipoPrenda tipo, Material material, Col colorPrimario, Optional<Col> colorSecundario) {
        Prenda nuevaPrenda = new Prenda(nombre, tipo, material, colorPrimario);
        if (colorSecundario.isPresent()) {
            nuevaPrenda.anadirColorSecundario(colorSecundario.get());
        }
    }
}
