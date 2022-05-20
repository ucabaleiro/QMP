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
}
