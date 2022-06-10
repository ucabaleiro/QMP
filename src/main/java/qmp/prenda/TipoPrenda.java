package qmp.prenda;

public enum TipoPrenda {
    ZAPATO(CategoriaPrenda.CALZADO),
    VESTIDO(CategoriaPrenda.SUPERIOR),
    COLLAR(CategoriaPrenda.ACCESORIO),
    CAMISA(CategoriaPrenda.SUPERIOR),
    CORBATA(CategoriaPrenda.ACCESORIO);
    // Anadir mas.
    CategoriaPrenda categoria;

    private TipoPrenda(CategoriaPrenda categoria) {
        this.categoria = categoria;
    }
    public CategoriaPrenda categoria() {
        return this.categoria;
    }

}

