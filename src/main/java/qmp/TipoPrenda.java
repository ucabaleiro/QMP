package qmp;

import java.util.Objects;

public class TipoPrenda {
    CategoriaPrenda categoria;

    public TipoPrenda(String nombre, CategoriaPrenda categoria) {
        this.categoria = Objects.requireNonNull(categoria, "La categoria de un tipo es obligatoria.");
    }

    public CategoriaPrenda getCategoria() {
        return categoria;
    }
}

