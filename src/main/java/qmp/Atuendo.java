package qmp;

public class Atuendo {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  Prenda accesorio;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda accesorio, Prenda calzado) {
    this.accesorio = accesorio;
    this.calzado = calzado;
    this.prendaInferior = prendaInferior;
    this.prendaSuperior = prendaSuperior;
  }

  public Prenda getAccesorio() {
    return accesorio;
  }

  public Prenda getCalzado() {
    return calzado;
  }

  public Prenda getPrendaInferior() {
    return prendaInferior;
  }

  public Prenda getPrendaSuperior() {
    return prendaSuperior;
  }
}
