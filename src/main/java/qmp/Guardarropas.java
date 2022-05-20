package qmp;

import java.util.List;
import java.util.stream.Collectors;

public class Guardarropas {
  List<Prenda> prendas;

  public Atuendo generarSugerencia(){
    List<Prenda> prendasAptasSegunTemoperatura = getPrendasAptasATemperatura();
    Prenda superior = getPrendasSegunCategoria(CategoriaPrenda.SUPERIOR, prendasAptasSegunTemoperatura).get(0);
    Prenda inferior = getPrendasSegunCategoria(CategoriaPrenda.INFERIOR, prendasAptasSegunTemoperatura).get(0);
    Prenda accesorio = getPrendasSegunCategoria(CategoriaPrenda.ACCESORIO, prendasAptasSegunTemoperatura).get(0);
    Prenda calzado = getPrendasSegunCategoria(CategoriaPrenda.CALZADO, prendasAptasSegunTemoperatura).get(0);

    return new Atuendo(superior, inferior, accesorio, calzado);
  }

  private List<Prenda> getPrendasSegunCategoria(CategoriaPrenda categoria, List<Prenda> prendas) {
    return prendas.stream().filter(prenda -> prenda.esDeCategoria(categoria)).collect(Collectors.toList());
  }

  private List<Prenda> getPrendasAptasATemperatura() {
    Integer temperatura = ServicioClimaLocator.getInstance().getServicioClima().getTemperatura();
    return prendas.stream().filter(prenda -> prenda.esTemperaturaApta(temperatura)).collect(Collectors.toList());
  }

}
