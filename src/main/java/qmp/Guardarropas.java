package qmp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropas {
  List<Prenda> prendas;

  public Guardarropas() {
    this.prendas = new ArrayList<>();
  }

  public Atuendo generarSugerencia(){
    List<Prenda> prendasAptasSegunTemoperatura = getPrendasAptasATemperatura();
    Prenda superior = getPrendasSegunCategoria(CategoriaPrenda.SUPERIOR, prendasAptasSegunTemoperatura).stream().findFirst().orElse(null);
    Prenda inferior = getPrendasSegunCategoria(CategoriaPrenda.INFERIOR, prendasAptasSegunTemoperatura).stream().findFirst().orElse(null);
    Prenda accesorio = getPrendasSegunCategoria(CategoriaPrenda.ACCESORIO, prendasAptasSegunTemoperatura).stream().findFirst().orElse(null);
    Prenda calzado = getPrendasSegunCategoria(CategoriaPrenda.CALZADO, prendasAptasSegunTemoperatura).stream().findFirst().orElse(null);

    return new Atuendo(superior, inferior, accesorio, calzado);
  }

  public void cargarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  private List<Prenda> getPrendasSegunCategoria(CategoriaPrenda categoria, List<Prenda> prendas) {
    return prendas.stream().filter(prenda -> prenda.esDeCategoria(categoria)).collect(Collectors.toList());
  }

  private List<Prenda> getPrendasAptasATemperatura() {
    Integer temperatura = ServicioClimaLocator.getInstance().getServicioClima().getTemperatura();
    return prendas.stream().filter(prenda -> prenda.esTemperaturaApta(temperatura)).collect(Collectors.toList());
  }

}
